data class Location(val x: Int, val y: Int)

fun main() {
    var num =readLine()!!.toInt()
    var location = mutableListOf<Location>()
    repeat(num){
        var (x,y) = readLine()!!.split(" ").map{ it.toInt()}
        location.add(Location(x,y))
    }
    val sorted = location.sortedWith(compareBy({ it.y }, { it.x }))

    for (l in sorted) {
        println("${l.x} ${l.y}")
    }
}
