class Solution {
    fun pickGifts(gifts: IntArray, k: Int): Long {
        val maxHeap = PriorityQueue<Int>(reverseOrder())
        for (gift in gifts) {
            maxHeap.offer(gift)
        }

        repeat(k) {
            val maxGift = maxHeap.poll()
            val reduced = sqrt(maxGift.toDouble()).toInt()
            maxHeap.offer(reduced)
        }

        var totalGifts = 0
        for (gift in maxHeap) {
            totalGifts += gift
        }

        return totalGifts.toLong()
    }
}
