class Solution {
    fun longestPalindrome(s: String): Int {
        val charCounts = HashMap<Char, Int>()
        
        for (char in s) {
            charCounts[char] = charCounts.getOrDefault(char, 0) + 1
        }

        var maxLength = 0
        var hadOddCount = false

        for (count in charCounts.values) {
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