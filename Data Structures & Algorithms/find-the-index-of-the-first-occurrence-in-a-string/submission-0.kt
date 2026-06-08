class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val hLen = haystack.length
        val nLen = needle.length

        if (nLen == 0) {
            return 0
        }

        for (i in 0..hLen - nLen) {
            var j = 0

            while (j < nLen && haystack[i + j] == needle[j]) {
                j++

                if (j == nLen) {
                    return i
                }
            }
        }

        return -1
    }
}
