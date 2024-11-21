import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val num = readLine()!!.toInt()
    repeat(num) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        val x1 = input[0]
        val y1 = input[1]
        val r1 = input[2]
        val x2 = input[3]
        val y2 = input[4]
        val r2 = input[5]

        println(findIntersectionCount(x1, y1, r1, x2, y2, r2))
    }
}

fun findIntersectionCount(x1: Int, y1: Int, r1: Int, x2: Int, y2: Int, r2: Int): Int {
    val distance = sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2))

    when {
        distance == 0.0 && r1.toDouble() == r2.toDouble() -> {
            // 두 원의 중심이 같고 반지름이 같을 때
            return -1
        }
        distance > (r1 + r2).toDouble() -> {
            // 두 원이 서로 만나지 않을 때 (서로 떨어져 있음)
            return 0
        }
        distance < kotlin.math.abs(r1 - r2).toDouble() -> {
            // 한 원이 다른 원 내부에 있지만 만나지 않을 때
            return 0
        }
        distance == (r1 + r2).toDouble() || distance == kotlin.math.abs(r1 - r2).toDouble() -> {
            // 두 원이 한 점에서 접할 때
            return 1
        }
        else -> {
            // 두 원이 두 점에서 만날 때
            return 2
        }
    }
}
