import kotlin.math.roundToInt

fun main() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n) { readLine()!!.toInt() }

    // 평균
    val avg = (numbers.sum().toDouble() / n).roundToInt()
    println(avg)

    // 중앙값
    val sorted = numbers.sorted()
    println(sorted[n / 2])

    // 최빈값
    val freqMap = numbers.toList().groupingBy { it }.eachCount()
    val maxFreq = freqMap.values.maxOrNull()
    val mostFrequent = freqMap
        .filterValues { it == maxFreq }
        .keys
        .sorted()
    println(if (mostFrequent.size > 1) mostFrequent[1] else mostFrequent[0])

    // 범위
    println(sorted.last() - sorted.first())
}
