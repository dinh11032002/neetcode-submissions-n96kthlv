/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun sameTree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null && subRoot == null) {
            return true
        }
        if (root != null && subRoot != null && root.`val` == subRoot.`val`) {
            return (sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right))
        }

        return false
    }

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        // phải lấy hết tất cả của cây gốc sau đó so sánh cả root và subRoot 
        // Nếu subRoot chỉ lấy một phần của root gốc thì false
        // vẫn là đệ quy 
        if (root == null) {
            return false
        }
        if (subRoot == null) {
            return true
        }

        if (sameTree(root, subRoot)) {
            return true
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
   }
}
