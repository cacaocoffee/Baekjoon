class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val hashmap = HashMap<Char, Int>()

        keymap.forEach { row ->
            row.forEachIndexed { index, char ->
                hashmap[char] = minOf(hashmap.getOrDefault(char, Int.MAX_VALUE), index + 1)
            }
        }

        return targets.map { target ->
            var result = 0
            for (char in target) {
                result += hashmap[char] ?: return@map -1
            }
            result
        }.toIntArray()
    }
}
