class Solution {
    fun minOperations(logs: Array<String>): Int {
        val stack = ArrayDeque<String>()

        for (log in logs) {
            when (log) {
                "../" -> {
                    if (stack.isNotEmpty()) {
                        stack.pop()
                    }
                }

                "./" -> {

                }

                else -> {
                    stack.push(log)
                }
            }
        }

        return stack.size
    }
}
