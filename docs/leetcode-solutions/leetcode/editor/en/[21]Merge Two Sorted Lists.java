//Merge two sorted linked lists and return it as a sorted list. The list should 
//be made by splicing together the nodes of the first two lists. 
//
// 
// Example 1: 
//
// 
//Input: l1 = [1,2,4], l2 = [1,3,4]
//Output: [1,1,2,3,4,4]
// 
//
// Example 2: 
//
// 
//Input: l1 = [], l2 = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: l1 = [], l2 = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both lists is in the range [0, 50]. 
// -100 <= Node.val <= 100 
// Both l1 and l2 are sorted in non-decreasing order. 
// 
// Related Topics Linked List Recursion 
// 👍 6380 👎 746


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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //following logic is too complicated, better to use a dummy head
        ListNode head=null, current=null;
        ListNode l1Head=l1;
        ListNode l2Head=l2;
        while(l1Head!=null && l2Head!=null){
            if(l1Head.val<l2Head.val){
                if(head==null){
                    head=l1Head;
                    current=l1Head;
                } else {
                    current.next=l1Head;
                    current=current.next;
                }
                l1Head=l1Head.next;
            } else {
                if(head==null){
                    head=l2Head;
                    current=l2Head;
                } else {
                    current.next=l2Head;
                    current=current.next;
                }
                l2Head=l2Head.next;
            }
        }
        if(l1Head!=null) {
            if(head==null){
                head=l1Head;
            } else {
                current.next=l1Head;
            }
        } else {
            if(head==null){
                head=l2Head;
            } else {
                current.next=l2Head;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
