fun main()
{
    var a = readLine()!!.toInt()
    
    var (b,c) =readLine()!!.split(" ").map{ it.toInt()}
    
    var count =  b/2 + c
    
    if(count>a) print(a)
    else print(count)
}