import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toInt()
    println(solve(n))
}

fun solve(n: Int): Int {
    val sqrtN = sqrt(n.toDouble()).toInt()
    if (sqrtN * sqrtN == n) {
        return 1
    }

    var tempN = n
    while (tempN % 4 == 0) {
        tempN /= 4
    }
    if (tempN % 8 == 7) {
        return 4
    }

    val limit = sqrt(n.toDouble()).toInt()
    for (i in 1..limit) {
        val remainder = n - i * i
        val sqrtRemainder = sqrt(remainder.toDouble()).toInt()
        if (sqrtRemainder * sqrtRemainder == remainder) {
            return 2
        }
    }

    return 3
}