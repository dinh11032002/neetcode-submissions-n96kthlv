class Solution {
    fun subsetXORSum(nums: IntArray): Int {
        var totalSum = 0

        fun backtrack(index: Int, currenXor: Int) {
            if (index == nums.size) {
                totalSum += currenXor
                return
            }

            backtrack(index + 1, currenXor xor nums[index])

            backtrack(index + 1, currenXor)
        }

        backtrack(0, 0)

        return totalSum
    }
}
