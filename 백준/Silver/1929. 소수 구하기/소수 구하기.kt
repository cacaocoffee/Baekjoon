fun main(){
    var (a,b) = readLine()!!.split(" ").map{ it.toInt()}
    val isPrime = MutableList(b + 1) { true }
    isPrime[0] = false 
    isPrime[1] = false 

    for (i in 2..b) {
        if (isPrime[i]) {
            for (j in 2 * i..b step i) {
                isPrime[j] = false
            }
        }
    }

    for (i in a..b) {
        if (isPrime[i]) {
            println(i)
        }
    }
    
}