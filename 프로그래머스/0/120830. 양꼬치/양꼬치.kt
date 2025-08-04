class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 12000*n + 2000*(k  - n/10)
        return answer
    }
}