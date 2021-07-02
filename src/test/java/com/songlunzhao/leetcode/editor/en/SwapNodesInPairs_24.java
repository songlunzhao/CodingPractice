//Given a linked list, swap every two adjacent nodes and return its head. You mu
//st solve the problem without modifying the values in the list's nodes (i.e., onl
//y nodes themselves may be changed.) 
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
// Related Topics Linked List Recursion 
// 👍 3958 👎 219


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class SwapNodesInPairs_24 {

    
    
    @Test
    public void testSwapNodesInPairs(){
       Solution solution = new SwapNodesInPairs_24()
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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p=head, q=p.next, r, preP=null;
        head=q;
        while(p!=null && q!=null){
            if(preP!=null){
                preP.next=q;
            }
            r=q.next;
            q.next=p;
            p.next=r;
            preP=p;
            p=r;
            if(p!=null)
                q=p.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
