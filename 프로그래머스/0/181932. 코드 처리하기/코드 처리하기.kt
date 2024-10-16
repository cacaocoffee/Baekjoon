class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode:Boolean= true
        for (i in 0 until code.length) {  
            if(mode){
                if (code[i] == '1') {
                    mode = !mode  
                } else if (i % 2 == 0) {
                    answer+=code[i]
                }   
            }
            else {
                if (code[i] == '1') {
                    mode = !mode  
                } else if (i % 2 == 1) {
                    answer+=code[i]
                }
            }
        }
        
        return answer
    }
}