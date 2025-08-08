import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val dist = Array(n + 1) { IntArray(n + 1) { 1000000000 } }
    for (i in 1..n) {
        dist[i][i] = 0
    }

    for (i in 0 until m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        dist[a][b] = 1
        dist[b][a] = 1
    }

    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                if (dist[i][j] > dist[i][k] + dist[k][j]) {
                    dist[i][j] = dist[i][k] + dist[k][j]
                }
            }
        }
    }

    var minKevinBacon = Int.MAX_VALUE
    var resultUser = -1

    for (i in 1..n) {
        var kevinBaconSum = 0
        for (j in 1..n) {
            kevinBaconSum += dist[i][j]
        }

        if (kevinBaconSum < minKevinBacon) {
            minKevinBacon = kevinBaconSum
            resultUser = i
        }
    }
    
    println(resultUser)
}