import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val s = readLine()
    val sSplit = s.split('-')
    var res = 0
    val temp = sSplit[0].split('+')
    for (i in temp){
        res += i.toInt()
    }

    if (sSplit.size > 1){
        for (i in 1 until sSplit.size){
            val t = sSplit[i].split('+')
            for (j in t){
                res -= j.toInt()
            }
        }
    }

    println(res)
}