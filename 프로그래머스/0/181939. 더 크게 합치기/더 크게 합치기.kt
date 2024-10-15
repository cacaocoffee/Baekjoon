class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer1= (a.toString() + b.toString()).toInt()
        var answer2= (b.toString() + a.toString()).toInt()
        if(answer1>answer2) return answer1
        else return answer2
    }
}