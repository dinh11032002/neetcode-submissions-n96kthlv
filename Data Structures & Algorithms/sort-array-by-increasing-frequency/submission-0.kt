class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val count = IntArray(201)
        for (num in nums) {
            count[num + 100]++
        }

        val list = nums.toMutableList()

        list.sortWith(Comparator { a, b ->
            val freqA = count[a + 100]
            val freqB = count[b + 100]

            if (freqA != freqB) {
                freqA.compareTo(freqB)
            } else {
                b.compareTo(a)
            }
        })

        return list.toIntArray()
    }
}