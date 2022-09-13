import java.io.BufferedReader
import java.io.InputStreamReader


fun main(){

}
class Person(
    val name:String,
    var age: Int
){
    init{
        if(age<0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name:String):this(name, 1)
}