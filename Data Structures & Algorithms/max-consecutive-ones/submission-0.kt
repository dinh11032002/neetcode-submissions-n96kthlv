class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var res = 0
        var cnt = 0

        for (i in nums) {
            cnt = if (i == 1) cnt + 1 else 0
            res = maxOf(res, cnt)
        }

        return res
    }
}