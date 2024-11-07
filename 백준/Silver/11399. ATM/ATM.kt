fun main(){
    var num = readLine()!!.toInt()
    var list = readLine()!!.split(" ").map{ it.toInt()}.toMutableList() 
    list.sort()
    var now=0
    var answer= 0
    list.forEach{
        now+= it
        answer +=now
    }
    println(answer)
}