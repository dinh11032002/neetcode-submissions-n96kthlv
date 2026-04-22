class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var maxSum = nums[0]
        var currentSum = nums[0]

        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i]
            } else {
                maxSum = maxOf(maxSum, currentSum)
                currentSum = nums[i]
            }
        }
        return maxOf(maxSum, currentSum)
    }
}
