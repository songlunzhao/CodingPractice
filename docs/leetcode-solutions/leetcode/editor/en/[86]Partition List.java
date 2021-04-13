//Given the head of a linked list and a value x, partition it such that all node
//s less than x come before nodes greater than or equal to x. 
//
// You should preserve the original relative order of the nodes in each of the t
//wo partitions. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,4,3,2,5,2], x = 3
//Output: [1,2,2,4,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [2,1], x = 2
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 200]. 
// -100 <= Node.val <= 100 
// -200 <= x <= 200 
// 
// Related Topics Linked List Two Pointers 
// 👍 1977 👎 383


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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode p = head, xNode = null, q = null, prevX = null;
        while (p != null) {
            if (p.val >= x) {
                xNode = p;
                break;
            } else {
                q = p;
                p = p.next;
            }
        }
        if (p == null) return head;
        prevX = q;
        q = p;
        p = p.next;
        while (p != null) {
            if (p.val < x) {
                q.next = p.next;
                p.next = xNode;
                if (prevX != null) {
                    prevX.next = p;
                } else {
                    head = p;
                }
                prevX=p;
                p = q.next;
            } else {
                q = p;
                p = p.next;
            }
        }
        return head;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
