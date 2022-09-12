package toss_semitest

fun main(){
    var dateOfBirth: String = "001201"
    var phoneNumber: String = "01015994905"
    var inputs = arrayOf("115123", "201890", "949901","010133")

    for(item in inputs){
        println(condition4(item))
    }
    for(item in inputs){
        if(condition1(item) && condition2(item, dateOfBirth) && condition3(item, phoneNumber) && condition4(item) && condition5(item)){

        }
    }

}
fun condition1(str:String): Boolean{
    if(str.length != 6) return false
    for(i in 0 until 6){
        var tmp = str[i]
        if(tmp.toInt()< 48 || tmp.toInt()>57){
            return false
        }
    }
    return true
}
fun condition2(str:String, dateBirth:String):Boolean{
    if(str == dateBirth)   return false
    var year = dateBirth.substring(0,2)
    var month = dateBirth.substring(2,4)
    var day = dateBirth.substring(4,6)

    if(str.contains(month+day)) return false
    return true
}
fun condition3(str:String, phone:String):Boolean{
    var mid = phone.substring(3, 7)
    var end = phone.substring(7, 11)

    if(str.contains(mid))   return false
    if(str.contains(end))   return false
    return true
}
//보수필요
fun condition4(str:String):Boolean{
    var o = 0
    var d = 0
    var p = 0
    var n = 0
    var limit = 3
    for(i in 0 until str.length){
        var tmp = str[i] - '0'
        p = o-tmp
        n = if(p==d) n+1 else 0
        if(i>0 && p>-2 && n> limit-2){
            return true
        }
        d=p
        o=tmp
    }
    return false
}
fun condition5(str: String):Boolean{
    return false
}

