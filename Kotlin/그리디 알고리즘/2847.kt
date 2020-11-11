import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val arr = ArrayList<Int>()
    var res = 0

    for (i in 0 until N){
        arr.add(readLine().toInt())
    }

    for (i in N-2 downTo 0){
        if (arr[i] >= arr[i+1]){
            val temp = arr[i] - arr[i+1] + 1
            res += temp
            arr[i] -= temp
        }
    }

    println(res)
}