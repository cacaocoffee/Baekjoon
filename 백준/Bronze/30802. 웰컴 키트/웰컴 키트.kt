fun main() {
    val n = readLine()!!.toLong()
    val size = readLine()!!.split(" ").map{it.toLong()}
    val (t,p)= readLine()!!.split(" ").map{ it.toLong()}
    var t_num = 0L
    size.forEach{
        t_num += it/t 
        if(it%t != 0L ) t_num++
    }
    println(t_num)
    println("${n/p} ${n%p}")
}
