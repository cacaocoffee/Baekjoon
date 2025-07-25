import kotlin.math.ceil

fun main() {
    val roomNumber = readLine()!!
    
    val digitCounts = IntArray(10) { 0 }

    roomNumber.forEach { charDigit ->
        val digit = charDigit.toInt() - '0'.toInt()
        
        if (digit == 6 || digit == 9) {
            digitCounts[6]++
        } else {
            digitCounts[digit]++
        }
    }

    digitCounts[6] = ceil(digitCounts[6] / 2.0).toInt()

    val minSetsNeeded = digitCounts.maxOrNull() ?: 0

    println(minSetsNeeded)
}