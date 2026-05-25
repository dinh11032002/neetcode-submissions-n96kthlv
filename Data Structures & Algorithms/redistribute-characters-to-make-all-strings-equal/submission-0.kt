class Solution {
    fun makeEqual(words: Array<String>): Boolean {
        /*
            chạy 2 vòng for (burted force)
            for (i in 0 until words.length - 1) {
                for (j in 0 until words.length) {
                    if (words[i] != words[j]) {
                        return false
                    }
                }
            }

            return true


        */

        val countChars = IntArray(26)

        for (word in words) {
            for (char in word) {
                countChars[char - 'a']++
            }
        }

        val total = words.size
        for (count in countChars) {
            if (count % total != 0) {
                return false
            }
        }

        return true
    }
}