class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        // solution: Đếm (counting)
        // var count = 0
        // for (word in words) {
            // if () {
            //}
        //}
        // return count

        // solution 2: HashMap
        var totalLength = 0
        
        val charCounts = IntArray(26)

        for (char in chars) {
            charCounts[char - 'a']++
        }

        for (word in words) {
            val wordCounts = IntArray(26)
            var canForm = true

            for (char in word) {
                wordCounts[char - 'a']++

                if (wordCounts[char - 'a'] >  charCounts[char - 'a']) {
                    canForm = false
                    break
                }
            }

            if (canForm) {
                totalLength += word.length
            }
        }

        return totalLength
    }
}