package toss_semitest

import java.util.*
import kotlin.collections.ArrayDeque

fun main(){
    var input: Long = 1100101001
    var result: String = ""
    var unit = arrayOf("", "십", "백", "천", "만", "십", "백", "천", "억", "십", "백", "천", "조")

    var number = input.toString()
    var l = number.length - 1;

    for(i in 0 until number.length){
        var n:Int = number[i] - '0'
        var readResult = readNum(n)
        if(readResult!= ""){
            if(readResult=="일"){
                if(unit[l]!= "천" && unit[l]!= "백" && unit[l]!= "십")
                    result+=readResult
            } else{
                result+=readResult
            }
            result+=unit[l]
        }else{
            if(unit[l] == "만" || unit[l] == "억")
                result+=unit[l]
        }
        l--
    }
    println(result)
}
fun readNum(num: Int):String{
    return when(num){
        1->"일"
        2->"이"
        3->"삼"
        4->"사"
        5->"오"
        6->"육"
        7->"칠"
        8->"팔"
        9->"구"
        else -> ""
    }
}