fun main() {
    val num = readLine()!!.toInt()
    val length = readLine()!!.split(" ").map { it.toLong() }
    val price = readLine()!!.split(" ").map { it.toLong() }

    var answer = 0L
    var minPrice = price[0]

    for (i in 0 until length.size) {
        if (price[i] < minPrice) {
            minPrice = price[i]
        }
        answer += minPrice * length[i]
    }

    println(answer)
}
