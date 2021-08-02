//Given the root of a binary search tree and a target value, return the value in
// the BST that is closest to the target. 
//
// 
// Example 1: 
//
// 
//Input: root = [4,2,5,1,3], target = 3.714286
//Output: 4
// 
//
// Example 2: 
//
// 
//Input: root = [1], target = 4.428571
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 104]. 
// 0 <= Node.val <= 109 
// -109 <= target <= 109 
// 
// Related Topics Binary Search Tree Depth-First Search Binary Search Tree Binar
//y Tree 
// 👍 1152 👎 81


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ClosestBinarySearchTreeValue_270 {

    
    
    @Test
    public void testClosestBinarySearchTreeValue(){
       Solution solution = new ClosestBinarySearchTreeValue_270()
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
    public int closestValue(TreeNode root, double target) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
