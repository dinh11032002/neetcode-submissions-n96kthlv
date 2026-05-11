class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        // solution 1: burted force chạy 2 vòng for lồng nhau rồi so sánh i và j
        /*
        for (i in 0 until nums.size) {
            for (j in 1 until nums.size - 1) {
                if (nums[i] == nums[j] && nums[i] < nums[j]) {
                    return 
                }
            }
        }

        return num
        */
        // solution 2: đếm (counting) hoặc HashMap hoặc IntArray 
        var count = 0
        val map = mutableMapOf<Int, Int>()

        for (num in nums) {
            val current = map.getOrDefault(num, 0)

            count += current

            map[num] = current + 1
        }

        return count                                                                                                                                                                                                                                                  
    }
}