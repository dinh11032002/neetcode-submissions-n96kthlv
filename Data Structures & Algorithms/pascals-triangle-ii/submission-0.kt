class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val result = mutableListOf<Int>()
        var current: Long = 1

        result.add(1)
        
        for (k in 1..rowIndex) {
            current = current * (rowIndex - k + 1) / k

            result.add(current.toInt())
        }

        return result
    }
}