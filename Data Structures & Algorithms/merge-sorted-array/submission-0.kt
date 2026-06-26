class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var p1 = m - 1 // Con trỏ cuối cùng vùng giá trị hợp lệ của nums1
        var p2 = n - 1 // Con trỏ cuối cùng nums2
        var p = m + n - 1 // Con trỏ cuối cùng nums1

        while (p2 >= 0) { 
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1]
                p1--
            } else {
                nums1[p] = nums2[p2]
                p2--
            }
            p--
        }
    }
}