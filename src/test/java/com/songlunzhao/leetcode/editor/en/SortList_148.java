//Given the head of a linked list,
// return the list after sorting it in ascending order.
//
// Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.
//e. constant space)? 
//
// 
// Example 1: 
//
// 
//Input: head = [4,2,1,3]
//Output: [1,2,3,4]
// 
//
// Example 2: 
//
// 
//Input: head = [-1,5,3,4,0]
//Output: [-1,0,3,4,5]
// 
//
// Example 3: 
//
// 
//Input: head = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 5 * 104]. 
// -105 <= Node.val <= 105 
// 
// Related Topics Linked List Two Pointers Divide and Conquer Sorting Merge Sort
// 
// 👍 4996 👎 193


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class SortList_148 {

    
    
    @Test
    public void testSortList(){
       Solution solution = new SortList_148()
                        .new Solution();
       Integer[]input = new Integer[] {4,2,1,3};

       solution.sortList(ListNode.buildList(input));
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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = getMidAndBreakList(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);//mid become new head, pre-mid.next is set to null
        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    /**
     * get middle and set preMid's next to null
     * break list into 2 lists
     * @param head
     * @return
     */
    ListNode getMidAndBreakList(ListNode head) {
        ListNode fast=head,slow=head,preslow=null;
        while (fast != null && fast.next != null) {
            fast=fast.next.next;
            preslow=slow;
            slow=slow.next;

        }
        preslow.next=null;
        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
