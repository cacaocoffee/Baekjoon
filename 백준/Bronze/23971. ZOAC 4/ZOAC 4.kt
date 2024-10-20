import kotlin.math.*

fun main() {
    var (H, W, N, M) = readLine()!!.split(" ").map { it.toInt() }

    var h = ceil(H.toDouble() / (N + 1)).toInt()
    var w = ceil(W.toDouble() / (M + 1)).toInt()
    print(w * h)
}
