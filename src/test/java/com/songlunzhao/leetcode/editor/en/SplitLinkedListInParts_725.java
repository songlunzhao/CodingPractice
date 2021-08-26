//Given the head of a singly linked list and an integer k, split the linked list
// into k consecutive linked list parts. 
//
// The length of each part should be as equal as possible: no two parts should h
//ave a size differing by more than one. This may lead to some parts being null. 
//
// The parts should be in the order of occurrence in the input list, and parts o
//ccurring earlier should always have a size greater than or equal to parts occurr
//ing later. 
//
// Return an array of the k parts. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3], k = 5
//Output: [[1],[2],[3],[],[]]
//Explanation:
//The first element output[0] has output[0].val = 1, output[0].next = null.
//The last element output[4] is null, but its string representation as a ListNod
//e is [].
// 
//
// Example 2: 
//
// 
//Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
//Output: [[1,2,3,4],[5,6,7],[8,9,10]]
//Explanation:
//The input has been split into consecutive parts with size difference at most 1
//, and earlier parts are a larger size than the later parts.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 1000]. 
// 0 <= Node.val <= 1000 
// 1 <= k <= 50 
// 
// Related Topics Linked List 
// 👍 1134 👎 160


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import org.testng.annotations.Test;

public class SplitLinkedListInParts_725 {

    
    
    @Test
    public void testSplitLinkedListInParts(){
       Solution solution = new SplitLinkedListInParts_725()
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
