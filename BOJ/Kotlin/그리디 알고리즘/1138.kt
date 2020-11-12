import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val arr = readLine().split(' ').map { it.toInt() }
    val res = arrayOfNulls<Int>(N)

    for (i in 1..N){
        val temp = arr[i-1]
        var count = 0

        for (j in 0 until N){
            if (count == temp && res[j] == null){
                res[j] = i
                break
            }
            if (res[j] == null){
                count ++
            }
        }
    }

    res.forEach { print("$it ") }
}