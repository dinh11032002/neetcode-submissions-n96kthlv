class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val isAllowed = BooleanArray(26)
        for (char in allowed) {
            isAllowed[char - 'a'] = true
        }

        var res = 0

        for (word in words) {
            var isConsistent = true
            for (char in word) {
                if (!isAllowed[char - 'a']) {
                    isConsistent = false
                    break
                }
            }

            if (isConsistent) {
                res++
            }
        }

        return res
    }
}