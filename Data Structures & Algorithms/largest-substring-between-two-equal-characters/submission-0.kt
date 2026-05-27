class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        /*
            count = IntArray(26)

            for (char in 0 until s.length) {
                if () {
                    count[char]++
                }
            }

            return -1
        */

        val firstIndex = IntArray(26) { -1 }
        var maxLength = -1

        for (i in 0 until s.length) {
            val charIndex = s[i] - 'a'

            if (firstIndex[charIndex] == -1) {
                firstIndex[charIndex] = i
            } else {
                val currentLength = i - firstIndex[charIndex] - 1
                maxLength = maxOf(maxLength, currentLength)
            }
        }

        return maxLength
    }
}