/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private var res = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        dfs(root)
        return res
    }

    fun dfs(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val left = dfs(root.left)
        val right = dfs(root.right)

        res = maxOf(res, left + right)
        return 1 + maxOf(left, right)
    }
}