class Solution {
    fun solution(x: Int): Boolean {
        var num = 0
        var a = x
        while(a>0){
            num+=a%10
            a=a/10
        }
        return x%num==0
    }
}