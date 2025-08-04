import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val prefixSum = Array(n + 1) { IntArray(n + 1) }

    for (r in 1..n) {
        st = StringTokenizer(br.readLine())
        for (c in 1..n) {
            val value = st.nextToken().toInt()
            prefixSum[r][c] = value + prefixSum[r - 1][c] + prefixSum[r][c - 1] - prefixSum[r - 1][c - 1]
        }
    }

    val sb = StringBuilder()
    repeat(m) {
        st = StringTokenizer(br.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()

        val sum = prefixSum[x2][y2] - prefixSum[x1 - 1][y2] - prefixSum[x2][y1 - 1] + prefixSum[x1 - 1][y1 - 1]
        sb.append(sum).append("\n")
    }

    print(sb.toString())
}