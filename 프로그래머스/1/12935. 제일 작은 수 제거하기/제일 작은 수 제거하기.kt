class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var min = 123456789
        arr.forEach{
            if(min>it) min = it
        }
        
        arr.forEach{
            if(it!=min) answer+=it
        }
        if(answer.isEmpty()) answer+=-1
        return answer
    }
}