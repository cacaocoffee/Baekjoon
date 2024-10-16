class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd:String =""
        var even:String = ""
        num_list.forEach{ v ->
            if(v%2==1) odd+= v.toString()
            else even+=v.toString()
        }
        return even.toInt()+ odd.toInt()
    }
}