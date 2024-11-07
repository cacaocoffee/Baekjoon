fun main() {
    val n = readLine()!!.toInt()  
    val words = mutableSetOf<String>() 

    repeat(n) {
        words.add(readLine()!!)
    }

    val sortedWords = words.toSet().sortedWith(compareBy<String> { it.length }.thenBy { it })

    sortedWords.forEach { println(it) }
}
