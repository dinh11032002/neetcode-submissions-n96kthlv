class Solution {
    fun heightChecker(heights: IntArray): Int {
        val count = IntArray(101)
        for (height in heights) {
            count[height]++
        }

        var result = 0
        var currentHeight = 0

        for (height in heights) {
            while (count[currentHeight] == 0) {
                currentHeight++
            }

            if (height != currentHeight) {
                result++
            }

            count[currentHeight]--
        }

        return result
    }
}