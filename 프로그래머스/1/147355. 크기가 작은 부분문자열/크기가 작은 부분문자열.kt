class Solution {
    fun solution(t: String, p: String): Int {
        var answer:Int = 0
        var number = p.toLong()
        
        for( i in 0..t.length -p.length){
            var target =t.slice(i until i+p.length).toLong()
            if(target <= number) answer++
            
        }
        return answer

    }
}