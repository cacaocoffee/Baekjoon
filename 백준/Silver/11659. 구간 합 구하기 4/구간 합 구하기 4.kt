fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    val prefixSum = IntArray(n + 1)  

    for (i in 1..n) {
        prefixSum[i] = prefixSum[i - 1] + a[i - 1]
    }

    repeat(m) {
        val (start, end) = readLine()!!.split(" ").map { it.toInt() }
        println(prefixSum[end] - prefixSum[start - 1])
    }
}
