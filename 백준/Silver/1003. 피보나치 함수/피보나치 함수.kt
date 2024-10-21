fun main() {
    val num = readLine()!!.toInt()

    repeat(num) {
        val number = readLine()!!.toInt()
        val dpZero = IntArray(number + 1) { 0 } 
        val dpOne = IntArray(number + 1) { 0 } 

        if (number >= 0) dpZero[0] = 1  
        if (number >= 1) dpOne[1] = 1   

        for (i in 2..number) {
            dpZero[i] = dpZero[i - 1] + dpZero[i - 2]  
            dpOne[i] = dpOne[i - 1] + dpOne[i - 2]
        }

        println("${dpZero[number]} ${dpOne[number]}")
    }
}
