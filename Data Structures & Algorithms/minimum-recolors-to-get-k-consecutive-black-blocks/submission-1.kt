class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var whiteCount = 0
        for (i in 0 until k) {
            if (blocks[i] == 'W') whiteCount++
        }
        var minW = whiteCount
        for (i in k until blocks.length) {
            if (blocks[i] == 'W') whiteCount++
            if (blocks[i - k] == 'W') whiteCount--
            minW = min(minW, whiteCount)
        }
        return minW
    }
}
