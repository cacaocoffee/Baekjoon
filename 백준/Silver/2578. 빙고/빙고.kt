import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val board = Array(5) { IntArray(5) }
    val numberPositions = mutableMapOf<Int, Pair<Int, Int>>()

    repeat(5) { r ->
        val rowNumbers = br.readLine().split(" ").map { it.toInt() }
        repeat(5) { c ->
            board[r][c] = rowNumbers[c]
            numberPositions[rowNumbers[c]] = Pair(r, c)
        }
    }

    val marked = Array(5) { BooleanArray(5) }

    var callCount = 0
    var bingoLines = 0

    repeat(5) {
        val calledNumbers = br.readLine().split(" ").map { it.toInt() }

        for (number in calledNumbers) {
            callCount++

            if (numberPositions.containsKey(number)) {
                val (r, c) = numberPositions[number]!!
                marked[r][c] = true

                if (bingoLines < 3) {
                    bingoLines = checkBingo(marked)

                    if (bingoLines >= 3) {
                        println(callCount)
                        return
                    }
                }
            }
        }
    }
}

fun checkBingo(markedBoard: Array<BooleanArray>): Int {
    var currentBingos = 0

    for (r in 0 until 5) {
        var rowBingo = true
        for (c in 0 until 5) {
            if (!markedBoard[r][c]) {
                rowBingo = false
                break
            }
        }
        if (rowBingo) currentBingos++
    }

    for (c in 0 until 5) {
        var colBingo = true
        for (r in 0 until 5) {
            if (!markedBoard[r][c]) {
                colBingo = false
                break
            }
        }
        if (colBingo) currentBingos++
    }

    var diag1Bingo = true
    for (i in 0 until 5) {
        if (!markedBoard[i][i]) {
            diag1Bingo = false
            break
        }
    }
    if (diag1Bingo) currentBingos++

    var diag2Bingo = true
    for (i in 0 until 5) {
        if (!markedBoard[i][4 - i]) {
            diag2Bingo = false
            break
        }
    }
    if (diag2Bingo) currentBingos++

    return currentBingos
}