//Given the head of a singly linked list and two integers left and right where l
//eft <= right, reverse the nodes of the list from position left to position right
//, and return the reversed list. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]
// 
//
// Example 2: 
//
// 
//Input: head = [5], left = 1, right = 1
//Output: [5]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is n. 
// 1 <= n <= 500 
// -500 <= Node.val <= 500 
// 1 <= left <= right <= n 
// 
//
// 
//Follow up: Could you do it in one pass? Related Topics Linked List 
// 👍 3525 👎 183


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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null && head.next == null) return head;
        ListNode p = head, q = null, r = null;
        //p=current node,
        //q=previous node of p, becomes previous node of end after loop;
        //r=previous node of start
        int i = 0;
        ListNode start = null, end = null;
        while (p != null) {
            i++;
            if (i == left) {
                start = p;
                r = q;
            }
            if (i == right) {
                end = p;
                break;
            }
            q = p;
            p = p.next;
        }
        p = p.next;
        if(end==null) end=q;

        //list is like r->start->...->end->p
        //after reverse list become r->end->...->start->p
        reverseBetween(start, end);
        if (r != end && r!=null) {
            r.next = end;
        }else {
            head=end;
        }
        if (p != start && start != null) {
            start.next = p;
        }
        return head;
    }

    public void reverseBetween(ListNode start, ListNode end) {
        if (start == null || start.next==null || start==end) return;
        ListNode p = start, q=p.next, r;
        while (p != end && q!=null) {
            r = q.next;
            q.next=p;
            p=q;
            q=r;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
