import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var a:Int
    var b:Int

    while(true){
        val st = StringTokenizer(br.readLine())
        a = st.nextToken().toInt()
        b = st.nextToken().toInt()
        if(a==0 && b==0)    break;
        bw.write(if(a>b) "Yes\n" else "No\n")
    }
    bw.flush()
    bw.close()
}