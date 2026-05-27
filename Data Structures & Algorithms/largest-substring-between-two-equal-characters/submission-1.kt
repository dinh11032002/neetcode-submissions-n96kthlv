class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        val firstIndexMap = HashMap<Char, Int>()
        var maxLength = -1

        for (i in 0 until s.length) {
            val char = s[i]

            if (!firstIndexMap.containsKey(char)) {
                firstIndexMap[char] = i
            } else {
                val currentLength = i - firstIndexMap[char]!! - 1
                maxLength = maxOf(maxLength, currentLength)
            }
        }

        return maxLength
    }
}