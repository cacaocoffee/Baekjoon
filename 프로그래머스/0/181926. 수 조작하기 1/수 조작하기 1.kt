class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        control.forEach{
            when(it)
            {
                'w' -> answer++
                's' -> answer--
                'd'-> answer+=10
                'a'-> answer-=10
                else ->{}
            }
        }
        return answer
    }
}