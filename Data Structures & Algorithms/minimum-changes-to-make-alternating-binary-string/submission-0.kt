class Solution {
    fun minOperations(s: String): Int {
        // bài này thì minhfh có thể s -> Int bằng convert() ?
        // còn một cách khác là cộng chuỗi thì sao (?)
        var case0 = 0

        for (i in 0 until s.length) {
            val expectedChar = if (i % 2 == 0) '0' else '1'

            if (s[i] != expectedChar) {
                case0++
            }

        }
        
        val case1 = s.length - case0

        return minOf(case0, case1)
    }
}