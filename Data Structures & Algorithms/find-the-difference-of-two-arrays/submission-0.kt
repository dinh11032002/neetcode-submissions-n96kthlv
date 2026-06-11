class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()

        val list1 = mutableListOf<Int>()
        for (num in set1) {
            if (!set2.contains(num)) {
                list1.add(num)
            }
        }

        val list2 = mutableListOf<Int>()
        for (num in set2) {
            if (!set1.contains(num)) {
                list2.add(num)
            }
        }

        return listOf(list1, list2)
    }
}