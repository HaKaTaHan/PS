import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val railArr = readLine().split(' ').map { it.toLong() }
    val priceArr = readLine().split(' ').map { it.toLong() }
    var res = 0L
    var now = 1000000001L

    for (i in 0 until N-1){
        if (priceArr[i] < now) now = priceArr[i]
        res += now * railArr[i]
    }

    println(res)
}