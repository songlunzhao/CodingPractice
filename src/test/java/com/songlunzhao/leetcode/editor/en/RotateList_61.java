//Given the head of a linked list,
// rotate the list to the right by k places.
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], k = 2
//Output: [4,5,1,2,3]
// 
//
// Example 2: 
//
// 
//Input: head = [0,1,2], k = 4
//Output: [2,0,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 500]. 
// -100 <= Node.val <= 100 
// 0 <= k <= 2 * 109 
// 
// Related Topics Linked List Two Pointers 
// 👍 2796 👎 1180


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.Stack;

public class RotateList_61 {

    
    
    @Test
    public void testRotateList(){
       Solution solution = new RotateList_61()
                        .new Solution();
       Integer[] input = new Integer[]{1,2,3,4,5};
       ListNode head = solution.rotateRight(ListNode.buildList(input),2);
       ListNode.printQueue(head);
        input = new Integer[]{1,2,3,4,5};
      head = solution.rotateRight(ListNode.buildList(input),5);
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode p=head, q=head, tail;
        int steps=0, len=0;
        //get length
        while(p!=null){
            p=p.next;
            len++;
        }
        k=k%len;
        if(k==0) return head;
        p=head;
        while(p!=null && q!=null){
            q=q.next;
            steps++;
            if(steps<=k+1) {
                continue;
            }
            p=p.next;
        }
        tail=p;
        Stack<ListNode> stack = new Stack<>();
        p=p.next;
        while(p!=null){
            stack.push(p);
            p=p.next;
        }
        while(!stack.isEmpty()){
            ListNode node = stack.pop();
            node.next=head;
            head=node;
        }
       tail.next=null;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
