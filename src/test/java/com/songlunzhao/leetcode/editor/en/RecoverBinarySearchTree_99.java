//You are given the root of a binary search tree (BST),
// where exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its struc
//ture. 
//
// Follow up: A solution using O(n) space is pretty straight forward. Could you 
//devise a constant space solution? 
//
// 
// Example 1: 
//
// 
//Input: root = [1,3,null,null,2]
//Output: [3,1,null,null,2]
//Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 mak
//es the BST valid.
// 
//
// Example 2: 
//
// 
//Input: root = [3,1,4,null,null,2]
//Output: [2,1,4,null,null,3]
//Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 a
//nd 3 makes the BST valid.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 1000]. 
// -231 <= Node.val <= 231 - 1 
// 
// Related Topics Tree Depth-First Search Binary Search Tree Binary Tree 
// 👍 2808 👎 107


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

public class RecoverBinarySearchTree_99 {

    
    
    @Test
    public void testRecoverBinarySearchTree(){
       Solution solution = new RecoverBinarySearchTree_99()
                        .new Solution();
        Integer[] input = new Integer[]{1,3,null,null,2};
        TreeNode root = TreeNode.buildBinaryTree(input);
        solution.recoverTree(root);
        Integer[] output = TreeNode.buildArray(root);
        input = new Integer[]{3,1,4,null,null,2};
        root = TreeNode.buildBinaryTree(input);
        solution.recoverTree(root);
        PrintUtils.printArray(output);
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
    TreeNode preNode, firstNode, secondNode;
    public void recoverTree(TreeNode root) {
        if(root==null) return;
        preNode=null; firstNode=null; secondNode=null;
        inorderTraversal(root);
        int tmp = firstNode.val;
        firstNode.val= secondNode.val;
        secondNode.val=tmp;
        return;
    }

    private void inorderTraversal(TreeNode root){
        if(root==null) return;
        inorderTraversal(root.left);
        if(preNode!=null && preNode.val>=root.val){
            secondNode = root;
            if(firstNode==null) {
                firstNode = preNode;
            } else {
                return;
            }

        }
        preNode = root;
        inorderTraversal(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
