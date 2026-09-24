/*
// Definition for a Node.
class Node(var `val`: Int) {
    var children: MutableList<Node> = mutableListOf()
}
*/

class Solution {
    fun postorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) return result

        val stack = Stack<Node>()
        stack.push(root)

        while (stack.isNotEmpty()) {
            val current = stack.pop()
            result.add(current.`val`)

            for (child in current.children) {
                child?.let { stack.push(it) }
            }
        }

        return result.reversed()
    }
}
