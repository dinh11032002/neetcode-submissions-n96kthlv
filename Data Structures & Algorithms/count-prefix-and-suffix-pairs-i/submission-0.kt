class Solution {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var count = 0

        for (i in 0 until words.size) {
            for (j in i + 1 until words.size) {
                val str1 = words[i]
                val str2 = words[j]

                if (str2.startsWith(str1) && str2.endsWith(str1)) {
                    count++
                }
            }
        }

        return count
    }
}
