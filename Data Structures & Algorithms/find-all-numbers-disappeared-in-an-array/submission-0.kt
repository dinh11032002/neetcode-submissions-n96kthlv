class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val res = mutableListOf<Int>()
        for (i in nums.indices) {
            val index = Math.abs(nums[i]) - 1
            if (nums[index] > 0) {
                nums[index] = -nums[index]
            }
        }

        for (i in nums.indices) {
            if (nums[i] > 0) {
                res.add(i + 1)
            }
        }
        return res
    }
}
