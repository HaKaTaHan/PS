import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val S = readLine()
    val holders = S.count {it == 'S'} + (S.count {it == 'L'} / 2) + 1

    println(min(N, holders))
}