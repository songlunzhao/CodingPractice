//Given a linked list, reverse the nodes of a linked list k at a time and return
// its modified list. 
//
// k is a positive integer and is less than or equal to the length of the linked
// list. If the number of nodes is not a multiple of k then left-out nodes, in the
// end, should remain as it is. 
//
// You may not alter the values in the list's nodes, only nodes themselves may b
//e changed. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1,2,3,4,5], k = 3
//Output: [3,2,1,4,5]
// 
//
// Example 3: 
//
// 
//Input: head = [1,2,3,4,5], k = 1
//Output: [1,2,3,4,5]
// 
//
// Example 4: 
//
// 
//Input: head = [1], k = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range sz. 
// 1 <= sz <= 5000 
// 0 <= Node.val <= 1000 
// 1 <= k <= sz 
// 
//
// 
//Follow-up: Can you solve the problem in O(1) extra memory space? Related Topic
//s Linked List 
// 👍 3924 👎 406


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k<=1) return head;
        ListNode start=head, end, cur=head, prevEnd=null;
        int i=0;
        while(cur!=null){
            i++;
            if(i==k){
                end=cur; //reverse sub-k list
                ListNode newStart=end.next;
                reverseBetween(start,end);//start->end reversed to start<-end
                start.next=newStart;
                if(start==head) {
                    head=end;
                }
                if(prevEnd!=null){
                    prevEnd.next=end;
                }
                prevEnd=start;
                start=newStart;
                i=0;
                cur=start;
            } else {
                cur=cur.next;
            }

        }
        return head;
    }

    private void reverseBetween(ListNode start, ListNode end ) {
        if(start==null || start.next==null || start==end) return;
        ListNode p=start, q=start.next, r;
        while(p!=end && q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }
        return;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
