class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr
        queries.forEach{
            var temp= answer[it[0]]
            answer[it[0]] = answer[it[1]]
            
            answer[it[1]] = temp
        }
        return answer
    }
}