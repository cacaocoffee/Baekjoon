import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1)

    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }

    var count = 0
    for (i in 1..n) {
        if (!visited[i]) {
            dfs(i, graph, visited)
            count++
        }
    }

    println(count)
}

fun dfs(node: Int, graph: Array<MutableList<Int>>, visited: BooleanArray) {
    visited[node] = true
    for (next in graph[node]) {
        if (!visited[next]) {
            dfs(next, graph, visited)
        }
    }
}
