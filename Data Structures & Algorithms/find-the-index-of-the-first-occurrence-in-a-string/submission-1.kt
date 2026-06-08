class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val h = haystack.length
        val n = needle.length

        if (n == 0) return 0
        if (h < n) return -1

        for (i in 0..h - n) {
            val sub = haystack.substring(i, i + n)

            if (sub.equals(needle)) {
                return i
            }
        }

        return -1
    }
}
