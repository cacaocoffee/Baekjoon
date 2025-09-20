class Solution {
    fun solution(my_string: String, letter: String): String {
        var answer: String = ""
        my_string.forEach{
            if(it!=letter[0]) answer = "$answer$it"
        }
        return answer
    }
}