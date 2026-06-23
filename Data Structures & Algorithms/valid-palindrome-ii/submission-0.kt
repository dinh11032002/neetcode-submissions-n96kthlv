class Solution {
    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (s[left] != s[right]) {
                // Khi gặp ký tự khác nhau, thử xóa bên trái HOẶC xóa bên phải
                return isPalindrome(s, left + 1, right) ||  isPalindrome(s, left, right - 1)
            }

            left++
            right--
        }

        return true
    }

    fun isPalindrome(s: String, left: Int, right: Int): Boolean {
        var l = left
        var r = right

        while (l < r) {
            if (s[l] != s[r]) return false

            l++
            r--
        }

        return true
    }
}