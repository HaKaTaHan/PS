import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (N, M) = readLine().split(' ').map { it.toInt() }

    if (N==1) println(1)
    else if (N==2) println(min(4, (M+1)/2))
    else{
        if (M < 7) println(min(4,M))
        else print(M-2)
    }
}