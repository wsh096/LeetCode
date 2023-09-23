/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
   answer := &ListNode{}
   current := answer
   carry := 0
    for l1 != nil || l2 != nil {
      x := 0
      if l1 != nil {
        x = l1.Val
        l1 = l1.Next
      }

      y := 0
      if l2 != nil {
        y = l2.Val
        l2 = l2.Next
      }
      sum := carry + x + y
      carry = sum / 10

      current.Next = &ListNode{Val : sum % 10}
      current = current.Next
    }

    if carry != 0 {
      current.Next = &ListNode{Val : 1}
    }
    return answer.Next
}