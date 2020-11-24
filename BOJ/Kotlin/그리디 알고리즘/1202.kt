import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

data class Jewel(val m: Int, val v: Int)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (N, K) = readLine().split(" ").map { it.toInt() }
    var res = 0L
    val priorityQueue = PriorityQueue<Int>(Collections.reverseOrder())
    val jewelArr = ArrayList<Jewel>()
    val bagArr = ArrayList<Int>()

    for (i in 0 until N){
        val (m, v) = readLine().split(" ").map { it.toInt() }
        jewelArr.add(Jewel(m, v))
    }

    for (i in 0 until K)
        bagArr.add(readLine().toInt())

    bagArr.sort()
    jewelArr.sortWith(compareBy { it.m })
    var idx = 0

    for (weight in bagArr){
        while (idx < N && weight >= jewelArr[idx].m){
            priorityQueue.add(jewelArr[idx++].v)
        }
        if (priorityQueue.isNotEmpty())
            res += priorityQueue.remove()
    }
    println(res)
}