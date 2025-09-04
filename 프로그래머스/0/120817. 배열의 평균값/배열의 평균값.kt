class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = 0
        numbers.forEach{
            sum+=it
        }
        return sum.toDouble() / numbers.size
    }
}