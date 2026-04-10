class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        for (i in strs[0].indices) {
            for (j in strs) {
                if (i == j.length || j[i] != strs[0][i]) {
                    return j.substring(0, i)
                }
            }
        
        }
        return strs[0]
    }
}
