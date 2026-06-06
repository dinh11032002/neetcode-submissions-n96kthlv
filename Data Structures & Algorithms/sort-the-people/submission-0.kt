class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val n = heights.size
        
        val map = HashMap<Int, String>()
        for (i in 0 until n) {
            map[heights[i]] = names[i]
        }

        val sorted = heights.sortedDescending()

        val result = Array(n) { "" }
        for (i in 0 until n) {
            val height = sorted[i]
            result[i] = map[height]!!
        }

        return result
    }
}