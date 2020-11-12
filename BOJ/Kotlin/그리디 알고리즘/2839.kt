import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val arr = ArrayList<Int>()

    for (i in 0..N/5){
        if ((N-i*5) % 3 == 0){
            arr.add(i+(N-i*5) / 3)
        }
    }

    if (arr.size == 0){
        println(-1)
    }
    else{
        println(arr.min())
    }
}