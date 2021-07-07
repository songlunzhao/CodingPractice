//Given a linked list, reverse the nodes of a linked list k at a time and return
// its modified list. 
//
// k is a positive integer and is less than or equal to the length of the linked
// list. If the number of nodes is not a multiple of k then left-out nodes, in the
// end, should remain as it is. 
//
// You may not alter the values in the list's nodes, only nodes themselves may b
//e changed. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1,2,3,4,5], k = 3
//Output: [3,2,1,4,5]
// 
//
// Example 3: 
//
// 
//Input: head = [1,2,3,4,5], k = 1
//Output: [1,2,3,4,5]
// 
//
// Example 4: 
//
// 
//Input: head = [1], k = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range sz. 
// 1 <= sz <= 5000 
// 0 <= Node.val <= 1000 
// 1 <= k <= sz 
// 
//
// 
//Follow-up: Can you solve the problem in O(1) extra memory space? Related Topic
//s Linked List Recursion 
// 👍 4128 👎 414


package com.songlunzhao.leetcode.editor.en;

import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class ReverseNodesInKGroup_25 {


    @Test
    public void testReverseNodesInKGroup() {
        Solution solution = new ReverseNodesInKGroup_25()
                .new Solution();
        ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5});
        head = solution.reverseKGroup(head, 2);
        ListNode.printQueue(head);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || head.next == null || k == 1) return head;
            ListNode p=head, q, preP=null;
            head = null;
            while (p != null) {
                ListNode kthNode = getKthNode(p, k);
                if(kthNode==null) {
                    break;
                }
                if(head==null){
                    head = kthNode;
                }
                q = kthNode.next;
                reverseList(p, kthNode);
                if(preP!=null){
                    preP.next=kthNode;
                }
                preP=p;
                p=q;
            }

            //when kthNode==null || kthNode is the last node of the original linkedlist
            if(preP!=null){
                preP.next=p;
            }
            return head;
        }

        void reverseList(ListNode start, ListNode end) {
            ListNode p = start, q = p.next, r = null;
            while (p != null && q != null && p != end) {
                r = q.next;
                q.next = p;
                p = q;
                q = r;
            }
        }

        ListNode getKthNode(ListNode p, int k) {
            int step = 1;
            while (p != null && step < k) {
                p = p.next;
                step++;
            }
            return p;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
