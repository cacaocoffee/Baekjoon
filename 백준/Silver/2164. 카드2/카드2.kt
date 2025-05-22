fun main() {
    val n = readLine()!!.toInt()
    val arrayDeque = ArrayDeque<Int>()

    for (i in 1..n) {
        arrayDeque.add(i)
    }

    while (arrayDeque.size >= 2) {
        arrayDeque.removeFirst()             // 버림
        arrayDeque.add(arrayDeque.removeFirst()) // 다음 카드 아래로
    }

    println(arrayDeque.first())
}
