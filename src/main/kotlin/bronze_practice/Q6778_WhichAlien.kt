package bronze_practice

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var antenna = br.readLine().toInt()
    var eyes = br.readLine().toInt()
    if(antenna >=3 && eyes<=4) println("TroyMartian")
    if(antenna<=6 && eyes>=2)  println("VladSaturnian")
    if(antenna<=2 && eyes<=3)  println("GraemeMercurian")
}