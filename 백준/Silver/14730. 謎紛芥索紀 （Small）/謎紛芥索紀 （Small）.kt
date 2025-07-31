fun main(){
    val n = readLine()!!.toInt()
    var answer = 0 
    repeat(n){
        val (a,b) = readLine()!!.split(" ").map{it.toInt()}
        answer+= a*b
    }
    println(answer)
}