class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val res = mutableListOf(listOf(1))
        for (n in 0 until numRows - 1) {
            val row = mutableListOf<Int>()
            val temp = listOf(0) + res.last() + listOf(0)
            for (k in 0 until res.last().size + 1) {
                row.add(temp[k] + temp[k + 1])
            }
            res.add(row)
        }
        return res
    }
}