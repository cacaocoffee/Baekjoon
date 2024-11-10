class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var a = n
        while(a>=10){
            answer+=a%10
            a= a/10
        }
        answer+=a

        return answer
    }
}