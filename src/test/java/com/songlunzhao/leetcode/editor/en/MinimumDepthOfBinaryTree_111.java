//Given a binary tree, find its minimum depth. 
//
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
// Note: A leaf is a node with no children. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: root = [2,null,3,null,4,null,5,null,6]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 105]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 2742 👎 843


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinimumDepthOfBinaryTree_111 {

    
    
    @Test
    public void testMinimumDepthOfBinaryTree(){
       Solution solution = new MinimumDepthOfBinaryTree_111()
                        .new Solution();
       Integer[] input = new Integer[]{3,9,20,null,null,15,7};
       TreeNode root = TreeNode.buildBinaryTree(input);
       int minDepth = solution.minDepth(root);
       assertEquals(minDepth, 2);
        input = new Integer[]{2,null,3,null,4,null,5,null,6};
        root = TreeNode.buildBinaryTree(input);
        minDepth = solution.minDepth(root);
        assertEquals(minDepth, 5);
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
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        min=Integer.MAX_VALUE;
        if(root==null) return 0;
        inorderTraversal(root,1);
        return min;
    }
    private void inorderTraversal(TreeNode root, int depth) {
        if(root.left==null && root.right==null) {
            if(min>depth) {
                min=depth;
                return;
            }
        }
        if(root.left!=null) {
            inorderTraversal(root.left, depth+1);
        }
        if(root.right!=null) {
            inorderTraversal(root.right, depth+1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
