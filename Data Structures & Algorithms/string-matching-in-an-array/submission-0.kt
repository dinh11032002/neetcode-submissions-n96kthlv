class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        var res = mutableListOf<String>()

        for (i in words.indices) {
            for (j in words.indices) {
                if (i == j) continue

                if (words[i] in words[j]) {
                    res.add(words[i])
                    break
                }
            }
        }

        return res 
    }
}
