class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var max = 0
        var list = mutableMapOf<Int,Int>()
        array.forEach{
              list[it] = list.getOrDefault(it, 0) + 1
        }
        
        list.forEach{ (num, freq)->
            if(freq>max) {
                max=freq
                answer = num
            }
        }
        var multiple=0
        
        list.values.forEach{
            if(it==max) multiple++
        }
        
        if(multiple>1) return -1
        
        return answer
    }
}