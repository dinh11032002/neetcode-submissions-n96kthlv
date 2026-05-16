class Solution {
    fun largestGoodInteger(num: String): String {
        // counting + compare
        /*
        for (i in num) {
            if ()
        }
        return res
        */
        var maxChar = '/'

        for (i in 0 until num.length - 2) {
            if (num[i] == num[i + 1] && num[i] == num[i + 2]) {
                if (num[i] > maxChar) {
                    maxChar = num[i]
                }
            }
        }

        return if (maxChar == '/') "" else maxChar.toString().repeat(3)
    }
}