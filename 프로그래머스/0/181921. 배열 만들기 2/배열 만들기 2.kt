class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        (l..r).filter { 
            it.toString().all { c -> c == '0' || c == '5' }
        }.forEach { 
            answer+=it
        }
        if(answer.isEmpty()) answer+= -1
        return answer
    }
}