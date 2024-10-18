import kotlin.math.*
class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var maxW =0
        var maxH =0
        sizes.forEach{ (w,h)->
            if(w>h) {
                maxW = max(maxW, w)
                maxH = max(maxH,h)
            }
            else {
                maxW = max(maxW, h)
                maxH = max(maxH,w)
            }
            
        }
        return maxW * maxH
    }
}