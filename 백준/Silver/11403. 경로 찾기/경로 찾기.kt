import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val graph = Array(n) { IntArray(n) }
    
    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            graph[i][j] = st.nextToken().toInt()
        }
    }

    for (k in 0 until n) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (graph[i][j] == 0 && (graph[i][k] == 1 && graph[k][j] == 1)) {
                    graph[i][j] = 1
                }
            }
        }
    }

    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append(graph[i][j]).append(" ")
        }
        sb.append("\n")
    }
    print(sb.toString())

    br.close()
}
