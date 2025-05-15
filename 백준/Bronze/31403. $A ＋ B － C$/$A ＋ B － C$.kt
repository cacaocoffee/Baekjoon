fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(a + b - c)
    println("${(a.toString() + b.toString()).toInt() - c}")
}
