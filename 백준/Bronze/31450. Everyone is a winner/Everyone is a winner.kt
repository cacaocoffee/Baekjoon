fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    if(a%b==0) println("Yes")
    else println("No")
}