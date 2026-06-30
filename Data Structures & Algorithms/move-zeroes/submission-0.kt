class Solution {
    fun moveZeroes(nums: IntArray) {
        var insertPos = 0

        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                val temp = nums[i]
                nums[i] = nums[insertPos]
                nums[insertPos] = temp

                insertPos++
            }
        }
    }
}
