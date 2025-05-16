fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val listen = mutableSetOf<String>()
    repeat(a) {
        listen.add(readLine()!!)
    }

    val see = mutableSetOf<String>()
    repeat(b) {
        see.add(readLine()!!)
    }

    val result = listen.intersect(see).toList().sorted()

    println(result.size)
    result.forEach {
        println(it)
    }
}
