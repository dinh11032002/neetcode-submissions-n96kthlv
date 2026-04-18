class Solution {
    fun maxDifference(s: String): Int {
        val freq = IntArray(26)
        for (char in s) {
            freq[char - 'a']++
        }
        
        var maxOdd = Int.MIN_VALUE
        var minEven = Int.MAX_VALUE

        for (count in freq) {
            if (count > 0) {
                if (count % 2 != 0) {
                    maxOdd = maxOf(maxOdd, count)
                } else {
                    minEven = minOf(minEven, count)
                }
            }
        }

        return maxOdd - minEven                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }
}