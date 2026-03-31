class Solution {
    fun isPalindrome(s: String): Boolean {
        var p1 = 0
        var p2 = s.length - 1

        while (p1 < p2) {
            if (!s[p1].isLetterOrDigit()) {
                p1++
            } else if (!s[p2].isLetterOrDigit()) {
                p2--
            } else {
                if (s[p1].lowercaseChar() != s[p2].lowercaseChar()) {
                    return false
                }

                p1++
                p2--
            }
        }

        return true
    }
}
