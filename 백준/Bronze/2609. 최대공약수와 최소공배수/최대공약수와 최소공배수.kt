import kotlin.math.min
import kotlin.math.max

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var x = max(a, b)
    var y = min(a, b)
    var r: Int

    while (y != 0) {
        r = x % y
        x = y
        y = r
    }

    val gcd = x
    val lcm = a * b / gcd

    println(gcd)
    println(lcm)
}
