class Solution {
    fun solution(s: String): String {
        // 문자열을 공백으로 구분한 후 숫자로 변환
        val numbers = s.split(" ").map { it.toLong() }

        // 최솟값과 최댓값을 구함
        val min = numbers.minOrNull() ?: 0L
        val max = numbers.maxOrNull() ?: 0L

        // "min max" 형식으로 반환
        return "$min $max"
    }
}
