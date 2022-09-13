package bronze_practice

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()

    repeat(n){
        var k = br.readLine().toInt()
        repeat(k){
            print("=")
        }
        println()
    }
}