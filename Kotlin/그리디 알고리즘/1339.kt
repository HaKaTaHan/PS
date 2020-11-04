import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val alpha = HashMap<Char, Int>()
    var res = 0

    for (i in 0 until N){
        val s = readLine()

        for (j in s.indices){
            if (alpha[s[j]] != null){
                alpha[s[j]] = alpha[s[j]]!!.plus(10.0.pow(s.length - 1 - j).toInt())
            }
            else{
                alpha[s[j]] = 10.0.pow(s.length -1 -j).toInt()
            }
        }
    }
    val alphaList = alpha.toList()
    val sortedArr = alphaList.sortedWith(compareBy { it.second }).reversed()
    var count = 9
    for (i in sortedArr){
        res += i.second * count
        count -= 1
    }

    println(res)
}