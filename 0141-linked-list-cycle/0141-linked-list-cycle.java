/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.Set;
 import java.util.HashSet;
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        Set<ListNode> set = new HashSet<>();
        while(head.next != null){
         ListNode next = head.next;
            if(set.contains(next)) return true;
            set.add(next);
            head = next;
        }
        return false;
    }
}