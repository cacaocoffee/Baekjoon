fun main() {
    val input = mutableListOf<String>()
    var targetNumber: Int? = null
    for (i in 1..3) {
        input.add(readln())
    }
    input.forEachIndexed { index, s ->
        if (s.toIntOrNull() != null) {
            targetNumber = s.toInt() + (4 - (index + 1))
        }
    }
    println(getFizzBuzz(targetNumber!!))
}
 
fun getFizzBuzz(i: Int): String {
    if (i % 3 == 0 && i % 5 == 0) {
        return "FizzBuzz"
    }
    if (i % 3 == 0) {
        return "Fizz"
    }
    if (i % 5 == 0) {
        return "Buzz"
    }
    return i.toString()
}