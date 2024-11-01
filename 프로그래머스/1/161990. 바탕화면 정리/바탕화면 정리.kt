class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var minX = 1000
        var maxX = 0
        var minY = 1000
        var maxY = 0

        wallpaper.forEachIndexed { y, row ->
            row.forEachIndexed { x, char ->
                if (char == '#') {
                    if (x < minX) minX = x
                    if (x > maxX) maxX = x
                    if (y < minY) minY = y
                    if (y > maxY) maxY = y
                }
            }
        }

        return intArrayOf(minY, minX, maxY + 1, maxX + 1)
    }
}
