fun main(){
    var num =readLine()!!.toInt()
    var a =readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    var b =readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    
    var answer=0
    a.sort()
    b.sortDescending()
    
    for(i in 0 until num){
        answer +=a[i] *b[i]
    }
    print(answer)
}