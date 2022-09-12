package toss_semitest

fun main(){
    val date = "20220806"
    val requests = arrayOf("김토스,19900605", "이토스,20020729")
    var answer: Int = 0

    var today = getDate(date)

    for(info in requests){
        var (name, strBirth) = info.split(",")
        var birth = getDate(strBirth)
        if(getAge(today, birth)>=19)    answer++
    }
}
class Date(var year:Int, var month:Int, var day: Int)
fun getAge(today:Date, birth:Date):Int{
    var age:Int = today.year - birth.year;
    return if(today.month<birth.month){
        age-1
    }else if(today.month>birth.month){
        age
    }else{
        if(today.day<birth.day) age-1
        else age
    }
}
fun getDate(str:String):Date{
    var date = Date(0,0,0)
    date.year = str.substring(0,4).toInt()
    date.month = str.substring(4,6).toInt()
    date.day = str.substring(6,8).toInt()

    return date
}

