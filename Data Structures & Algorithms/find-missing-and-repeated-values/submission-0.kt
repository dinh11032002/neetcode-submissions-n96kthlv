class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val n = grid.size
        val size = n * n
        val count = IntArray(size + 1)
        var a = 0
        var b = 0
        for (row in grid) {
            for (num in row) {
                count[num]++
            }
        }

        for (i in 1..size) {
            if (count[i] == 2) {
                a = i
            }
            if (count[i] == 0) {
                b = i
            }
        }
        return intArrayOf(a, b)
   }
}