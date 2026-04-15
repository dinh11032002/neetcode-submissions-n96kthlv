class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val mapSToT = HashMap<Char, Char>()
        val mapTToS = HashMap<Char, Char>()

        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]

            if (mapSToT.containsKey(sChar)) {
                if (mapSToT[sChar] != tChar) {
                    return false
                }
            } else {
                mapSToT[sChar] = tChar
            }

            if (mapTToS.containsKey(tChar)) {
                if (mapTToS[tChar] != sChar) {
                    return false
                }
            } else {
                mapTToS[tChar] = sChar
            }
        }
        return true
    }
}