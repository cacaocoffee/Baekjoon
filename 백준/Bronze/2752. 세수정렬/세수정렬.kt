fun main(){
    val st = readLine()!!.split(" ").map{ it.toInt()}
    val m = st.sorted()

    println("${m[0]} ${m[1]} ${m[2]}")

}