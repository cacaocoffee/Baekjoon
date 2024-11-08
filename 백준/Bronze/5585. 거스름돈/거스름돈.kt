fun main(){
    var coin = listOf(500,100,50,10,5,1)
    var remain = 1000 - readLine()!!.toInt()
    
    var answer = 0
    coin.forEach{
        if(remain>= it) {
            answer += remain/it
            remain = remain%it
        }
    }
    print(answer)
}