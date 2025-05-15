fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (h, w, n) = readLine()!!.split(" ").map { it.toInt() }
        val floor = if (n % h == 0) h else n % h
        val room = if (n % h == 0) n / h else n / h + 1
        println("%d%02d".format(floor, room))
    }
}
