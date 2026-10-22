class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())

        for (stone in stones) {
            maxHeap.offer(stone)
        }

        while (maxHeap.size > 1) {
            val y = maxHeap.poll()
            val x = maxHeap.poll()

            if (x != y) {
                maxHeap.offer(y - x)
            }
        }

        return if (maxHeap.isEmpty()) 0 else maxHeap.peek()
    }
}
