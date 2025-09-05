class Solution {
    fun solution(my_string: String): IntArray {
        var answer = mutableListOf<Int>()
        for(i in 'A'..'Z'){
            var count = 0
            my_string.forEach{
                if(it==i ){
                    count++
                }
            }
            answer.add(count)
        }
         for(i in 'a'..'z'){
            var count = 0
            my_string.forEach{
                if(it==i ){
                    count++
                }
            }
            answer.add(count)
        }
        
        return answer.toIntArray()
    }
}