import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var sum = 0
    repeat(2){
        sum+=br.readLine().toInt()
    }
    println(sum)
}