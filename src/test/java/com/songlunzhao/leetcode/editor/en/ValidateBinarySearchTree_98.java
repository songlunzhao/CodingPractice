//Given the root of a binary tree, determine if it is a valid binary search tree
// (BST). 
//
// A valid BST is defined as follows: 
//
// 
// The left subtree of a node contains only nodes with keys less than the node's
// key. 
// The right subtree of a node contains only nodes with keys greater than the no
//de's key. 
// Both the left and right subtrees must also be binary search trees. 
// 
//
// 
// Example 1: 
//
// 
//Input: root = [2,1,3]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: root = [5,1,4,null,null,3,6]
//Output: false
//Explanation: The root node's value is 5 but its right child's value is 4.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 104]. 
// -231 <= Node.val <= 231 - 1 
// 
// Related Topics Tree Depth-First Search Binary Search Tree Binary Tree 
// 👍 6690 👎 727


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ValidateBinarySearchTree_98 {

    
    
    @Test
    public void testValidateBinarySearchTree(){
       Solution solution = new ValidateBinarySearchTree_98()
                        .new Solution();
       Integer[] input = new Integer[]{5,1,4,null,null,3,6};
       assertEquals(solution.isValidBST(TreeNode.buildBinaryTree(input)), false);
        input = new Integer[]{5,4,6,null,null,3,7};
        assertEquals(solution.isValidBST(TreeNode.buildBinaryTree(input)), false);
        input = new Integer[]{-2147483648,null,2147483647};
        assertEquals(solution.isValidBST(TreeNode.buildBinaryTree(input)), true);
        input = new Integer[]{2147483647,-2147483648};
        assertEquals(solution.isValidBST(TreeNode.buildBinaryTree(input)), true);

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
    TreeNode preNode = null;
    public boolean isValidBST(TreeNode root) {
        preNode = null;
        return inorderTraversal(root);
    }

    private boolean inorderTraversal(TreeNode node) {
        if(node == null) return true;
        if(!inorderTraversal(node.left)) return false;
        if(preNode!=null && preNode.val>=node.val) return false;
        preNode=node;
        if(!inorderTraversal(node.right)) return false;
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
