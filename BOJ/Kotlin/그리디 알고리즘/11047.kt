import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (N, K) = readLine().split(' ').map { it.toInt() }
    val arr = arrayOfNulls<Int>(N)
    var res = 0

    for (i in 0 until N){
        arr[i] = readLine().toInt()
    }

    for (i in N-1 downTo 0){
        if (arr[i]!! > K) continue

        if (K == 0) break

        res += K / arr[i]!!
        K -= (K / arr[i]!!) * arr[i]!!
    }

    println(res)
}