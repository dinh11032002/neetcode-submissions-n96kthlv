/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        fun helper(node: TreeNode?) {
            if (node == null) {
                return
            }

            helper(node.left)
            result.add(node.`val`)
            helper(node.right)
        }

        helper(root)
        return result
    }
}
