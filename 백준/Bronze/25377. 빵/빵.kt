fun main() {
    val rp = readLine()!!.toInt()
    var min = 1001

    repeat(rp) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        if (a <= b) min = if (min > b) b else min
    }

    if (min == 1001) {
        print("-1")
    } else {
        print(min)
    }
}
