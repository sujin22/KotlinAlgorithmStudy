package graph_traversal.bfs

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt() //사람 수

    //촌수 계산해야하는 두 사람 번호
    val (a,b) = br.readLine().toString().split(" ").map { it.toInt() }

    val m = br.readLine().toInt() //부모자식 관계 수
    var list = Array(n+1){arrayListOf<Int>()}
    var visited = IntArray(n+1){Int.MAX_VALUE}

    repeat(m){
        val (x,y) = br.readLine().toString().split(" ").map{it.toInt()}
        list[x].add(y)
        list[y].add(x)
    }

    var q = ArrayDeque<Node>()
    q.add(Node(a, 0))
    visited[a] = 0

    while(q.isNotEmpty()){
        val now = q.removeFirst()

        for(item in list[now.item]){
            if(visited[item]>now.depth+1){
                q.add(Node(item, now.depth+1))
                visited[item] = now.depth+1
            }
        }
    }
    println(if(visited[b]==Int.MAX_VALUE) -1 else visited[b])
}
data class Node(var item:Int, var depth:Int)