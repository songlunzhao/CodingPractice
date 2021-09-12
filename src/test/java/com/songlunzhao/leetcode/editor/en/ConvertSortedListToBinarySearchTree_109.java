//Given the head of a singly linked list where elements
// are sorted in ascending order, convert it to a height balanced BST.
//
// For this problem, a height-balanced binary tree is defined as a binary tree i
//n which the depth of the two subtrees of every node never differ by more than 1.
// 
//
// 
// Example 1: 
//
// 
//Input: head = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the 
//shown height balanced BST.
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
//Input: head = [0]
//Output: [0]
// 
//
// Example 4: 
//
// 
//Input: head = [1,3]
//Output: [3,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in head is in the range [0, 2 * 104]. 
// -105 <= Node.val <= 105 
// 
// Related Topics Linked List Divide and Conquer Tree Binary Search Tree Binary 
//Tree 
// 👍 3733 👎 104


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.ListNode;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTree_109 {

    
    
    @Test
    public void testConvertSortedListToBinarySearchTree(){
       Solution solution = new ConvertSortedListToBinarySearchTree_109()
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        return buildTree(head,null);
    }
    public TreeNode sortedListToBST_ArraySolution(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        return buildTree(list, 0, list.size()-1);
    }

    private TreeNode buildTree(List<Integer> list, int left, int right){
        if(left>right) return null;
        int idx = (left+right)/2;
        TreeNode root = new TreeNode(list.get(idx));
        root.left = buildTree(list, left, idx-1);
        root.right = buildTree(list, idx+1, right);
        return root;
    }

    private TreeNode buildTree(ListNode left, ListNode right){
        if(left==right) return null;
        ListNode mid = getMedian(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(left,mid);
        root.right = buildTree(mid.next,right);
        return root;
    }

    private ListNode getMedian(ListNode left, ListNode right){
        ListNode slow = left, fast = left;
        while(fast!=right && fast.next!=right){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
