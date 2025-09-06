class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 1..n){
            if(i*6%n ==0) return i
        }
        return answer
    }
}