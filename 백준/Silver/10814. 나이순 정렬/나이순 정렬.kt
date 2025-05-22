data class Person(val name: String, val age: Int, val index: Int)

fun main() {
    val n = readLine()!!.toInt()
    val people = mutableListOf<Person>()

    repeat(n) {
        val (ageStr, name) = readLine()!!.split(" ")
        people.add(Person(name, ageStr.toInt(), it))
    }

    val sorted = people.sortedWith(compareBy({ it.age }, { it.index }))

    for (p in sorted) {
        println("${p.age} ${p.name}")
    }
}
