fun main() {
    val n = readLine()!!.toInt()
    var count = 0
    var i = 5

    while (n / i > 0) {
        count += n / i
        i *= 5
    }

    println(count)
}
