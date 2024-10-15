class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        return if (k % 2 == 0) {
            arr.map { it + k }.toIntArray()  
        } else {
            arr.map { it * k }.toIntArray()  
        }
    }
}