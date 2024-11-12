class Solution {
    fun solution(elements: IntArray): Int {
        val uniqueSums = mutableSetOf<Int>() // 고유한 합계를 저장할 Set
        val n = elements.size // 배열의 길이
        
        // 각 부분 배열의 길이(1부터 n까지)에 대해 반복
        for (length in 1..n) {
            // 시작 위치를 이동하면서 부분 배열의 합계를 계산
            for (start in 0 until n) {
                var sum = 0
             
                for (i in 0 until length) {
                    sum += elements[(start + i) % n] // 원형 배열로 처리하기 위해 모듈로 사용
                }
                uniqueSums.add(sum) // 합계를 Set에 추가 (중복 제거)
            }
        }
        
        return uniqueSums.size 
    }
}
