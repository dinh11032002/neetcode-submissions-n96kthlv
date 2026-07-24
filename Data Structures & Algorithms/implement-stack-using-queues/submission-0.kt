class MyStack() {
    private val queue: Queue<Int> = LinkedList()

    fun push(x: Int) {
        queue.add(x)
        
        val size = queue.size
        for (i in 0 until size - 1) {
            queue.add(queue.poll())
        }
        
    }

    fun pop(): Int {
        return queue.poll()
    }

    fun top(): Int {
        return queue.peek()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */
