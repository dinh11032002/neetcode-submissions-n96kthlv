class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy({ it.first }, { it.second }))

        for (num in nums.indices) {
            minHeap.offer(Pair(nums[num], num))
        }

        repeat(k) {
            val (currVal, idx) = minHeap.poll()

            val newVal = currVal * multiplier

            nums[idx] = newVal

            minHeap.offer(Pair(newVal, idx))
        }

        return nums
    }
}
