//You need to construct a binary tree from a string consisting of parenthesis an
//d integers. 
//
// The whole input represents a binary tree. It contains an integer followed by 
//zero, one or two pairs of parenthesis. The integer represents the root's value a
//nd a pair of parenthesis contains a child binary tree with the same structure. 
//
// You always start to construct the left child node of the parent first if it e
//xists. 
//
// 
// Example 1: 
//
// 
//Input: s = "4(2(3)(1))(6(5))"
//Output: [4,2,6,3,1,5]
// 
//
// Example 2: 
//
// 
//Input: s = "4(2(3)(1))(6(5)(7))"
//Output: [4,2,6,3,1,5,7]
// 
//
// Example 3: 
//
// 
//Input: s = "-4(2(3)(1))(6(5)(7))"
//Output: [-4,2,6,3,1,5,7]
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 3 * 104 
// s consists of digits, '(', ')', and '-' only. 
// 
// Related Topics String Tree Depth-First Search Binary Tree 
// 👍 683 👎 116


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ConstructBinaryTreeFromString_536 {

    
    
    @Test
    public void testConstructBinaryTreeFromString(){
       Solution solution = new ConstructBinaryTreeFromString_536()
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
    public TreeNode str2tree(String s) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
