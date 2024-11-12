class Solution {
    
    fun solution(n: Int): Long {
        var list = Array<Long>(n+1,{0})
        list[0] = 1L
        list[1] = 1L
        for(i in 2 .. n)
        {
            list[i] = (list[i-1] + list[i-2])%1234567
            
        }
        return list[n]
    }
    
}