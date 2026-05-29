class Solution {
    fun firstUniqChar(s: String): Int {
        // sort + count thì sao (?)
        // for (i in s.length)
        //.   if () sort ra ký tự lặp thì tăng count
        //.     count++
        //. return count
        val count = IntArray(26)

        for (i in 0 until s.length) {
            count[s[i] - 'a']++
        }

        for (i in 0 until s.length) {
            if (count[s[i] - 'a'] == 1) {
                return i
            }
        }

        return -1
    }
}
