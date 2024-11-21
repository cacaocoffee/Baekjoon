fun main() {
    while (true) {
        val num = readLine()!!.toInt()

        if (num == -1) break

        val divisors = mutableListOf<Int>()

        for (i in 1..num / 2) {
            if (num % i == 0) divisors.add(i)
        }

        if (divisors.sum() == num) {
            print("$num = ")
            println(divisors.joinToString(" + "))
        } else {
            println("$num is NOT perfect.")
        }
    }
}
