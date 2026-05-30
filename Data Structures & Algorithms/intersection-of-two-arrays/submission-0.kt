class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        // mình có thể chạy 2 vòng for (burted force) để giải quyết bài này
        // for (i in nums1.size) {
            // for (j in nums2.size) {
                // kiểm tra phần tử của nums 2 có tồn tại trong nums1 không
                // nếu có thì trả ra và trả ra chính cái số bị trùng cặp
            //}

            // return nums[i][j]
        //}

        // solution 2 là HashMap hoặc gộp nó lại bằng IntArray
        val set1 = nums1.toHashSet()
        val result = HashSet<Int>()

        for (num in nums2) {
            if (set1.contains(num)) {
                result.add(num)
            }
        }

        return result.toIntArray()
    }
}
