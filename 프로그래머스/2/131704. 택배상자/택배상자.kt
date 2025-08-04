import java.util.*

class Solution {
    fun solution(order: IntArray): Int {
        var answer = 0
        val stack: Deque<Int> = ArrayDeque()

        var mainBeltBox = 1
        var orderIndex = 0

        while (orderIndex < order.size) {
            val requiredBox = order[orderIndex]

            if (mainBeltBox == requiredBox) {
                answer++
                mainBeltBox++
                orderIndex++
            } else if (stack.isNotEmpty() && stack.peek() == requiredBox) {
                stack.pop()
                answer++
                orderIndex++
            } else {
                if (mainBeltBox <= requiredBox) {
                    stack.push(mainBeltBox)
                    mainBeltBox++
                } else {
                    break
                }
            }
        }
        return answer
    }
}