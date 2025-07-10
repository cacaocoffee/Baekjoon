fun main() {
    val (n, r, c) = readLine()!!.split(" ").map { it.toInt() }
    println(z(n, r, c))
}

fun z(n: Int, r: Int, c: Int): Int {
    if (n == 0) return 0

    val half = 1 shl (n - 1) // 2^(n-1)
    val blockSize = half * half

    return when {
        r < half && c < half -> z(n - 1, r, c) // 1사분면
        r < half && c >= half -> blockSize + z(n - 1, r, c - half) // 2사분면
        r >= half && c < half -> 2 * blockSize + z(n - 1, r - half, c) // 3사분면
        else -> 3 * blockSize + z(n - 1, r - half, c - half) // 4사분면
    }
}
