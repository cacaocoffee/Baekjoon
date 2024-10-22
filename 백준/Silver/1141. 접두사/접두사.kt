fun main(){
    var num = readLine()!!.toInt()
    var answer=0
    var list =ArrayList<String>()
    repeat(num){
        list.add(readLine()!!.toString())
    }
    list.sortBy { it.length }

    for(i in list.indices){
        var check = true
        for(j in i+1 until list.size){

            if(list[j].startsWith(list[i])){
                check = false
                break
            }
        }

        if(check){
            answer++
        }
    }

    println(answer)
}