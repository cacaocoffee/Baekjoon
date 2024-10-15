class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
         val sb = StringBuilder(my_string)
        
        for (index in overwrite_string.indices) {
            sb[s + index] = overwrite_string[index]
        }
        
        return sb.toString()
    }
}