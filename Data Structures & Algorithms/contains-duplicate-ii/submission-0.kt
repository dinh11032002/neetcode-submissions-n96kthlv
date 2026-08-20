class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (j - i > k) {
                    break
                }

                if (nums[i] == nums[j]) {
                    return true
                }
            }
        }
        return false
    }
}
