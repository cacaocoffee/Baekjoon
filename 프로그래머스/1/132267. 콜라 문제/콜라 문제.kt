class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var cur = n
        var total = 0
        while (cur >= a) {
            val exchange = cur / a     
            val newBottles = exchange * b
            total += newBottles

            cur = newBottles + (cur % a)   
        }

        return total
    }
    
}