class Solution {
    fun arrangeCoins(n: Int): Int {
        var left = 1L
        var right = n.toLong()
        while (left <= right) {
            val mid = left + (right - left) / 2
            val coins = mid * (mid + 1) / 2
            if (coins == n.toLong()) {
                return mid.toInt()
            } else if (coins < n.toLong()) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return right.toInt()
    }
}
