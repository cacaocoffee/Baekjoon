class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer: Long = 0
        for(x in 0..d step k){
            var y =
            Math.sqrt(d.toDouble()*d.toDouble() 
                      - x.toDouble()*x.toDouble()).toLong()
            answer += y/k+1
        }
        return answer
    }
}