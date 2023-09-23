# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        answer = ListNode(0)
        current = answer
        carry = 0

        while l1 or l2:
          x = l1.val if l1 else 0
          y = l2 .val if l2 else 0
          _sum = x + y + carry
          carry = _sum // 10

          current.next = ListNode(_sum % 10)   
          current = current.next
          if l1:
            l1 = l1.next
          if l2:
            l2 = l2.next
        
        if carry != 0:
          current.next = ListNode(1)

        return answer.next