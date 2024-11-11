class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        val countMap = HashMap<Int, Int>()
        
        tangerine.forEach { size ->
            countMap[size] = countMap.getOrDefault(size, 0) + 1
        }
        
        val sortedCounts = countMap.values.sortedDescending()
        
        var sum = 0
        for (count in sortedCounts) {
            sum += count
            answer++
            if (sum >= k) break
        }
        
        return answer
    }
}
