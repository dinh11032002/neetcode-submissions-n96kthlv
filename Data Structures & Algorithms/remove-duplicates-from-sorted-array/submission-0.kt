class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var result = 0

        for (k in 1 until nums.size) {
            if (nums[result] != nums[k]) {
                nums[result++]
                nums[result] = nums[k]
            }
        }

        return result + 1
    }
}
