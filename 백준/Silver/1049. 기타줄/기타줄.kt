fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var minSix = 1001
    var minOne = 1001

    repeat(m) {
        val (six, one) = readLine()!!.split(" ").map { it.toInt() }
        minSix = minOf(minSix, six)
        minOne = minOf(minOne, one)
    }

    val allOne = minOne * n
    val allPack = minSix * ((n + 5) / 6)
    val mix = minSix * (n / 6) + minOne * (n % 6)

    println(minOf(allOne, allPack, mix))
}
