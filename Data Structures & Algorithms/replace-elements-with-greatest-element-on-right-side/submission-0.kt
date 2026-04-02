class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val n = arr.size
        val ans = IntArray(n)
        var rightMax = -1
        
        for (i in n - 1 downTo 0 ) {
            ans[i] = rightMax
            rightMax = maxOf(rightMax, arr[i])
        }
        return ans
    }
}
