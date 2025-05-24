fun main() {
    val num = readLine()!!
    val str = readLine()!!
    val mod = 1234567891
    var hash = 0L
    var pow = 1L

    for (ch in str) {
        val value = (ch - 'a' + 1).toLong()
        hash = (hash + value * pow) % mod
        pow = (pow * 31) % mod
    }

    println(hash)
}
