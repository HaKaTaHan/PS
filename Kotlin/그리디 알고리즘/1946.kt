import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val T = readLine().toInt()

    for (i in 0 until T){
        val N = readLine().toInt()
        val arr = arrayOfNulls<Grade>(N)
        var res = 1

        for (m in 0 until N){
            val (paper, com) = readLine().split(' ').map { it.toInt() }
            arr[m] = Grade(paper, com)
        }
        arr.sortWith(compareBy { it!!.paper })

        var min = arr[0]!!.communication
        for (n in 1 until N){
            if (arr[n]!!.communication < min){
                res += 1
                min = arr[n]!!.communication
            }
        }
        println(res)
    }
}

data class Grade(val paper: Int, val communication: Int)