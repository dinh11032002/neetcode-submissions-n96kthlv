class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var left = 1L
        var right = num.toLong()
        while (left <= right) {
            val mid = left + (right - left) / 2
            val square = mid * mid
            if (square < num.toLong()) {
                left = mid + 1
            } else if (square > num.toLong()) {
                right = mid - 1
            } else {
                return true
            }
        }
        return false
    }
}
