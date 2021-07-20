//Given the root of a binary tree, return its maximum depth. 
//
// A binary tree's maximum depth is the number of nodes along the longest path f
//rom the root node down to the farthest leaf node. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 3
// 
//
// Example 2: 
//
// 
//Input: root = [1,null,2]
//Output: 2
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: 0
// 
//
// Example 4: 
//
// 
//Input: root = [0]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 104]. 
// -100 <= Node.val <= 100 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 4371 👎 102


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

public class MaximumDepthOfBinaryTree_104 {

    
    
    @Test
    public void testMaximumDepthOfBinaryTree(){
       Solution solution = new MaximumDepthOfBinaryTree_104()
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
    int max=0;
    public int maxDepth(TreeNode root) {
        max=0;
        inorderTraversal(root,1);
        return max;
    }

    private void inorderTraversal(TreeNode root, int depth) {
        if (root == null) return;
        if(max<depth) max=depth;
        inorderTraversal(root.left, depth+1);
        inorderTraversal(root.right, depth+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
