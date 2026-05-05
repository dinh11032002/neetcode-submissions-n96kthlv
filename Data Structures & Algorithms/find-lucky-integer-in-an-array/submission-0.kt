class Solution {
    fun findLucky(arr: IntArray): Int {
        val frequencyMap = mutableMapOf<Int, Int>()
        
        for (num in arr) {
            frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
        }

        var maxLucky = -1

        for ((key, value) in frequencyMap) {
            if (key == value) {
                maxLucky = maxOf(maxLucky, key)
            }
        }

        return maxLucky
    }
}