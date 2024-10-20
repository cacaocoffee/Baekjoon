class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer= intStrs.filter{it.slice(s until s+l).toInt()>k  }.map{it.slice(s until s+l).toInt()}.toIntArray()
        return answer
    }
}