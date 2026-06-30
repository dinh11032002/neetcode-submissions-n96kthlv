class Solution {
    fun moveZeroes(nums: IntArray) {
        var left = 0
        var right = 0

        while (right <= nums.size - 1) {
            if (nums[right] == 0) {
                right++
            } else {
                var temp = nums[right]
                nums[right] = nums[left]
                nums[left] = temp

                left++
                right++
            }
        }
    }
}
