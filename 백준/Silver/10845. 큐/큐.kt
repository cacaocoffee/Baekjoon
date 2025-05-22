fun main() {
    val n = readLine()!!.toInt()
    val deque = ArrayDeque<Int>()

    repeat(n) {
        val input = readLine()!!.split(" ")
        val command = input[0]

        when (command) {
            "push" -> {
                deque.addLast(input[1].toInt())
            }
            "pop" -> {
                println(if (deque.isEmpty()) -1 else deque.removeFirst())
            }
            "front" -> {
                println(if (deque.isEmpty()) -1 else deque.first())
            }
            "back" -> {
                println(if (deque.isEmpty()) -1 else deque.last())
            }
            "size" -> {
                println(deque.size)
            }
            "empty" -> {
                println(if (deque.isEmpty()) 1 else 0)
            }
        }
    }
}
