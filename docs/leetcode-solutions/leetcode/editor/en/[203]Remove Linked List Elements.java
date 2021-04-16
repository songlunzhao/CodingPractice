//Given the head of a linked list and an integer val, remove all the nodes of th
//e linked list that has Node.val == val, and return the new head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
// 
//
// Example 2: 
//
// 
//Input: head = [], val = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [7,7,7,7], val = 7
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 104]. 
// 1 <= Node.val <= 50 
// 0 <= k <= 50 
// 
// Related Topics Linked List 
// 👍 2612 👎 123


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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null){
            if(head.val==val) head=head.next;
            else break;
        }
        if(head==null) return null;
        ListNode p=head, q=p.next;
        while(p!=null && q!=null){
            if(q.val==val){
                p.next=q.next;
                q=q.next;
                continue;
            }
            p=p.next;
            if(p==null) break;
            q=p.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
