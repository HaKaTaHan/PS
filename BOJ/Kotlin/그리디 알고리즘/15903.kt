import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = PriorityQueue<Long>()

    for (i in readLine().split(' ').map { it.toLong() }){
        arr.add(i)
    }

    for (i in 0 until m){
        val x = arr.remove()
        val y = arr.remove()

        arr.add(x+y)
        arr.add(x+y)
    }

    println(arr.sum())
}