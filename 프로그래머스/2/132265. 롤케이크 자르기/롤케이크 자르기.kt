class Solution {
    fun solution(topping: IntArray): Int {
        val leftSet = mutableSetOf<Int>() 
        val rightCount = mutableMapOf<Int, Int>() 
        
        
        for (t in topping) {
            rightCount[t] = rightCount.getOrDefault(t, 0) + 1
        }

        // 왼쪽과 오른쪽의 고유 원소 크기를 비교하며 탐색
        var answer = 0
        for (i in topping.indices) {
            // 왼쪽에 현재 원소 추가
            leftSet.add(topping[i])

            // 오른쪽에서 현재 원소 제거
            rightCount[topping[i]] = rightCount[topping[i]]!! - 1
            if (rightCount[topping[i]] == 0) {
                rightCount.remove(topping[i])
            }

            // 왼쪽과 오른쪽 고유 원소 크기 비교
            if (leftSet.size == rightCount.size) {
                answer++
            }
        }

        return answer
    }
}
