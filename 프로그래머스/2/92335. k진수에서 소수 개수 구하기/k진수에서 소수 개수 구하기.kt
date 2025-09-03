import kotlin.math.sqrt

class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var a:Int = n
        var s:String = ""
        while(a!=0){
            s="${a%k}$s"
            a/=k
        }
        val se = s.split("0")
        se.forEach{
            if(it!=""){
                if(isPrime(it.toLong())) {
                    answer++
                    println(it)
                }
            }
        }        
        return answer
    }
    
    fun isPrime(x: Long): Boolean {
        if(x == 1L) return false
        for (i in 2..Math.sqrt(x.toDouble()).toInt()) {	
            if (x % i == 0L) return false	
        }
        return true
    }
}

