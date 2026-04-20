class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val map = mutableMapOf<Int, Int>()
        val stack = ArrayDeque<Int>()

        for (num in nums2) {
            while (stack.isNotEmpty() && stack.peek() < num) {
                map[stack.pop()] = num
            }
            stack.push(num)
        }

        val result = IntArray(nums1.size)
        for (i in nums1.indices) {
            result[i] = map.getOrDefault(nums1[i], -1)
        }
        return result
    }
}
