import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer
import kotlin.math.max

fun main(): Unit = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dx = arrayOf(0, 0, 1, -1)
    val dy = arrayOf(1, -1, 0, 0)

    val map = Array(n) { Array(n) { 0 } }
    repeat(n) { x ->
        val st = StringTokenizer(readLine())
        repeat(n) { y ->
            map[x][y] = st.nextToken().toInt()
        }
    }

    var maxCnt = 0
	
    // 빗물의 높이 0부터 100까지 모든 높이에 대해 탐색
    for (height in 0..100) {
        var cnt = 0

        val visited = Array(n) { Array(n) { false } }

		// 모든 지점에 대해 BFS 수행
        repeat(n) { x ->
            repeat(n) { y ->
                if (visited[x][y] || map[x][y] <= height) return@repeat

                cnt++

                val q = LinkedList<Pair<Int, Int>>() as Queue<Pair<Int, Int>>
                q.offer(Pair(x, y))
                visited[x][y] = true

                while (q.isNotEmpty()) {
                    val target = q.poll()

                    for (i in 0 until 4) {
                        val nx = target.first + dx[i]
                        val ny = target.second + dy[i]

                        if (nx !in 0 until n || ny !in 0 until n || visited[nx][ny] || map[nx][ny] <= height) continue

                        q.offer(Pair(nx, ny))
                        visited[nx][ny] = true
                    }
                }
            }
        }

        maxCnt = max(maxCnt, cnt)
    }

    println(maxCnt)
}