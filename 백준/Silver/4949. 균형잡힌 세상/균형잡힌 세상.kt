fun main() {
    while (true) {
        val str = readLine()!!
        if (str == ".") break

        val stack = ArrayDeque<Char>()
        var answer = "yes"

        for (ch in str) {
            when (ch) {
                '(' -> stack.addLast(ch)
                '[' -> stack.addLast(ch)
                ')' -> {
                    if (stack.isNotEmpty() && stack.last() == '(') {
                        stack.removeLast()
                    } else {
                        answer = "no"
                        break
                    }
                }
                ']' -> {
                    if (stack.isNotEmpty() && stack.last() == '[') {
                        stack.removeLast()
                    } else {
                        answer = "no"
                        break
                    }
                }
            }
        }

        if (stack.isNotEmpty()) answer = "no"
        println(answer)
    }
}
