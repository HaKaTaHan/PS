import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val minusArr = ArrayList<Int>()
    val plusArr = ArrayList<Int>()
    var res = 0

    for (i in 0 until N){
        val num = readLine().toInt()
        if (num <= 0) minusArr.add(num)
        else plusArr.add(num)
    }

    plusArr.sort()
    minusArr.sort()
    minusArr.reverse()

    for (i in 0 until minusArr.size / 2){
        val a = minusArr[minusArr.lastIndex]
        minusArr.removeAt(minusArr.lastIndex)
        val b = minusArr[minusArr.lastIndex]
        minusArr.removeAt(minusArr.lastIndex)

        res += a*b
    }

    for (i in 0 until plusArr.size / 2){
        val a = plusArr[plusArr.lastIndex]
        plusArr.removeAt(plusArr.lastIndex)
        val b = plusArr[plusArr.lastIndex]
        plusArr.removeAt(plusArr.lastIndex)

        res += max(a*b, a+b)
    }

    if (minusArr.isNotEmpty()) res += minusArr[0]
    if (plusArr.isNotEmpty()) res += plusArr[0]

    println(res)
}