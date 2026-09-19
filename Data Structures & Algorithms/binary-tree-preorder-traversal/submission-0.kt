/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        helper(root, result)
        return result
    }

    private fun helper(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return

        list.add(node.`val`)
        helper(node.left, list)
        helper(node.right, list)
    }
}
