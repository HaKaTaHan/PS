import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val s = readLine()
    val UCPC = "UCPC"
    var idx = 0
    for (i in UCPC){
        val temp = s.indexOf(i, idx)
        if (temp == -1){
            println("I hate UCPC")
            exitProcess(0)
        }
        idx = temp
    }
    println("I love UCPC")

}