//Given the root of a binary tree, return the inorder traversal of
// its nodes' values.
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3]
//Output: [1,3,2]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// Example 4: 
//
// 
//Input: root = [1,2]
//Output: [2,1]
// 
//
// Example 5: 
//
// 
//Input: root = [1,null,2]
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Recursive solution is trivial, could you do it iteratively? Related
// Topics Stack Tree Depth-First Search Binary Tree 
// 👍 5170 👎 222


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {

    
    
    @Test
    public void testBinaryTreeInorderTraversal(){
       Solution solution = new BinaryTreeInorderTraversal_94()
                        .new Solution();
       Integer[] input = new Integer[]{1,null,2,3};
        List<Integer> output;
       input = new Integer[]{1,2,3,4,5};
       output =solution.inorderTraversal(TreeNode.buildBinaryTree(input));
        PrintUtils.printList(output);
        output =solution.preorderTraversal(TreeNode.buildBinaryTree(input));
        PrintUtils.printList(output);
        output =solution.postorderTraversal(TreeNode.buildBinaryTree(input));
        PrintUtils.printList(output);
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
 *
 * Depth First Traversals:
 * (a) Inorder (Left, Root, Right) : 4 2 5 1 3
 * (b) Preorder (Root, Left, Right) : 1 2 4 5 3
 * (c) Postorder (Left, Right, Root) : 4 5 2 3 1
 * Breadth First or Level Order Traversal : 1 2 3 4 5
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTraversal(root, ans);
        return ans;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderTraversal(root, ans);
        return ans;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderTraversal(root, ans);
        return ans;
    }

    private void postorderTraversal(TreeNode root, List<Integer> ans) {
        if(root==null) return;
        postorderTraversal(root.left, ans);
        postorderTraversal(root.right, ans);
        ans.add(root.val);
    }

    private void preorderTraversal(TreeNode root, List<Integer> ans) {
        if(root==null) return;
        ans.add(root.val);
        preorderTraversal(root.left, ans);
        preorderTraversal(root.right, ans);
    }

    private void inorderTraversal(TreeNode root, List<Integer> ans) {
        if(root==null) return;
        inorderTraversal(root.left, ans);
        ans.add(root.val);
        inorderTraversal(root.right, ans);

    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
