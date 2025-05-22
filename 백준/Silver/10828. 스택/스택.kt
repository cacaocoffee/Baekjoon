fun main() {
    val n = readLine()!!.toInt()
    val stack = ArrayDeque<Int>()

    repeat(n) {
        val input = readLine()!!.split(" ")
        when(input[0]) {
            "push" -> stack.addLast(input[1].toInt())
            "pop" -> println(if(stack.isEmpty()) -1 else stack.removeLast())
            "size" -> println(stack.size)
            "empty" -> println(if(stack.isEmpty()) 1 else 0)
            "top" -> println(if(stack.isEmpty()) -1 else stack.last())
        }
    }
}
