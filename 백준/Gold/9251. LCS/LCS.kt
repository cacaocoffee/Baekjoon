fun main() {
    val a = readLine()!!.toString()
    val b = readLine()!!.toString()

    println(getLCSLength(a, b))
}

fun getLCSLength(a: String, b: String): Int {
    val dp = Array(a.length + 1) { IntArray(b.length + 1) }

    for (i in 1..a.length) {
        for (j in 1..b.length) {
            dp[i][j] = if (a[i - 1] == b[j - 1]) {
                dp[i - 1][j - 1] + 1
            } else {
                maxOf(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    return dp[a.length][b.length]
}
