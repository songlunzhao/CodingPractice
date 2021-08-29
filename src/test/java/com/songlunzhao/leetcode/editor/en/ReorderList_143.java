//You are given the head of a singly linked-list.
// The list can be represented as
//: 
//
// 
//L0 → L1 → … → Ln - 1 → Ln
// 
//
// Reorder the list to be on the following form: 
//
// 
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// 
//
// You may not modify the values in the list's nodes. Only nodes themselves may 
//be changed. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]
// 
//
// Example 2: 
//
// 
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [1, 5 * 104]. 
// 1 <= Node.val <= 1000 
// 
// Related Topics Linked List Two Pointers Stack Recursion 
// 👍 3776 👎 161


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ReorderList_143 {

    
    
    @Test
    public void testReorderList(){
       Solution solution = new ReorderList_143()
                        .new Solution();
       ListNode head = ListNode.buildList(new Integer[]{1,2,3,4});
       solution.reorderList(head);
       ListNode.printQueue(head);
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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        Deque<ListNode> deque = new LinkedList<>();
        ListNode cur = head;
        while(cur!=null){
            deque.add(cur);
            cur=cur.next;
        }
        head = deque.pollFirst();
        cur=head;
        System.out.println(cur.val);
        boolean getFirst=false;
        while(!deque.isEmpty()){
            if(getFirst){
                cur.next=deque.pollFirst();
            } else {
                cur.next=deque.pollLast();
            }
            cur=cur.next;
            getFirst=!getFirst;
            System.out.println(cur.val);
        }
        cur.next=null;
        return;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
