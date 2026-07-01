class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var result = 1

        for (k in 1 until nums.size) {
            if (nums[k] != nums[k - 1]) {
                nums[result++] = nums[k]
            }
        }

        return result
    }
}
