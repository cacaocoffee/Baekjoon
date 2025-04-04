class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val lostList = lost.toMutableList()
        val reserveList = reserve.toMutableList()
        
        val realLost = lostList.filter { it !in reserveList }.toMutableList()
        val realReserve = reserveList.filter { it !in lostList }.toMutableList()

        var answer = n - realLost.size

        realLost.sorted().forEach { student ->
            when {
                student - 1 in realReserve -> {
                    realReserve.remove(student - 1)
                    answer++
                }
                student + 1 in realReserve -> {
                    realReserve.remove(student + 1)
                    answer++
                }
            }
        }
        return answer
    }
}