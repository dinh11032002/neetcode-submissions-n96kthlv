class Solution {
    fun isArraySpecial(nums: IntArray): Boolean {
        if (nums.size < 2) {
            return true
        }

        for (i in 0 until nums.size - 1) {
            if ((nums[i] xor nums[i + 1]) and 1 == 0) {
                return false
            }
        }

        return true
    }
}