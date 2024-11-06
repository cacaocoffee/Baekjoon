class Solution {
    fun solution(s: String): IntArray {
        var answer= mutableListOf<Int>()
        var word = hashMapOf<Char,Int>()
        s.forEachIndexed{ index,char->
            if(word[char]==null) answer.add(-1)
            else answer.add(index - word[char]!!)
            word[char]= index
        }
        return answer.toIntArray()
    }
}