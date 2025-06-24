fun main() {
    val n = readLine()!!.toInt()
    var now = 1

    repeat(n) {
        val a = readLine()!!.split(" ").map { it.toInt() }
        var isValid = true
        for ((j, num) in a.withIndex()) {
            if (num != (j % 5) + 1) {
                isValid = false
                break
            }
        }
        if (isValid) println(now)
        now++
    }
}
