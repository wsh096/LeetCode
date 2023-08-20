
import java.util.*;
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Map to keep track of the original nodes and their corresponding copies
        Map<Node, Node> map = new HashMap<>();
        
        // Pointer to traverse the original list
        Node original = head;
        
        // Create copies of the nodes without setting the next and random pointers
        while (original != null) {
            map.put(original, new Node(original.val));
            original = original.next;
        }
        
        // Reset the pointer to the head of the original list
        original = head;
        
        // Set the next and random pointers for the copied nodes
        while (original != null) {
            Node copy = map.get(original);
            copy.next = map.get(original.next);
            copy.random = map.get(original.random);
            original = original.next;
        }
        
        // Return the head of the copied list
        return map.get(head);
    }
}
