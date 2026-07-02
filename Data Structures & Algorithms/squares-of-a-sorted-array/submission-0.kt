class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)
        var left = 0
        var right = n - 1

        for (i in n - 1 downTo 0) {
            var leftSquare = nums[left] * nums[left]
            var rightSquare = nums[right] * nums[right]

            if (leftSquare > rightSquare) {
                result[i] = leftSquare
                left++
            } else {
                result[i] = rightSquare
                right--
            }
        }

        return result
    }
}
