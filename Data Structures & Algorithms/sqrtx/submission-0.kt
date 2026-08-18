class Solution {
    fun mySqrt(x: Int): Int {
        var left = 0L
        var right = x.toLong()
        var ans = 0L
        while (left <= right) {
            val mid = left + (right - left) / 2
            val square = mid * mid
            if (square == x.toLong()) {
                return mid.toInt()
            } else if (square < x.toLong()) {
                ans = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return ans.toInt()
    }
}
