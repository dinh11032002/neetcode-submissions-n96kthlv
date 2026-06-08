class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val count = HashMap<Int, Int>()
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }
        
        val list = nums.toMutableList()

        list.sortWith (Comparator { a, b ->
            val freqA = count[a]!!
            val freqB = count[b]!!

            if (freqA != freqB) {
                freqA.compareTo(freqB)
            } else {
                b.compareTo(a)
            }
        })

        return list.toIntArray()
    }
}
