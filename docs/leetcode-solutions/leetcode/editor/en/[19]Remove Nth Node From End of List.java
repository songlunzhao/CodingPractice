//Given the head of a linked list, remove the nth node from the end of the list 
//and return its head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1], n = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1,2], n = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is sz. 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
// Follow up: Could you do this in one pass? 
// Related Topics Linked List Two Pointers 
// 👍 5625 👎 317


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *
 *     solution 1 -- 2 pointers advance
 *     solution 2 -- 2 pass algorithm as following
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        ListNode ret = head;
        while (cur!=null) {
            stack.push(cur);
            cur=cur.next;
        }
        int i=0;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            i++;
            if(i==n){
                if(!stack.isEmpty()){
                    ListNode node1 = stack.pop();
                    node1.next=node.next;
                } else {
                    ret = node.next;
                }
            }
        }

        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
