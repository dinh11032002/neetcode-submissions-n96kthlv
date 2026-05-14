class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val set = allowed.toSet()
        var res = 0

        for (word in words) {
            if (word.all { it in set }) {
                res++
            }
        }

        return res
    }
}