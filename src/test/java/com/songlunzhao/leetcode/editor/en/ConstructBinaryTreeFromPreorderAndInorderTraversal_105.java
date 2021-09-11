//Given two integer arrays preorder and inorder
// where preorder is the preorder traversal of a binary tree and
// inorder is the inorder traversal of the same tree,
// construct and return the binary tree. 
//
// 
// Example 1: 
//
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// Example 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder and inorder consist of unique values. 
// Each value of inorder also appears in preorder. 
// preorder is guaranteed to be the preorder traversal of the tree. 
// inorder is guaranteed to be the inorder traversal of the tree. 
// 
// Related Topics Array Hash Table Divide and Conquer Tree Binary Tree 
// 👍 6419 👎 157


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal_105 {

    
    
    @Test
    public void testConstructBinaryTreeFromPreorderAndInorderTraversal(){
       Solution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal_105()
                        .new Solution();
       int[] preorder = new int[] {3,9,20,15,7};
       int[] inorder = new int[] {9,3,15,20,7};
       TreeNode root = solution.buildTree(preorder,inorder);
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
 * inorder -- left, root, right
 * preorder -- root, left, right
 * postorder -- left, right, root
 *
 */
class Solution {
    int preorderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //key- node value, value - node idx in array
        Map<Integer, Integer> inorderIdxMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inorderIdxMap.put(inorder[i], i);
        }
        preorderIndex=0;
        return buildTree(preorder,0, inorder.length-1, inorderIdxMap);
    }

    /**
     *
     * @param preorder preorder node array
     * @param left   left idx of inorder array
     * @param right  right idx of inorder array
     * @param inorderMap
     * @return
     */
    private TreeNode buildTree(int[]preorder,  int left, int right, Map<Integer, Integer> inorderMap){
        if(left>right ) return null;
        int rootValue = preorder[preorderIndex];
        preorderIndex++;
        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree(preorder, left, inorderMap.get(rootValue)-1, inorderMap);
        root.right = buildTree(preorder, inorderMap.get(rootValue)+1, right, inorderMap);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
