fun main() {
    val n = readLine()!!.toInt()
    var count = 0
    var num = 666

    while (true) {
        if (num.toString().contains("666")) {
            count++
            if (count == n) {
                println(num)
                break
            }
        }
        num++
    }
}
