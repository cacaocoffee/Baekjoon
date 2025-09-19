class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        if (x == y) return 0
        val visited = HashSet<Int>()
        val q = ArrayDeque<Pair<Int,Int>>()
        q.addLast(x to 0)
        //q 에 x = 0 페어로 넣어
        
        //방문에 x 를 넣어 
        
        visited.add(x)
    
       // 큐가 비어있지 않아 
       // 그러면 다음 연산들을 수행해보는거야 
        
        while (q.isNotEmpty()) {
            val (cur, cnt) = q.removeFirst() // 가장 첫번째 값을 가져와 
            val nexts = listOf(cur + n, cur * 2, cur * 3) //각 연산들 
            for (next in nexts) {//순서대로 연산 진행 만약다음이 y 라면 +1 로 리턴
                if (next == y) return cnt + 1 
                if (next > y || !visited.add(next)) continue//y 보다 커지면 아님
                q.addLast(next to cnt + 1) // 조건에 부합하면 다음 연산 목록에 넣어보는거지
            }
        }
        return -1
    }
    
}