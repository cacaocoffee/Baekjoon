import kotlin.math.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()
    val arr = br.readLine().split(' ').map { it.toInt() }
    val dp = IntArray(num){1}

    for(i in 0 until num) {
        for(j in 0 until i) {
            if(arr[i]>arr[j]) {
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }

    bw.write("${dp.max()}")
    bw.flush()
    bw.close()
    br.close()
}