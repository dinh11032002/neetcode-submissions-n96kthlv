class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var flowersLeft = n
        if (flowersLeft <= 0) {
            return true
        }
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0) {
                val leftEmpty = (i == 0 || flowerbed[i - 1] == 0)
                val rightEmpty = (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1
                    flowersLeft--
                    if (flowersLeft <= 0) {
                        return true
                    }
                }
            }
        }
        return flowersLeft <= 0
    }
}