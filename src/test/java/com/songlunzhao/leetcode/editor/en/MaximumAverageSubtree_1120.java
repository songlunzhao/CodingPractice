//Given the root of a binary tree, find the maximum average value of any subtree
// of that tree. 
//
// (A subtree of a tree is any node of that tree plus all its descendants. The a
//verage value of a tree is the sum of its values, divided by the number of nodes.
//) 
//
// 
//
// Example 1: 
//
// 
//
// 
//Input: [5,6,1]
//Output: 6.00000
//Explanation: 
//For the node with value = 5 we have an average of (5 + 6 + 1) / 3 = 4.
//For the node with value = 6 we have an average of 6 / 1 = 6.
//For the node with value = 1 we have an average of 1 / 1 = 1.
//So the answer is 6 which is the maximum.
// 
//
// 
//
// Note: 
//
// 
// The number of nodes in the tree is between 1 and 5000. 
// Each node will have a value between 0 and 100000. 
// Answers will be accepted as correct if they are within 10^-5 of the correct a
//nswer. 
// 
// Related Topics Tree Depth-First Search Binary Tree 
// 👍 487 👎 15


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MaximumAverageSubtree_1120 {

    
    
    @Test
    public void testMaximumAverageSubtree(){
       Solution solution = new MaximumAverageSubtree_1120()
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
    public double maximumAverageSubtree(TreeNode root) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
