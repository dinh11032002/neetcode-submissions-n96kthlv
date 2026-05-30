class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val seen = IntArray(1001)
        
        for (num in nums1) {
            seen[num] = 1
        }

        val result = ArrayList<Int>()

        for (num in nums2) {
            if (seen[num] == 1) {
                result.add(num)
                seen[num] = 0
            }
        }

        return result.toIntArray()
    }
}
