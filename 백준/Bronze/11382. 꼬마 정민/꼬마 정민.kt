import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val A = st.nextToken().toLong()
    val B = st.nextToken().toLong()
    val C = st.nextToken().toLong()

    val sum = A + B + C
    println(sum)
}