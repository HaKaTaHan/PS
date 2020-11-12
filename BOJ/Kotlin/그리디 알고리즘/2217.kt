import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val arr = arrayOfNulls<Int>(N)
    var res = 0

    for (i in 0 until N){
        arr[i] = readLine().toInt()
    }

    arr.sort()
    arr.reverse()

    for (i in 0 until N){
        if (arr[i]!! * (i+1) > res){
            res = arr[i]!! * (i+1)
        }
    }

    println(res)
}