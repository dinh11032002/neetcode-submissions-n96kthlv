/*
// Definition for a Node.
class Node(var `val`: Int) {
    var children: MutableList<Node> = mutableListOf()
}
*/

class Solution {
    fun traverse(node: Node?, result: MutableList<Int>) {
        if (node == null) return

        for (child in node.children) {
            traverse(child, result)
        }

        result.add(node.`val`)
    }


    fun postorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()
        traverse(root, result)
        return result
    }
}
