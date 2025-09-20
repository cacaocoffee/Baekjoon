import java.util.LinkedList
import java.util.Queue

class Solution {
    data class Truck(
        var location: Int = 0,
        val weight: Int
    ) {
        fun move() {
            location++
        }
    }

    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridge: Queue<Truck> = LinkedList()
        var time = 0
        var currentWeight = 0
        var index = 0

        while (index < truck_weights.size || bridge.isNotEmpty()) {
            time++

            // 1. 다리 위 트럭 이동
            bridge.forEach { it.move() }

            // 2. 다리 끝난 트럭 제거
            if (bridge.isNotEmpty() && bridge.peek().location > bridge_length) {
                val finished = bridge.poll()
                currentWeight -= finished.weight
            }

            // 3. 새 트럭 올릴 수 있는지 확인
            if (index < truck_weights.size &&
                currentWeight + truck_weights[index] <= weight
            ) {
                val newTruck = Truck(location = 1, weight = truck_weights[index])
                bridge.add(newTruck)
                currentWeight += newTruck.weight
                index++
            }
        }

        return time
    }
}
