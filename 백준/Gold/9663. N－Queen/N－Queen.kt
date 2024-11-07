fun main() {
    val N = readLine()!!.toInt()
    var count = 0
    
    // 각 열에 퀸이 놓였는지 체크하는 배열
    val cols = BooleanArray(N)
    
    // 왼쪽 아래에서 오른쪽 위로 가는 대각선 체크 (행-열 차이)
    val diag1 = BooleanArray(2 * N - 1)
    
    // 왼쪽 위에서 오른쪽 아래로 가는 대각선 체크 (행+열)
    val diag2 = BooleanArray(2 * N - 1)

    // 재귀를 통한 백트래킹
    fun dfs(row: Int) {
        if (row == N) {
            // 모든 행에 퀸을 놓았으면 카운트 증가
            count++
            return
        }
        
        for (col in 0 until N) {
            if (cols[col] || diag1[row - col + N - 1] || diag2[row + col]) {
                continue  // 현재 위치가 유효하지 않으면 스킵
            }
            
            // 퀸을 놓을 수 있는 위치라면
            cols[col] = true
            diag1[row - col + N - 1] = true
            diag2[row + col] = true
            
            // 다음 행으로 이동
            dfs(row + 1)
            
            // 퀸을 제거하고 다음 위치 시도
            cols[col] = false
            diag1[row - col + N - 1] = false
            diag2[row + col] = false
        }
    }
    
    // 첫 번째 행부터 시작
    dfs(0)
    
    // 결과 출력
    println(count)
}
