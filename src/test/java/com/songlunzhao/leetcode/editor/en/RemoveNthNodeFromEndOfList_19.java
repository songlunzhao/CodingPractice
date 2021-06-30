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
// 👍 5791 👎 327


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class RemoveNthNodeFromEndOfList_19 {

    
    
    @Test
    public void testRemoveNthNodeFromEndOfList(){
       Solution solution = new RemoveNthNodeFromEndOfList_19()
                        .new Solution();
    }
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p,q, preP=null;
        p=head;
        q=head;
        int i=0;
        while(q!=null && i<n){
            q = q.next;
            i++;
        }
        if(q==null && i==n-1) {
            return p.next;
        } else if (q==null && i<n-1) {
            return head;
        }
        while(q!=null && p!=null){
            q=q.next;
            preP=p;
            p=p.next;
        }
        if(preP==null){
            return p.next;
        } else {
            preP.next = p.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
