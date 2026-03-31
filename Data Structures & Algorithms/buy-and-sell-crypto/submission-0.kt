class Solution {
    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var right = 1
        var maxP = 0

        while (right < prices.size) {
            if (prices[left] < prices[right]) {
                var profit = prices[right] - prices[left]
                maxP = max(maxP, profit)
            } else {
                left = right
            }
            right += 1
        }

        return maxP
    }
}
