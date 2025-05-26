import java.util.*

fun main() {
    val (m, n) = readLine()!!.split(" ").map { it.toInt() }
    val box = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toTypedArray() }
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    val dx = arrayOf(-1, 1, 0, 0)
    val dy = arrayOf(0, 0, -1, 1)

    // 익은 토마토(1)를 모두 큐에 넣기
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (box[i][j] == 1) {
                queue.offer(Pair(i, j))
            }
        }
    }

    while (queue.isNotEmpty()) {
        val (x, y) = queue.poll()
        for (dir in 0..3) {
            val nx = x + dx[dir]
            val ny = y + dy[dir]

            if (nx in 0 until n && ny in 0 until m && box[nx][ny] == 0) {
                box[nx][ny] = box[x][y] + 1
                queue.offer(Pair(nx, ny))
            }
        }
    }

    var result = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (box[i][j] == 0) {
                println(-1)
                return
            }
            result = maxOf(result, box[i][j])
        }
    }

    println(result - 1)
}
