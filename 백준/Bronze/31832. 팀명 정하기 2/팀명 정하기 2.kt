fun main() {
    val num = readLine()!!.toInt()
    var result = ""

    repeat(num) {
        val teamName = readLine()!!.toString()
        if (conditionOne(teamName) && conditionTwo(teamName) && conditionThree(teamName)) {
            result = teamName
        }
    }

    println(result)
}

fun conditionOne(teamName: String): Boolean {
    var upperCase = 0
    var lowerCase = 0
    for (ch in teamName) {
        when {
            ch in 'A'..'Z' -> upperCase++
            ch in 'a'..'z' -> lowerCase++
        }
    }
    return lowerCase >= upperCase
}

fun conditionTwo(teamName: String): Boolean {
    return teamName.length <= 10
}

fun conditionThree(teamName: String): Boolean {
    for (ch in teamName) {
        if (ch !in '0'..'9') {
            return true
        }
    }
    return false
}
