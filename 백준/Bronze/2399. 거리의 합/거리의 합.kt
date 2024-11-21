fun main() {
    val n = readLine()!!.toInt()
    val x = readLine()!!.split(" ").map { it.toLong() }.sorted()

    var leftSum = 0L
    var totalSum = x.sum()
    var result = 0L

    for (i in x.indices) {
        val current = x[i]
        val rightSum = totalSum - leftSum - current
        result += rightSum - current * (x.size - i - 1) + current * i - leftSum
        leftSum += current
    }

    println(result)
}
