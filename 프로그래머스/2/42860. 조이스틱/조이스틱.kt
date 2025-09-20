class Solution {
    fun solution(name: String): Int {
        val length = name.length
        var answer = 0
        
        for (c in name) {
            answer += calUpDown(c)
        }

        answer += calLeftRight(name)

        return answer
    }

    // 위/아래 이동 최소 횟수
    fun calUpDown(c: Char): Int {
        return minOf(c - 'A', 'Z' - c + 1)
    }

    // 좌우 이동 최적 거리 계산
    fun calLeftRight(name: String): Int {
        val length = name.length
        var move = length - 1

        for (i in name.indices) {
            var next = i + 1
            while (next < length && name[next] == 'A') next++
            move = minOf(move, i + length - next + minOf(i, length - next))
        }

        return move
    }
}
