/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
  struct ListNode * answer = (struct ListNode *)malloc(sizeof(struct ListNode));
  struct ListNode * current = answer;
  int carry = 0;
  while(l1 != NULL || l2 != NULL){
    int x = l1 != NULL ? l1 -> val : 0;
    int y = l2 != NULL ? l2 -> val : 0;
    int sum = x + y + carry;
    carry = sum >= 10 ? 1 : 0;
    struct ListNode * newNode = (struct ListNode *) malloc(sizeof(struct ListNode));
    newNode -> val = sum % 10;
    newNode -> next = NULL;
    current -> next = newNode;
    current = current -> next; 
    if(l1 != NULL) l1 = l1 -> next;
    if(l2 != NULL) l2 = l2 -> next;
  }

  if(carry != 0) {
    struct ListNode * newNode = (struct ListNode *) malloc(sizeof(struct ListNode));
    newNode -> val = 1;
    newNode -> next = NULL;
    current -> next = newNode;
  }
  return answer -> next;
}