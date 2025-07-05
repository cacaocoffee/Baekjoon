fun pow(a: Long, b: Long, c: Long): Long {
    if (b == 0L) return 1
    val half = pow(a, b / 2, c)
    return if (b % 2 == 0L)
        (half * half) % c
    else
        ((half * half) % c * a % c) % c
}

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
    println(pow(a, b, c))
}
