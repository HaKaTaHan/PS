import java.io.BufferedReader
import java.io.InputStreamReader

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val arr = arrayOfNulls<Type>(N)
    var res = 0

    for (i in 0 until N){
        val (start, end) = readLine().split(' ').map { it.toInt() }
        arr[i] = Type(start, end)
    }

    arr.sortWith(compareBy({it!!.end}, {it!!.start}))
    var temp = arr[0]!!.end
    res += 1
    for (i in 1 until N){
        if (arr[i]!!.start >= temp){
            res += 1
            temp = arr[i]!!.end
        }
    }

    println(res)
}

data class Type(val start:Int, val end:Int)