/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    struct ListNode* prev=node,*current=node->next;
    while(current!=NULL){
        int temp = prev->val;
        prev->val = current->val;
        current->val = temp;
        if(prev->next->next==NULL){
            prev->next = NULL;
            current = current->next;
        }
        else{
            prev = prev->next;
            current = current->next;
        }
    }
}
