fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    repeat(n){
        var s = ""
        repeat(it+1) {s="$s*"}
        println(s)
    }
}