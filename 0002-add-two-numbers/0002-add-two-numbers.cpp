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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* answer = new ListNode(0);
        ListNode* temp = answer;
        int carry = 0;
        while(l1 != nullptr || l2 != nullptr || carry != 0){
            int x = (l1 != nullptr) ? l1 -> val : 0;
            int y = (l2 != nullptr) ? l2 -> val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            sum %= 10;

            temp -> next = new ListNode(sum);
            temp = temp -> next;
            l1 = (l1 != nullptr) ? l1 ->next : nullptr;
            l2 = (l2 != nullptr) ? l2 ->next : nullptr;
        }
        return answer -> next;
    }
};