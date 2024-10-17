/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if(!head -> next) return true;

        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* dummy = NULL;
        ListNode* temp = NULL;

        while(fast && fast -> next){
            fast = fast -> next -> next;
            temp = slow -> next;
            slow -> next = dummy;
            dummy = slow;
            slow = temp;
        }
        if(fast && !fast -> next) slow = slow -> next;
        while(slow){
            if(slow -> val != dummy -> val) return false;
            slow = slow -> next;
            dummy = dummy -> next;
        }
        return true;
    }
};