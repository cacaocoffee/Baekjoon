fun main() {
    val num = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    
    repeat(num) {
        list.add(readLine()!!.toInt())
    }

    list.sortDescending()
    
    var max = 0
    list.forEachIndexed { i, w ->
        if ( w * (i + 1) > max) max =  w * (i + 1)
    }

    println(max)
}