class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        val threshold = nums.size / 2

        for (num in nums) {
            val count = map.getOrDefault(num, 0) + 1
            map[num] = count

            if (count > threshold) {
                return num
            }
        }

        return -1
    }
}