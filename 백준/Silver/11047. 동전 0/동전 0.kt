fun main() {
    var answer = 0
    val (time, priceInput) = readLine()!!.split(" ").map { it.toInt() }
    var price = priceInput
    val number = mutableListOf<Int>()
    
    repeat(time) {
        number.add(readLine()!!.toInt())
    }
    
    number.sortDescending() 
    
    number.forEach {
        if (price >= it) {
            answer += price / it
            price %= it
        }
    }
    
    println(answer)
}
