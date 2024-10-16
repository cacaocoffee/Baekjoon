import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        if(a==b || b==c) {
            if(a==c){
                return (a+b+c) *(a.pow(2)+ b.pow(2)+ c.pow(2)) * (a.pow(3)+ b.pow(3)+ c.pow(3))
            }
            else{
                return (a+b+c) *(a.pow(2)+ b.pow(2)+ c.pow(2)) 
            }
            
        }
        return a+b+c
    }
}