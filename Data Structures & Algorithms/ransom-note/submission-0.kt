class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val counts = IntArray(26)
        for (char in magazine) {
            counts[char - 'a']++
        }

        for (char in ransomNote) {
            val index = char - 'a'
            counts[index]--

            if (counts[index] < 0) {
                return false
            }
        }

        return true
    }
}
