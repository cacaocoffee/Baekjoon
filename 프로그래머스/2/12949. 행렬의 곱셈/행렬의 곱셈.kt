class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row1 = arr1.size                
        val col1 = arr1[0].size             
        val col2 = arr2[0].size            

        val answer = Array(row1) { IntArray(col2) }

        for (i in 0 until row1) {           
            for (j in 0 until col2) {       
                var sum = 0
                for (k in 0 until col1) {   
                    sum += arr1[i][k] * arr2[k][j]
                }
                answer[i][j] = sum        
            }
        }

        return answer
    }
}
