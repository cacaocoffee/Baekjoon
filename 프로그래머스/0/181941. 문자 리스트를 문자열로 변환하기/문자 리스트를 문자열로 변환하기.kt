class Solution {
    fun solution(arr: Array<String>): String {        
        return arr.indices.joinToString(""){arr[it]}
    }
}