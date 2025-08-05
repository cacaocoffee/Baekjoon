import java.util.LinkedList
import java.util.StringTokenizer

val dy = intArrayOf(-1, 0, 1, 0, 0, 0)
val dx = intArrayOf(0, 1, 0, -1, 0, 0)
val dz = intArrayOf(0, 0, 0, 0, 1, -1)

fun main() {
    var totalTomatoCnt = 0
    val (m, n, h) = readln().split(" ").map { it.toInt() }
    val map = Array(h) { Array(n) { IntArray(m) } }
    val visited = Array(h) { Array(n) { BooleanArray(m) } }
    val queue = LinkedList<IntArray>()

    for (i in 0 until h) {
        for (j in 0 until n) {
            val st = StringTokenizer(readln())
            for (k in 0 until m) {
                val tomatoStatus = st.nextToken().toInt()
                map[i][j][k] = tomatoStatus

                if (tomatoStatus == 1 || tomatoStatus == 0) {
                    totalTomatoCnt++
                    if (tomatoStatus == 1) {
                        visited[i][j][k] = true
                        queue.offer(intArrayOf(i, j, k))
                    }
                }
            }
        }
    }

    var ripenTomato = queue.size
    if (totalTomatoCnt == ripenTomato) {
        println(0)
        return
    } else if (ripenTomato == 0) {
        println(-1)
        return
    }

    val result = getMaxCntAndDay(map, queue, visited, ripenTomato, totalTomatoCnt)
    val costDay = result[0]
    val cntOfRipen = result[1]
    if (totalTomatoCnt == cntOfRipen) {
        println(costDay)
    } else {
        println(-1)
    }
}

private fun getMaxCntAndDay(
    map: Array<Array<IntArray>>,
    queue: LinkedList<IntArray>,
    visited: Array<Array<BooleanArray>>,
    prevRipenCnt: Int = 0,
    totalTomatoCnt: Int
): IntArray {
    var currentRipenCnt = prevRipenCnt
    var day = 0
    while (queue.isNotEmpty()) {
        day++
        val todayCnt = queue.size
        for (i in 0 until todayCnt) {
            val node = queue.poll()
            for (dIdx in dy.indices) {
                if (node[0] + dz[dIdx] !in visited.indices ||
                    node[1] + dx[dIdx] !in visited[0].indices ||
                    node[2] + dy[dIdx] !in visited[0][0].indices
                ) {
                    continue
                }

                val nextPosition = intArrayOf(
                    node[0] + dz[dIdx],
                    node[1] + dx[dIdx],
                    node[2] + dy[dIdx]
                )
                if (visited[nextPosition[0]][nextPosition[1]][nextPosition[2]] ||
                    map[nextPosition[0]][nextPosition[1]][nextPosition[2]] == 1 ||
                    map[nextPosition[0]][nextPosition[1]][nextPosition[2]] == -1
                ) {
                    continue
                }
                currentRipenCnt++
                visited[nextPosition[0]][nextPosition[1]][nextPosition[2]] = true
                queue.offer(nextPosition)
            }
        }

        if (currentRipenCnt == totalTomatoCnt) {
            break
        }
    }
    return intArrayOf(day, currentRipenCnt)
}