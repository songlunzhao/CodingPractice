//Given a linked list, swap every two adjacent nodes and return its head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
// 
//
// Example 2: 
//
// 
//Input: head = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 100]. 
// 0 <= Node.val <= 100 
// 
//
// 
//Follow up: Can you solve the problem without modifying the values in the list'
//s nodes? (i.e., Only nodes themselves may be changed.) Related Topics Linked Lis
//t Recursion 
// 👍 3501 👎 209


//leetcode submit region begin(Prohibit modification and deletion) public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
/**
 * Definition for singly-linked list.
 *
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode p=head, q=p.next;
        boolean changeHead=true;
        ListNode prevQ=null;
        while(p!=null&&q!=null){
            if(prevQ!=null){
                prevQ.next=q;
            }
            p.next=q.next;
            q.next=p;
            ListNode tmp=q;
            q=p;
            p=tmp;
            if(changeHead){
                head=p;
                changeHead=false;
            }
            p=q.next;
            prevQ=q;
            if(p!=null) q=p.next;
        }

        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
