class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        included.forEachIndexed { index, boolean->
            if(boolean) answer+= a+(index)*d
        }
        return answer
    }
}