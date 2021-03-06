//Given the head of a linked list, rotate the list to the right by k places. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], k = 2
//Output: [4,5,1,2,3]
// 
//
// Example 2: 
//
// 
//Input: head = [0,1,2], k = 4
//Output: [2,0,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 500]. 
// -100 <= Node.val <= 100 
// 0 <= k <= 2 * 109 
// 
// Related Topics Linked List Two Pointers 
// 👍 2263 👎 1150


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

/**
 * solution : link tail to head,
 * then caculate where is the new tail of the list.
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode cur = head, tail=null;
        int len=0;
        while(cur!=null){
            len++;
            if(cur.next==null){
                tail=cur;
            }
            cur=cur.next;
        }
        int steps = k%len;
        if(steps==0) return head;

        tail.next=head; //make list a loop;
`
        cur=tail;
        for(int i=0; i<len-steps; i++){
            cur=cur.next;
        }
        head = cur.next;
        cur.next=null;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
