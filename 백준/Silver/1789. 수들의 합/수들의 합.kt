fun main(){
    var num = readLine()!!.toLong()
    var sum = 0L
    var count=0
    for(i in 1..num){
        if(sum+i>num) break
        count++
        sum += i
    }
    print(count)
}