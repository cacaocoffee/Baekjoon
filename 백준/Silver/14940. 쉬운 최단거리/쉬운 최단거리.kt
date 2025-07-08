import java.util.LinkedList
import java.util.Queue
import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 문제: 지도에서 각 지점으로부터 목표 지점까지의 거리를 계산합니다.
 *
 * 이 함수는 BFS (너비 우선 탐색)를 사용하여 최단 거리를 찾습니다.
 * 가로, 세로 이동만 가능하며, 도달 불가능한 지점은 -1로,
 * 원래 갈 수 없는 땅은 0으로 처리합니다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // N과 M 입력 받기
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    // 지도 데이터 입력 받기
    val grid = Array(n) { IntArray(m) }
    var targetRow = -1
    var targetCol = -1

    for (r in 0 until n) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (c in 0 until m) {
            grid[r][c] = row[c]
            if (grid[r][c] == 2) {
                targetRow = r
                targetCol = c
            }
        }
    }

    // 거리 결과를 저장할 2차원 배열 초기화
    // 모든 값을 -1로 초기화하여 '도달 불가능' 상태로 시작
    val distances = Array(n) { IntArray(m) { -1 } }

    // BFS를 위한 큐 초기화 (Triple: 행, 열, 현재까지의 거리)
    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()

    // 목표 지점 처리: 목표 지점의 거리는 0
    if (targetRow != -1) { // 목표 지점이 항상 존재하지만, 방어적으로 확인
        queue.offer(Triple(targetRow, targetCol, 0))
        distances[targetRow][targetCol] = 0
    }

    // 미리 갈 수 없는 땅(0) 처리: 거리를 0으로 설정
    for (r in 0 until n) {
        for (c in 0 until m) {
            if (grid[r][c] == 0) {
                distances[r][c] = 0
            }
        }
    }

    // 상하좌우 이동을 위한 방향 벡터
    val dr = arrayOf(-1, 1, 0, 0) // 위, 아래
    val dc = arrayOf(0, 0, -1, 1) // 왼쪽, 오른쪽

    while (queue.isNotEmpty()) {
        val (r, c, dist) = queue.poll()

        // 인접한 4방향 탐색
        for (i in 0 until 4) {
            val nr = r + dr[i]
            val nc = c + dc[i]

            // 지도 범위 내에 있고, 갈 수 있는 땅(1)이며, 아직 방문하지 않은(-1) 곳이라면
            if (nr in 0 until n && nc in 0 until m && grid[nr][nc] == 1 && distances[nr][nc] == -1) {
                distances[nr][nc] = dist + 1
                queue.offer(Triple(nr, nc, dist + 1))
            }
        }
    }

    // 결과 출력
    val sb = StringBuilder()
    for (r in 0 until n) {
        for (c in 0 until m) {
            sb.append(distances[r][c]).append(" ")
        }
        sb.append("\n") // 각 행 끝에 줄바꿈 추가
    }
    print(sb.toString()) // 최종 결과 출력
}