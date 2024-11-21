fun main()
{
    var n=readLine()!!
    var num = readLine()!!.split(" ").map{it.toInt()}
    
    var p = num.indexOf(-1)
    var left = Int.MAX_VALUE
    var right = Int.MAX_VALUE
    for(i in 0 until p){
       left = Math.min(left, num[i])
    }
    for(i in p +1 .. num.lastIndex){
       right = Math.min(right, num[i])
    }
    val result :Long = left.toLong()+right.toLong()
    println(result)
    
}