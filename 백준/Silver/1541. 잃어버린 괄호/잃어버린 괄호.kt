fun main() {
    val expression = readLine()!!

    // 1. 식을 '-'를 기준으로 나누기
    val parts = expression.split("-")

    // 2. 각 부분을 '+'로 나누고 합 계산
    val sumParts = parts.map { part ->
        part.split("+").map { it.toInt() }.sum() 
    }

    // 3. 첫 번째 항목은 그대로 두고, 나머지 항목들은 빼는 방식
    var result = sumParts[0]
    for (i in 1 until sumParts.size) {
        result -= sumParts[i]
    }

    println(result)
}
