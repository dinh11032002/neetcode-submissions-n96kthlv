class MyQueue() {
    private val input = ArrayDeque<Int>()
    private val output = ArrayDeque<Int>()

    fun push(x: Int) {
        input.push(x)
    }

    fun pop(): Int {
        shiftStack()
        return output.pop()
    }

    fun peek(): Int {
        shiftStack()
        return output.peek()
    }

    fun empty(): Boolean {
        return input.isEmpty() && output.isEmpty()
    }

    private fun shiftStack() {
        if (output.isEmpty()) {
            while (input.isNotEmpty()) {
                output.push(input.pop())
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * val obj = MyQueue()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.peek()
 * val param_4 = obj.empty()
 */
