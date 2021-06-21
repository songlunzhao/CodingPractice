//You are given two non-empty linked lists representing two non-negative integer
//s. The digits are stored in reverse order, and each of their nodes contains a si
//ngle digit. Add the two numbers and return the sum as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the nu
//mber 0 itself. 
//
// 
// Example 1: 
//
// 
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
// 
//
// Example 2: 
//
// 
//Input: l1 = [0], l2 = [0]
//Output: [0]
// 
//
// Example 3: 
//
// 
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in each linked list is in the range [1, 100]. 
// 0 <= Node.val <= 9 
// It is guaranteed that the list represents a number that does not have leading
// zeros. 
// 
// Related Topics Linked List Math Recursion 
// 👍 12294 👎 2853


package com.songlunzhao.leetcode.editor.en;

import com.songlunzhao.leetcode.editor.en.common.ListNode;

public class AddTwoNumbers_2 {

    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers_2()
                .new Solution();
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            ListNode p = l1, q = l2, r = new ListNode(), head=r;
            int carryOver = 0;
            while (p != null && q != null) {
                int sum = p.val + q.val + carryOver;
                ListNode node = new ListNode(sum % 10);
                r.next = node;
                if (sum >= 10) {
                    carryOver = 1;
                } else {
                    carryOver = 0;
                }
                p = p.next;
                q = q.next;
                r = r.next;

            }
            if (p == null && q == null) {
                if (carryOver == 1) {
                    ListNode node = new ListNode(1);
                    r.next = node;
                }
            } else {
                if (p == null) {
                    p = q;
                }
                while (p != null) {
                    int sum = p.val + carryOver;
                    ListNode node = new ListNode(sum % 10);
                    r.next=node;
                    if (sum >= 10) {
                        carryOver = 1;
                    } else {
                        carryOver = 0;
                    }
                    p = p.next;
                    r=r.next;
                }
                if (carryOver == 1) {
                    ListNode node = new ListNode(1);
                    r.next = node;
                }
            }

            return head.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
