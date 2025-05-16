fun main() {
    while (true) {
        val set = readLine()!!.split(" ").map { it.toInt() }.sorted()
        if (set.contains(0)) break
        if (set[0] * set[0] + set[1] * set[1] == set[2] * set[2]) println("right")
        else println("wrong")
    }
}
