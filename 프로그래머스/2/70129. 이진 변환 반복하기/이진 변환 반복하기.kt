class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(2){0}
        var text = s
        while(text!= "1"){
            answer[1] += text.count { it == '0' }
            text= text.replace("0", "")  
            
            answer[0]++
            text=text.length.toString(2)
        }
        return answer
    }
}