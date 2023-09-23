/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var answer: ListNode? = ListNode(0)
        var current = answer
        var carry = 0
        var p1 = l1
        var p2 = l2

        while (p1 != null || p2 != null) {
            val x = p1?.`val` ?: 0
            val y = p2?.`val` ?: 0
            val sum = x + y + carry
            carry = sum / 10
            current?.next = ListNode(sum % 10)
            current = current?.next
            p1 = p1?.next
            p2 = p2?.next
        }

        if (carry != 0) {
            current?.next = ListNode(1)
        }

        return answer?.next
    }
}
