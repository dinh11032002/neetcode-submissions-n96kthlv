/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        fun helper(node: TreeNode?) {
            if (node == null) {
                return
            }

            helper(node.left)
            helper(node.right)
            result.add(node.`val`)
        }

        helper(root)
        return result
    }
}
