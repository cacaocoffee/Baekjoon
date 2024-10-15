class Solution {
    fun solution(str1: String, str2: String): String {
        return str1.indices.map { i -> "${str1[i]}${str2[i]}" }.joinToString("")
    }
}