class Solution {
    fun reverseString(s: CharArray) {
        val n = s.size

        for (i in 0 until n / 2) {
            val temp = s[i]
            s[i] = s[n - 1 - i]
            s[n - 1 - i] = temp
        }
    }
}
