package graph_traversal

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

//[골3]Q7569_토마토
fun main(){
    val dx = listOf(1,-1,0,0,0,0)
    val dy = listOf(0,0,1,-1,0,0)
    val dz = listOf(0,0,0,0,1,-1)

    val br = BufferedReader(InputStreamReader(System.`in`))
    val (M,N,H) = br.readLine().toString().split(" ").map { it.toInt() }

    var graph = Array(H){
        Array(N){
            Array<Int>(M){ 5 }
        }
    }

    var entire = H*N*M
    var cnt = 0

    var q = ArrayDeque<Node>()

    for(h in 0 until H){
        for(n in 0 until N){
            val st = StringTokenizer(br.readLine())
            for(m in 0 until M){
                graph[h][n][m] = st.nextToken().toInt()
                //익은 토마토일 때
                if(graph[h][n][m]==1) q.add(Node(h,n,m))

                //안익은 토마토 아닌 부분 세기
                if(graph[h][n][m]!=0) cnt++

            }
        }
    }

    var days = -1
    while(q.isNotEmpty()){
        val size = q.size
        for(i in 0 until size){
            val now = q.removeFirst()
            for(i in 0 until 6){
                val nextH = now.h+dz[i]
                val nextN = now.n+dx[i]
                val nextM = now.m+dy[i]

                if(nextH in 0 until H
                    && nextN in 0 until N
                    && nextM in 0 until M){
                    if(graph[nextH][nextN][nextM]==0){
                        q.add(Node(nextH, nextN, nextM))
                        graph[nextH][nextN][nextM] = 1
                        cnt++
                    }
                }
            }
        }
        days++
    }
    println(if(cnt==entire) days else -1)
}
class Node(var h:Int, var n:Int, var m:Int)