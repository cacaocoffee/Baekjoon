fun main() {
    val num = readLine()!!.toInt() 
    val cars = readLine()!!.split(" ").map { it.toInt() }  

    println(cars.count { it == num }) 
}
