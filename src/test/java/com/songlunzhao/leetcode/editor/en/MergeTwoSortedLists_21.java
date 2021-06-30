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
// 👍 7216 👎 799


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class MergeTwoSortedLists_21 {

    
    
    @Test
    public void testMergeTwoSortedLists(){
       Solution solution = new MergeTwoSortedLists_21()
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p=l1, q=l2, head=null, r=null, preR=null;
        while(p!=null && q!=null){
            if(p.val<q.val){
                r=p;
                p=p.next;
            } else {
                r=q;
                q=q.next;
            }
            if(head==null){
                head = r;
            }
            if(preR!=null){
                preR.next=r;
            }
            preR=r;
        }
        if(p!=null){
            if(head==null)
                head=p;
            else
                preR.next=p;
        } else if(q!=null){
            if(head==null)
                head=q;
            else
                preR.next=q;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
