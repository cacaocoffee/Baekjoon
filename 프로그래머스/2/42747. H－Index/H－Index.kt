class Solution {
    fun solution(citations: IntArray): Int {
        val sortedCitations = citations.sortedDescending()

        // h-index 찾기
        for (i in sortedCitations.indices) {
            if (sortedCitations[i] <= i) {
                return i
            }
        }

        return citations.size
    }
}
