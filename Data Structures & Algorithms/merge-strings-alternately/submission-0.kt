class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()

        var i = 0 // con trỏ chạy 2 chuỗi word1 hoặc word2

        // Dùng While Loop để thực hiện append từng vị trí khi con trỏ chạy qua
        while (i < word1.length || i < word2.length) {
            if (i < word1.length) result.append(word1[i])
            if (i < word2.length) result.append(word2[i])
            i++ // Tăng con trỏ i
        }

        return result.toString()
    }
}
