fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val second = readLine()!!.split(" ").map { it.toInt() }
    val know = mutableSetOf<Int>().apply { addAll(second.drop(1)) }
    
    val parties = mutableListOf<List<Int>>()
    repeat(m) {
        parties.add(readLine()!!.split(" ").map { it.toInt() }.drop(1))
    }


    var changed: Boolean
    do {
        changed = false
        parties.forEach { party ->
            if (party.any { know.contains(it) }) {
                if (know.addAll(party)) {
                    changed = true
                }
            }
        }
    } while (changed)


    var answer = 0
    parties.forEach { party ->
        if (party.none { know.contains(it) }) {
            answer++
        }
    }

    println(answer)
}
