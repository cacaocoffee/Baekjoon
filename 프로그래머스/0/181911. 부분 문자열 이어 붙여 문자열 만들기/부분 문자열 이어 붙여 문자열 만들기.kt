class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        parts.forEachIndexed{ i, (s,e)->
            answer+=my_strings[i].slice(s .. e)
        }
        return answer
    }
}