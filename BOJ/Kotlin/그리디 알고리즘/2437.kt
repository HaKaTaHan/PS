import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val arr = readLine().split(' ').map { it.toInt() }.sorted()
    var res = 1

    for (i in 0 until N){
        if (res < arr[i]) break
        res += arr[i]
    }

    println(res)
}