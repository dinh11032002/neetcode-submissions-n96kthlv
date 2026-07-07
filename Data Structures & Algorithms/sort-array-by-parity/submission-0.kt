class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var i = 0
        var j = nums.size - 1

        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++
            } else if (nums[j] % 2 != 0) {
                j--
            } else {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                i++
                j--
            }
        }

        return nums
    }
}
