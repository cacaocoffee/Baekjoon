class Solution {
    fun solution(arr: IntArray): Int {
        val primeFactors = hashMapOf<Int, Int>() 

        arr.forEach { num ->
            var current = num
            for (i in 2..Math.sqrt(current.toDouble()).toInt()) {
                var count = 0
                while (current % i == 0) { 
                    count++
                    current /= i
                }
                if (count > primeFactors.getOrDefault(i, 0)) {
                    primeFactors[i] = count
                }
            }
     
            if (current > 1) {
                primeFactors[current] = maxOf(primeFactors.getOrDefault(current, 0), 1)
            }
        }

        var answer = 1L
        primeFactors.forEach { (prime, power) ->
            answer *= Math.pow(prime.toDouble(), power.toDouble()).toLong()
        }

        
        return  answer.toInt() 
    }
}
