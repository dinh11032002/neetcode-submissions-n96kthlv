class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (words.size != pattern.length) {
            return false
        }

        val charToWord = HashMap<Char, String>()
        val wordToChar = HashMap<String, Char>()

        for (i in pattern.indices) {
            val c = pattern[i]
            val word = words[i]

            if (charToWord.containsKey(c)) {
                if (charToWord[c] != word) {
                    return false
                }
            } else {
                    charToWord[c] = word
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar[word] != c) {
                    return false
                }
            } else {
                    wordToChar[word] = c
            }
        }

        return true
    }
}