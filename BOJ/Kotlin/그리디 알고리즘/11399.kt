import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sum = 0

    val n = readLine().toInt()
    val arr = readLine()
            .split(" ")
            .map { it.toInt() }
            .sorted()

    for (i in 0 until n){
        for (j in 0..i){
            sum += arr[j]
        }
    }

    println(sum)
}