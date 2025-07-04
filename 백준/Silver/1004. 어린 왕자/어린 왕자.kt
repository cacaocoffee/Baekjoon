import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.sqrt

data class Planet(val x: Int, val y: Int, val r: Int)

fun main() = with(System.`in`.bufferedReader()) {

    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        var cnt = 0

        val (startX, startY, endX, endY) = readLine().split(" ").map { it.toInt() }

        val planetCnt = readLine().toInt()
        val planetArray = Array<Planet?>(planetCnt) { null }

        repeat(planetCnt) {
            val st = StringTokenizer(readLine())
            planetArray[it] = Planet(st.nextToken().toInt(), st.nextToken().toInt(), st.nextToken().toInt())
        }

        planetArray.forEach {
            val startDistance = getDistance(it!!.x, it.y, startX, startY)
            val endDistance = getDistance(it.x, it.y, endX, endY)

            if (!(startDistance > it.r && endDistance > it.r || startDistance < it.r && endDistance < it.r)) {
                cnt++
            }
        }

        sb.append("$cnt\n")
    }
    print(sb)
}

fun getDistance(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    return sqrt((x1 - x2).toDouble().pow(2) + (y1 - y2).toDouble().pow(2))
}