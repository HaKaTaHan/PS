import java.io.BufferedReader
import java.io.InputStreamReader

data class Student(val name:String, val kor:Int, val eng:Int, val math:Int)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val arr = ArrayList<Student>()

    for (i in 0 until N){
        val(n, k, e, m) = readLine().split(" ")
        arr.add(Student(n, k.toInt(), e.toInt(), m.toInt()))
    }

    arr.sortWith(compareBy ({ -it.kor }, { it.eng }, { -it.math }, { it.name }))

    arr.forEach {
        println(it.name)
    }

}