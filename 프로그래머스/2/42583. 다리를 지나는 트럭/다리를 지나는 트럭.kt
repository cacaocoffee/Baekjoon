import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridge: Queue<Int> = LinkedList()
        var time = 0
        var currentWeight = 0
        var index = 0

        // 다리 초기화 (빈 자리 0으로)
        repeat(bridge_length) { bridge.add(0) }

        while (bridge.isNotEmpty()) {
            time++

            // 1. 다리에서 트럭 한 칸 내리기
            currentWeight -= bridge.poll()

            // 2. 새 트럭 올릴 수 있는지 확인
            if (index < truck_weights.size) {
                val nextTruck = truck_weights[index]
                if (currentWeight + nextTruck <= weight) {
                    bridge.add(nextTruck)
                    currentWeight += nextTruck
                    index++
                } else {
                    // 못 올라가면 빈 자리 (0) 추가
                    bridge.add(0)
                }
            }
        }

        return time
    }
}
