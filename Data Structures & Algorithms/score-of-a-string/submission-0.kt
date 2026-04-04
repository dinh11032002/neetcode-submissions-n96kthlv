class Solution {
    fun scoreOfString(s: String): Int {
        var res = 0
        for (i in 0 until s.length - 1) {
            res += abs(s[i].code - s[i + 1].code)
        }
        return res
    }
}
