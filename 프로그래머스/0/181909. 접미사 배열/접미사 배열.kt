class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for(i in 1..my_string.length){
                answer +=my_string.slice(my_string.length-i..my_string.length-1)
        }
        answer.sort()
        return answer
    }
}