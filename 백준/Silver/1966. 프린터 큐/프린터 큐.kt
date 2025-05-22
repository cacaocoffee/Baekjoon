data class PrintUnit(val priority: Int, val index: Int)

fun main() {
    val t = readLine()!!.toInt()

    repeat(t) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        val priorities = readLine()!!.split(" ").map { it.toInt() }

        val queue = ArrayDeque<PrintUnit>()
        priorities.forEachIndexed { index, priority ->
            queue.add(PrintUnit(priority, index))
        }

        var count = 0
        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            if (queue.any { it.priority > current.priority }) {
                queue.addLast(current) 
            } else {
                count++
                if (current.index == m) {
                    println(count)
                    break
                }
            }
        }
    }
}
