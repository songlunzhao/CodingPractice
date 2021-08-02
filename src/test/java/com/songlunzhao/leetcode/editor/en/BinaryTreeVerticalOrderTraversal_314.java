//Given the root of a binary tree, return the vertical order traversal of its no
//des' values. (i.e., from top to bottom, column by column). 
//
// If two nodes are in the same row and column, the order should be from left to
// right. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[9],[3,15],[20],[7]]
// 
//
// Example 2: 
//
// 
//Input: root = [3,9,8,4,0,1,7]
//Output: [[4],[9],[3,0,1],[8],[7]]
// 
//
// Example 3: 
//
// 
//Input: root = [3,9,8,4,0,1,7,null,null,null,2,5]
//Output: [[4],[9,5],[3,0,1],[8,2],[7]]
// 
//
// Example 4: 
//
// 
//Input: root = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
// Related Topics Hash Table Tree Depth-First Search Breadth-First Search Binary
// Tree 
// 👍 1597 👎 213


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class BinaryTreeVerticalOrderTraversal_314 {

    
    
    @Test
    public void testBinaryTreeVerticalOrderTraversal(){
       Solution solution = new BinaryTreeVerticalOrderTraversal_314()
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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
