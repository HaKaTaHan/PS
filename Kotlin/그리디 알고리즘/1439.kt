import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val S = readLine()
    val zeroDivide = S.split('0').filter { it.isNotEmpty() }.size
    val oneDivide = S.split('1').filter { it.isNotEmpty() }.size

    println(min(zeroDivide, oneDivide))
}