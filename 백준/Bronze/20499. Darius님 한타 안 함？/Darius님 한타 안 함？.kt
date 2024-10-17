import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val (k, d, a) = readLine()
        .split("/")
        .map { it.toInt() }

    println(
        if (d == 0) "hasu"
        else {
            when {
                k + a < d || d == 0 -> "hasu"
                else -> "gosu"
            }
        }
    )
}