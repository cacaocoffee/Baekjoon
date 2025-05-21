fun main() {
    val n = readLine()!!.toInt()
    val num1 = readLine()!!.split(" ").map { it.toInt() }.toSet()

    val m = readLine()!!.toInt()
    val num2 = readLine()!!.split(" ").map { it.toInt() }

    num2.forEach {
        if (num1.contains(it)) println("1")
        else println("0")
    }
}
