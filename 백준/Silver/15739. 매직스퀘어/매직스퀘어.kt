fun main() {
    val n = readLine()!!.toInt()  
    val sum = n * (n * n + 1) / 2  // 마방진의 합
    var answer = "TRUE"
    
    // 행렬 입력
    val list = mutableListOf<List<Int>>()
    val seenNumbers = mutableSetOf<Int>()  // 중복된 숫자를 체크할 집합

    repeat(n) {
        val line = readLine()!!.split(" ").map { it.toInt() }
        list.add(line)
        seenNumbers.addAll(line)  // 각 행에 있는 숫자를 집합에 추가
    }

    // 중복된 숫자가 있는지 확인
    if (seenNumbers.size != n * n) {
        println("FALSE")
        return
    }

    // 각 행의 합 검사
    for (row in 0 until n) {
        var rowSum = 0
        for (col in 0 until n) {
            rowSum += list[row][col]
        }
        if (rowSum != sum) {
            answer = "FALSE"
            break  // 합이 맞지 않으면 바로 종료
        }
    }

    // 각 열의 합 검사
    if (answer == "TRUE") {
        for (col in 0 until n) {
            var colSum = 0
            for (row in 0 until n) {
                colSum += list[row][col]
            }
            if (colSum != sum) {
                answer = "FALSE"
                break  // 합이 맞지 않으면 바로 종료
            }
        }
    }

    // 대각선 합 검사
    if (answer == "TRUE") {
        var primaryDiagonal = 0
        var secondaryDiagonal = 0
        for (i in 0 until n) {
            primaryDiagonal += list[i][i]  // 주 대각선
            secondaryDiagonal += list[i][n - 1 - i]  // 보조 대각선
        }
        if (primaryDiagonal != sum || secondaryDiagonal != sum) {
            answer = "FALSE"
        }
    }

    println(answer)
}
