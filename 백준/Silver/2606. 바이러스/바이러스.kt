fun main() {
    val n = readLine()!!.toInt() // 컴퓨터 수
    val m = readLine()!!.toInt() // 네트워크 연결 수

    // 그래프 초기화
    val graph = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a) // 양방향 그래프
    }

    // 방문 여부 배열
    val visited = BooleanArray(n + 1)
    var infectedCount = 0

    // DFS 함수
    fun dfs(node: Int) {
        visited[node] = true
        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                infectedCount++
                dfs(neighbor)
            }
        }
    }

    // 1번 컴퓨터에서 시작
    dfs(1)

    // 결과 출력 (1번 컴퓨터를 제외한 감염된 컴퓨터 수)
    println(infectedCount)
}
