fun main() {
    var num = readLine()!!
    var count = 0
    var answer = "NO"

    while (num.length > 1) {
        var number = 0L
        num.forEach {
            number += it.digitToInt()
        }
        count++
        num = number.toString()
    }

    // 마지막 자리수 확인
    if (num.toInt() % 3 == 0) {
        answer = "YES"
    }

    println(count)
    println(answer)
}
