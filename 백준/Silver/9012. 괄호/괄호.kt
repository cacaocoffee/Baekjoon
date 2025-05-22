fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val s = readLine()!!
        solve(s)
    }
}

fun solve(s: String) {
    val stack = ArrayDeque<Char>()

    for (ch in s) {
        if (ch == '(') {
            stack.addLast('(')
        } else if (ch == ')') {
            if (stack.isNotEmpty() && stack.last() == '(') {
                stack.removeLast()
            } else {
                println("NO")
                return
            }
        }
    }

    if (stack.isEmpty()) println("YES")
    else println("NO")
}
