import kotlin.math.*

fun main() {
    val (count, target) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() } 
    var maxTarget = 0
    val visited = BooleanArray(count) 


    bfs(0, list, target, visited) { maxValue ->
        maxTarget = max(maxTarget, maxValue)
    }

    println(maxTarget)
}

fun bfs(num: Int, list: List<Int>, target: Int, visited: BooleanArray, updateMax: (Int) -> Unit) {
    for (i in list.indices) {
        if (!visited[i]) {
            visited[i] = true
            for (j in i + 1 until list.size) {
                if (!visited[j]) {
                    visited[j] = true
                    for (k in j + 1 until list.size) {
                        if (!visited[k]) {
                            val sum = list[i] + list[j] + list[k]
                            if (sum <= target) {
                                updateMax(sum)
                            }
                        }
                    }
                    visited[j] = false
                }
            }
            visited[i] = false
        }
    }
}
