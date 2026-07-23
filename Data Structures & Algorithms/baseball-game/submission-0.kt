class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for (operation in operations) {
            if (operation == "+") {
                val top = stack.pop()
                val newScore = top + stack.peek()
                stack.push(top)
                stack.push(newScore)
            } else if (operation == "D") {
                stack.push(stack.peek() * 2)
            } else if (operation == "C") {
                stack.pop()
            } else {
                stack.push(operation.toInt())
            }
        }

        return stack.sum()
    }
}
