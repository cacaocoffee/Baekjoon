import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        // 주사위 눈의 개수를 저장하는 배열
        val dice = IntArray(7) // 0~6까지 인덱스, 주사위 눈은 1~6에 해당
        
        // 주사위 눈을 카운트
        dice[a]++
        dice[b]++
        dice[c]++
        dice[d]++

        // 가장 많이 나온 주사위 눈의 개수와 해당 눈
        val maxValue = dice.maxOrNull()!!
        val maxIndex = dice.indexOf(maxValue)
        
        // 케이스별 처리
        return when (maxValue) {
            4 -> 1111 * maxIndex // 동일한 눈이 4개일 때
            3 -> {
                // 세 개가 같고 하나는 다른 경우
                val singleIndex = dice.indexOf(1) // 다른 하나의 눈 찾기
                (10 * maxIndex + singleIndex) * (10 * maxIndex + singleIndex)
            }
            2 -> {
                // 두 개씩 같은 경우 또는 2+1+1의 경우
                val pairs = dice.withIndex().filter { it.value == 2 }.map { it.index }
                if (pairs.size == 2) {
                    // 두 쌍이 있을 경우
                    (pairs[0] + pairs[1]) * abs(pairs[0] - pairs[1])
                } else {
                    // 두 개가 같고 나머지 두 개가 다를 경우
                    val singleIndices = dice.withIndex().filter { it.value == 1 }.map { it.index }
                    singleIndices[0] * singleIndices[1]
                }
            }
            else -> {
                // 모두 다른 경우, 가장 작은 눈 반환
                dice.withIndex().filter { it.value == 1 }.minOf { it.index }
            }
        }
    }
}
