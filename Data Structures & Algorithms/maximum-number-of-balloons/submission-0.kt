class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        val count = IntArray(26)
        for (c in text) {
            count[c - 'a']++
        }

        var minBalloons = count['b' - 'a']
        minBalloons = minOf(minBalloons, count['a' - 'a'])
        minBalloons = minOf(minBalloons, count['n' - 'a'])
        minBalloons = minOf(minBalloons, count['l' - 'a'] / 2)
        minBalloons = minOf(minBalloons, count['o' - 'a'] / 2)

        return minBalloons
    }
}