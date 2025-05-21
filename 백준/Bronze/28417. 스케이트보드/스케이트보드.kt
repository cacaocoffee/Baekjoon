import kotlin.math.max

fun main() {
    val people = readLine()!!.toInt()
    var maxNum = 0

    repeat(people) {
        val a = readLine()!!
            .split(" ")
            .map { it.toInt() }

        val first = max(a[0], a[1])  

        val rest = a.slice(2..6)     // a[2] ~ a[6] (총 6개)
            .sortedDescending()      // 내림차순 정렬
            .take(2)                 // 가장 큰 2개 가져오기

        val sum = first + rest.sum() // 3개를 더한 합
        maxNum = max(maxNum, sum)
    }

    println(maxNum)
}
