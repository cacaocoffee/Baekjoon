fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val hashmap = hashMapOf<String, String>()

    repeat(a) {
        val (site, password) = readLine()!!.split(" ")
        hashmap[site] = password
    }

    repeat(b) {
        println(hashmap[readLine()!!])
    }
}
