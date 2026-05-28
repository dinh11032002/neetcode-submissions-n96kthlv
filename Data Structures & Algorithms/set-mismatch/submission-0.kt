class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        // cách nhanh nhất là biến nums -> Set và tìm cái số mà nó không match trong nums (?)
        // for (i in nums.indices) {
        //  if (nums[i].contains(num)) {
        //}
        //  return set
        //}
        val n = nums.size
        val count = IntArray(n + 1)

        for (num in nums) {
            count[num]++
        }

        var duplicate = -1
        var missing = -1

        for (i in 1..n) {
            if (count[i] == 2) {
                duplicate = i
            }
            if (count[i] == 0) {
                missing = i
            }
            if (duplicate != -1 && missing != -1) {
                break
            }
        }

        return intArrayOf(duplicate, missing)
    }
}