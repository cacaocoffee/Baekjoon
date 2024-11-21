fun main() {
    val input = readLine()!!
    var sum = 0
    var missingIndex = 0

    // 각 자리의 값을 처리
    input.forEachIndexed { index, char ->
        if (char == '*') {
            // 손상된 자리의 인덱스를 기록
            missingIndex = index
        } else {
            // 가중치를 적용하여 합계 계산
            val weight = if (index % 2 == 0) 1 else 3
            sum += char.digitToInt() * weight
        }
    }

    // 손상된 숫자를 계산
    for (i in 0..9) {
        val weight = if (missingIndex % 2 == 0) 1 else 3
        val total = sum + i * weight

        // 체크 조건: 10으로 나눈 나머지가 0이어야 함
        if (total % 10 == 0) {
            println(i)
            return
        }
    }
}
