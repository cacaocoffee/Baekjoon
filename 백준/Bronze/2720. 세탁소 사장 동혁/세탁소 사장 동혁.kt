fun main(){
    var num = readLine()!!.toInt()
    var list = listOf(25,10,5,1)
    repeat(num){
        var price = readLine()!!.toInt()
        list.forEach{
            print("${price/it} ") 
            price%=it
        }
        println()
    }
}