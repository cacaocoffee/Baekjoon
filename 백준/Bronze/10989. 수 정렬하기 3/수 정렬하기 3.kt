import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val count = IntArray(10001)

    repeat(n) {
        val num = br.readLine().toInt()
        count[num]++
    }

    val sb = StringBuilder()
    for (i in 1..10000) {
        repeat(count[i]) {
            sb.appendLine(i)
        }
    }
    print(sb)
}
