import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    val ground = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            ground[i][j] = st.nextToken().toInt()
        }
    }

    var minTime = Long.MAX_VALUE
    var resultHeight = 0

    for (targetHeight in 0..256) {
        var timeTaken: Long = 0
        var blocksGained = 0
        var blocksNeeded = 0

        for (i in 0 until n) {
            for (j in 0 until m) {
                val currentHeight = ground[i][j]

                if (currentHeight > targetHeight) {
                    val diff = currentHeight - targetHeight
                    timeTaken += diff * 2
                    blocksGained += diff
                } else if (currentHeight < targetHeight) {
                    val diff = targetHeight - currentHeight
                    timeTaken += diff * 1
                    blocksNeeded += diff
                }
            }
        }

        if (b + blocksGained >= blocksNeeded) {
            if (timeTaken <= minTime) {
                if (timeTaken < minTime) {
                    minTime = timeTaken
                    resultHeight = targetHeight
                } else {
                    resultHeight = max(resultHeight, targetHeight)
                }
            }
        }
    }

    println("$minTime $resultHeight")
}