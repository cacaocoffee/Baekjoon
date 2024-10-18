fun main() {
    val num = mutableListOf(28)
    repeat(28){
        num.add(readLine()!!.toInt())
    }
    for(i in 1..30){
        if(!num.contains(i)) println(i)
    }
}
