import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    var arr = ArrayList<Int>()
    repeat(3){
        arr.add(st.nextToken().toInt())
    }
    arr.sort()

    for(item in arr){
        print("$item ")
    }

}