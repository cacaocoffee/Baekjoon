class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.forEach { (s,e,k) ->
            for(i in s..e){   
                if(i%k==0) answer[i] ++
            }
        }
         
        return answer
    }
}