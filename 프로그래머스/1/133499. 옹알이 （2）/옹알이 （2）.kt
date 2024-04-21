class Solution {
    fun solution(babbling: Array<String>): Int {
        val ableRegex = "aya|ye|woo|ma".toRegex()
         val unableRegex = "ayaaya|yeye|woowoo|mama".toRegex()
        return babbling.count() {
        !it.contains(unableRegex) && it.replace(ableRegex, "").isEmpty()
    }
    }
}