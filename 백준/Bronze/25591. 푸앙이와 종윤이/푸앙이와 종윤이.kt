fun main(){
    var (num1,num2) = readLine()!!.split(" ").map{it.toInt()}
    var a = 100-num1
    var b = 100-num2
    var c = 100-(a+b)
    var d = a*b
    var q = d/100
    var r = d%100
    
    var front = c+q
    var back = r
    
    println("$a $b $c $d $q $r ")
    println("$front $back")
}