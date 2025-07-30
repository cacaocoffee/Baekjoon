import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val canvas = Array(n) { CharArray(2 * n - 1) { ' ' } }

    drawStar(n, 0, 0, canvas)

    for (i in 0 until n) {
        println(String(canvas[i])) 
    }
}

fun drawStar(size: Int, r: Int, c: Int, canvas: Array<CharArray>) {
    if (size == 3) {
        canvas[r][c + 2] = '*'
        canvas[r + 1][c + 1] = '*'
        canvas[r + 1][c + 3] = '*'
        for (i in 0 until 5) {
            canvas[r + 2][c + i] = '*'
        }
        return
    }

    val halfSize = size / 2
    
    drawStar(halfSize, r, c + halfSize, canvas)
    drawStar(halfSize, r + halfSize, c, canvas)
    drawStar(halfSize, r + halfSize, c + size, canvas)
}