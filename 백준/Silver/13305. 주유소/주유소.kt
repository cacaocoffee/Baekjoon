fun main(){
    var num = readLine()!!.toInt()
    var length =  readLine()!!.split(" ").map{it.toInt()}
    var price =  readLine()!!.split(" ").map{it.toInt()}
    
    var answer = 0 
    var minPrice = price[0]
    length.forEachIndexed{ index, it ->
        answer += it * minPrice
        if(price[index+1]< minPrice) minPrice = price[index]
    }
    print(answer)
}