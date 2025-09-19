class Solution {
    fun solution(n: Long): Long {
        val array = IntArray(10) 
        var n1 = n

        while (n1 > 0) {
            val temp = (n1 % 10).toInt()
            array[temp]++
            n1 /= 10
        }

        val sb = StringBuilder()
        for (i in 9 downTo 0) {
            while (array[i] > 0) {
                sb.append(i)
                array[i]--
            }
        }

        return sb.toString().toLong()
    }
}
