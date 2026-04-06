class Solution {
    fun lengthOfLastWord(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        var length = 0
        var i = s.length - 1
        
        while (i >= 0 && s[i] == ' ') {
            i --
        }
        while (i >= 0 && s[i] != ' ') {
            length ++
            i --
        }
        return length
    }
}
