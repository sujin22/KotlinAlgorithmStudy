import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

//[실3]Q2606 - 바이러스
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    var n = br.readLine().toInt()   //컴퓨터 수
    var m = br.readLine().toInt()   //연결된 쌍의 수

    var list = Array(n+1) { arrayListOf<Int>() }
    var visited = BooleanArray(n+1) { false }

    repeat(m){
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        list[a].add(b)
        list[b].add(a)
    }

    var result: Int = 0
    val q = ArrayDeque<Int>()
    q.add(1)
    visited[1] = true
    while(!q.isEmpty()){
        val now = q.removeFirst()
        for(item in list[now]){
            if(!visited[item]){
                q.add(item)
                result++
                visited[item] = true
            }
        }
    }

    println(result)
}
