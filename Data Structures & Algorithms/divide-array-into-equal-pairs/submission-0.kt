class Solution {
    fun divideArray(nums: IntArray): Boolean {
        val counts = mutableMapOf<Int, Int>()

        for (num in nums) {
            counts[num] = counts.getOrDefault(num, 0) + 1
        }

        for (count in counts.values) {
            if (count % 2 != 0) {
                return false
            }
        }

        return true
    }
}