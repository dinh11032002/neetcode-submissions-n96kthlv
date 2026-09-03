/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        val list = ArrayList<Int>()
        var curr = head

        while (curr != null) {
            list.add(curr.`val`)
            curr = curr.next
        }

        var left = 0
        var right = list.size - 1
        
        while (left < right) {
            if (list[left] != list[right])  {
                return false
            }
            left++
            right--
        }

        return true
    }
}
