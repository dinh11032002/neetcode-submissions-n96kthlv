class Solution {
    fun longestPalindrome(s: String): Int {
        // đếm xong sort (IntArray(26))
        // i = 0 -> count = 1, a
        // i = 1 -> count = 0, b
        // i = 2 -> count = 1, c
        // i = 3 -> count = 1, c
        // i = 4 -> count = 1, c
        // i = 5 -> count = 1, c
        // i = 6 -> count = 1, d
        // i = 7 -> count = 1, d
        // sort d -> c -> c -> a -> c -> c -> d rồi đếm lại một lần nữa từ đó output là 7 như ex1
        val charCounts = IntArray(128)
        
        for (char in s) {
            charCounts[char.code]++
        }

        var maxLength = 0
        var hadOddCount = false

        for (count in charCounts) {
            maxLength += (count / 2) * 2

            if (count % 2 != 0) {
                hadOddCount = true
            }
        }

        if (hadOddCount) {
            maxLength += 1
        }

        return maxLength
    }
}