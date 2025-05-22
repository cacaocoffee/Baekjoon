fun main() {
    val frequency = HashMap<Int, Int>()
    val a = readLine()!!.toInt()

    val numbers = readLine()!!.split(" ").map { it.toInt() }

    for (num in numbers) {
        frequency[num] = frequency.getOrDefault(num, 0) + 1
    }

    val b = readLine()!!.toInt()
    val check = readLine()!!.split(" ").map { it.toInt() }

    val result = check.map { frequency.getOrDefault(it, 0) }
    println(result.joinToString(" "))
}
