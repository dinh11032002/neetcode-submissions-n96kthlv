class Solution {
    fun maxScore(s: String): Int {
        /*
            for (i in 0 unitl s.size - 1) {
                for (j + 1 in 0 unitl s.size) {
                    if (left && right == s) {
                        left + right
                    } else {

                    }
                }
            }

            return s


            solution 2: 2 con trỏ
        */

        var maxScore = 0
        var zerosLeft = 0

        var onesRight = s.count { it == '1' }

        for (i in 0 until s.length - 1) {
            if (s[i] == '0') {
                zerosLeft++
            } else {
                onesRight--
            }

            val currentScore = zerosLeft + onesRight
            if (currentScore > maxScore) {
                maxScore = currentScore
            }
        }

        return maxScore
    }
}