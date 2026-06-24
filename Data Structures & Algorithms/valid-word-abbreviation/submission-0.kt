class Solution {
    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        var i = 0 // i là con trỏ word
        var j = 0// j là con trỏ abbr

        while (i < word.length && j < abbr.length) {
            // check leading zero: nếu số là '0' thì báo lỗi
            if (abbr[j].isDigit()) {
                if (abbr[j] == '0') {
                    return false
                }

                var num = 0
                // Đọc hết các chữ số để tạo thành số hoàn chỉnh
                while (j < abbr.length && abbr[j].isDigit()) {
                    num = num * 10 + (abbr[j] - '0')
                    j++
                }
                // Nhảy con trỏ i trên word đã đọc 
                i += num
            } else {
                // So sánh ký tự
                if (word[i] != abbr[j]) {
                    return false
                }

                i++
                j++
            }
        }

        // nếu cả 2 đều chạy hết chuỗi thì mới là true
        return i == word.length && j == abbr.length
    }
}
