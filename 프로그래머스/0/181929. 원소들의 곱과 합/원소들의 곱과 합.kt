class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var a1:Int =1
        var a2:Int =0
        num_list.forEach{ 
            a1= a1*it
            a2+=it}
        
        a2=a2*a2
        if( a1 <a2) return 1
        return answer
    }
}