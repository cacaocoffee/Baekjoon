fun main(args: Array<String>) {
    val s1 = readLine()!!
    s1.map { if (it.isLowerCase()) it.uppercase() else it.lowercase() }
        .joinToString("")
        .also { println(it) }
}