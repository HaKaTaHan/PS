import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (N, K) = readLine().split(' ').map { it.toInt() }
    val S = readLine()
    val arr = ArrayList<Char>()
    var count = K
    for (i in S){
        while (count > 0 && arr.isNotEmpty() && arr.last().toInt() < i.toInt()){
            arr.removeAt(arr.lastIndex)
            count --
        }
        arr.add(i)
    }

    for (i in count downTo 1) arr.removeAt(arr.lastIndex)

    println(arr.joinToString(""))
}