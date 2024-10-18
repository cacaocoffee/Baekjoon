class Solution {
    fun solution(numbers: IntArray): String {
          
           
       val sortedNumbers = numbers.sortedWith { a, b ->  
        val order1 = "$a$b"
        val order2 = "$b$a"
        order2.compareTo(order1) // 큰 값이 먼저 오도록 내림차순 정렬
    }
        return if(sortedNumbers[0]==0) "0" else sortedNumbers.joinToString("")
    }
}