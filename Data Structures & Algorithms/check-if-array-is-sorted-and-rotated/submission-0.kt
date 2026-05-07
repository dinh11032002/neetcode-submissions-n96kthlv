class Solution {
    fun check(nums: IntArray): Boolean {
        var count = 0
        val n = nums.size

        for (i in 0 until n) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++
            }

            if (count > 1) {
                return false
            }
        }

        return true
    }
}