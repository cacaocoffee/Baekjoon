fun main(){
    var num = readLine()!!.toInt()
    repeat(num){
        var number = readLine()!!
        var s = mutableSetOf<Char>()
        number.forEach{
            s.add(it)
        }
        println(s.size)
    }
}