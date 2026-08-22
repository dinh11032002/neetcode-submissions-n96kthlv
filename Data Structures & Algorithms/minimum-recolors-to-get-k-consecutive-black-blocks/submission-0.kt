class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var minW = Int.MAX_VALUE
        for (i in 0..blocks.length - k) {
            var whiteCount = 0
            for (j in i until i + k) {
                if (blocks[j] == 'W') {
                    whiteCount++
                }
            }
            minW = min(minW, whiteCount)
        }
        return minW
    }
}
