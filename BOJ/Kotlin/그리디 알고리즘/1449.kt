import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (N, L) = readLine().split(' ').map { it.toInt() }
    val arr = readLine().split(' ').map { it.toInt() }.sorted()
    var res = 0
    var p = 0

    for (i in arr){
        if (p < i){
            p = i+L-1
            res ++
        }
    }

    println(res)
}