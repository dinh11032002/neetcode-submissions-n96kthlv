class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
             val num = target - nums[i]
            if (map.containsKey(num)) {
                return intArrayOf(map[num]!!, i)
            }

            map[nums[i]] = i
        }


        return intArrayOf()
    }
}
