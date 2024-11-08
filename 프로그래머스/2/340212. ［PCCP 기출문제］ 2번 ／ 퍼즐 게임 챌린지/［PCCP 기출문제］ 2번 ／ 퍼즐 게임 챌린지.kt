class Solution {
 fun solution(diffs: IntArray, times: IntArray, limit: Long): Int {
        var level = 1
        var minLevel =1
        var maxLevel = diffs.maxOrNull()?:1 
        var midLevel = 0
        while (minLevel <= maxLevel) {
            midLevel = (minLevel+maxLevel)/2
            var total = 0L
            for (i in diffs.indices) {
                val diff = diffs[i]
                val time = times[i]
                if (diff <= midLevel) {
                    total += time
                } else {
                    val extraTime = (diff - midLevel) * (time + if (i > 0) times[i - 1] else 0) + time
                    total += extraTime
                }                
                if (total > limit) break
            }
            if (total <= limit) {
                maxLevel = midLevel - 1
            } else {
                minLevel = midLevel + 1
            }
            
        }

        return minLevel
    }
}