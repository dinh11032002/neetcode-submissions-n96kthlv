/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        val remainingSum = targetSum - root.`val`

        if (root.left == null && root.right == null) {
            return remainingSum == 0
        }

        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum)
    }
}
