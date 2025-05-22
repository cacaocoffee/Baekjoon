fun josephus(n: Int, k: Int): List<Int> {
    val queue = ArrayDeque<Int>()
    for (i in 1..n) queue.add(i)

    val result = mutableListOf<Int>()

    while (queue.isNotEmpty()) {
        repeat(k - 1) {
            queue.add(queue.removeFirst())  // 앞에서 뺀 걸 뒤에 붙임
        }
        result.add(queue.removeFirst()) // k번째 사람 제거
    }

    return result
}

fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val answer = josephus(n, k)
    println("<${answer.joinToString(", ")}>")
}
