class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var s = numbers.sortedDescending()
        answer = s[0]*s[1]
        return answer
    }
}