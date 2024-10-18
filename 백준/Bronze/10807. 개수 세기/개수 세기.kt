fun main() {
    val count = readLine()!!.toInt()
    val numList = readLine()!!.split(" ").map { it.toInt() }
    val target = readLine()!!.toInt()

    println(numList.count { it == target }) 
}
