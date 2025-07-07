import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val T = br.readLine()
    val N = br.readLine().toInt()
    val books = Array(N) {
        val (price, title) = br.readLine().split(" ", limit = 2)
        price.toInt() to title
    }

    val targetMap = mutableMapOf<Char, Int>()
    for (ch in T) {
        targetMap[ch] = targetMap.getOrDefault(ch, 0) + 1
    }

    var answer = Int.MAX_VALUE
    val max = 1 shl N

    for (i in 1 until max) {
        var totalPrice = 0
        val charMap = mutableMapOf<Char, Int>()

        for (j in 0 until N) {
            if ((i and (1 shl j)) != 0) {
                totalPrice += books[j].first
                for (c in books[j].second) {
                    charMap[c] = charMap.getOrDefault(c, 0) + 1
                }
            }
        }

        var isPossible = true
        for ((c, count) in targetMap) {
            if (charMap.getOrDefault(c, 0) < count) {
                isPossible = false
                break
            }
        }

        if (isPossible) {
            answer = minOf(answer, totalPrice)
        }
    }

    println(if (answer == Int.MAX_VALUE) -1 else answer)
}
