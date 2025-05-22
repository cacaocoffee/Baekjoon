data class Loc(val x: Int, val y: Int)

fun main() {
    val n = readLine()!!.toInt()
    val loc = mutableListOf<Loc>()

    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map{it.toInt()}
        loc.add(Loc(x, y))
    }

    val sorted = loc.sortedWith(compareBy({ it.x }, { it.y }))

    for (l in sorted) {
        println("${l.x} ${l.y}")
    }
}
