import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var count = 1

    while (true){
        val (L, P, V) = readLine().split(' ').map { it.toInt() }
        var res = 0

        if (L == 0 && P == 0 && V ==0) break

        res = (V/P) * L + min((V%P), L)

        println("Case ${count}: ${res}")

        count++
    }
}