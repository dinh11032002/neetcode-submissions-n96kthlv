class Solution {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var maxLen = 1
        var inc = 1
        var des = 1

        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                inc++
                des = 1
            } else if (nums[i] < nums[i - 1]) {
                inc = 1
                des++
            } else {
                inc = 1
                des = 1
            }
            maxLen = maxOf(maxLen, maxOf(inc, des))
        }

        return maxLen
    }
}
