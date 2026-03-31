/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private fun height(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        return 1 + maxOf(height(root.left), height(root.right))
    }

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        val left = height(root.left)
        val right = height(root.right)
        if (Math.abs(left - right) > 1) {
            return false
        }
        return isBalanced(root.left) && isBalanced(root.right)
    }
}
