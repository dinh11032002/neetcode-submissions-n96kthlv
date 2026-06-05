class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val count = IntArray(10001)

        for (num in arr1) {
            count[num]++
        }

        val result = IntArray(arr1.size)
        var index = 0

        for (num in arr2) {
            while (count[num] > 0) {
                result[index++] = num
                count[num]--
            }
        }

        for (num in 0..1000) {
            while (count[num] > 0) {
                result[index++] = num
                count[num]--
            }
        }

        return result
    }
}