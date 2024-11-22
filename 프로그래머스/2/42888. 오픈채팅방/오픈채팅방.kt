class Solution {
    fun solution(record: Array<String>): Array<String> {
        var answer = arrayOf<String>()
        var user = mutableListOf<String>()
        var oper = mutableListOf<String>()
        var h = hashMapOf<String, String>()
        record.forEach{
            var text = it.split(" ")
             
            
            when(text[0]){
                "Enter"->{
                    h[text[1]]= text[2]
                    user.add(text[1])
                    oper.add("E")
                }
                "Leave"->{
                    user.add(text[1])
                    oper.add("L")
                }
                "Change" ->{
                    h[text[1]] = text[2]
                }
                else ->{
                    
                }
            }
        }
        
        user.forEachIndexed{ index, id ->
            when(oper[index]){
                "E" ->{
                    answer+= "${h[id]}님이 들어왔습니다."
                }
                "L" ->{
                    answer+= "${h[id]}님이 나갔습니다."
                }
            }
        }
        return answer
    }
}