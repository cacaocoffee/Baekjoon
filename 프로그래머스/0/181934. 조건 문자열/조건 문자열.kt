class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        
        
        if(eq=="="){
            if(ineq=="<") { 
                if(n<=m) answer=1
            }
            else{
                if(n>=m) answer=1
            }
        }
        else{
            if(ineq=="<") { 
                if(n<m) answer=1
            }
            else{
                if(n>m) answer=1
            }
        }
        
        return answer
    }
}