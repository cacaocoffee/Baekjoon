import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()

    val board = mutableListOf<String>()
    repeat(n) {
        board.add(next())
    }

    fun check(x: Int, y: Int, colors: List<Char>): Int {
        var count = 0
        for (i in 0 until 8) {
            for (j in 0 until 8) {
                val currentChar = board[x + i][y + j]
                // 색상 확인
                val expectedColor = if ((i + j) % 2 == 0) colors[0] else colors[1]
                if (currentChar != expectedColor) {
                    count++
                }
            }
        }
        return count
    }

    var minChanges = Int.MAX_VALUE
    for (i in 0 until (n - 7)) {
        for (j in 0 until (m - 7)) {
            minChanges = minOf(minChanges, check(i, j, listOf('W', 'B')))
            minChanges = minOf(minChanges, check(i, j, listOf('B', 'W')))
        }
    }

    println(minChanges)
}
