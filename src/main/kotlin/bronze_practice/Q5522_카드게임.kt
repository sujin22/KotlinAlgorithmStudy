package bronze_practice

import java.io.BufferedReader
import java.io.InputStreamReader


fun main(){
    var sum = 0
    var br = BufferedReader(InputStreamReader(System.`in`))

    repeat(5){
        sum+= br.readLine().toInt()
    }

    println(sum)
}