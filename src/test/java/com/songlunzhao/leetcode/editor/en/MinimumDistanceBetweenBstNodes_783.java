//Given the root of a Binary Search Tree (BST), return the minimum difference be
//tween the values of any two different nodes in the tree. 
//
// 
// Example 1: 
//
// 
//Input: root = [4,2,6,1,3]
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: root = [1,0,48,null,null,12,49]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 100]. 
// 0 <= Node.val <= 105 
// 
//
// 
// Note: This question is the same as 530: https://leetcode.com/problems/minimum
//-absolute-difference-in-bst/ 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Search Tre
//e Binary Tree 
// 👍 1215 👎 275


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MinimumDistanceBetweenBstNodes_783 {

    
    
    @Test
    public void testMinimumDistanceBetweenBstNodes(){
       Solution solution = new MinimumDistanceBetweenBstNodes_783()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
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
    public int minDiffInBST(TreeNode root) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
