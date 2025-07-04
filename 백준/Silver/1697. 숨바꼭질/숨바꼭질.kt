import java.util.*

fun main() {
    val (start, target) = readLine()!!.split(" ").map { it.toInt() }
    println(bfs(start, target))
}

fun bfs(start: Int, target: Int): Int {
    val visited = BooleanArray(100001)
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(start, 0))
    visited[start] = true

    while (queue.isNotEmpty()) {
        val (now, count) = queue.poll()

        if (now == target) return count

        val nexts = listOf(now - 1, now + 1, now * 2)
        for (next in nexts) {
            if (next in 0..100000 && !visited[next]) {
                visited[next] = true
                queue.add(Pair(next, count + 1))
            }
        }
    }
    return -1 
}
