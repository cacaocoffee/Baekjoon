import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine().toInt()

    repeat(T) {
        val n = br.readLine().toInt()

        val stickers = Array(2) { IntArray(n) }
        stickers[0] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        stickers[1] = br.readLine().split(" ").map { it.toInt() }.toIntArray()

        val dp = Array(3) { IntArray(n) }

        dp[0][0] = stickers[0][0]
        dp[1][0] = stickers[1][0]
        dp[2][0] = 0

        for (i in 1 until n) {
            dp[0][i] = stickers[0][i] + max(dp[1][i - 1], dp[2][i - 1])
            dp[1][i] = stickers[1][i] + max(dp[0][i - 1], dp[2][i - 1])
            dp[2][i] = max(dp[0][i - 1], max(dp[1][i - 1], dp[2][i - 1]))
        }

        println(max(dp[0][n - 1], max(dp[1][n - 1], dp[2][n - 1])))
    }
}