//Given two integer arrays inorder and postorder where inorder is the inorder tr
//aversal of a binary tree and postorder is the postorder traversal of the same tr
//ee, construct and return the binary tree. 
//
// 
// Example 1: 
//
// 
//Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
//Output: [3,9,20,null,null,15,7]
// 
//
// Example 2: 
//
// 
//Input: inorder = [-1], postorder = [-1]
//Output: [-1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= inorder.length <= 3000 
// postorder.length == inorder.length 
// -3000 <= inorder[i], postorder[i] <= 3000 
// inorder and postorder consist of unique values. 
// Each value of postorder also appears in inorder. 
// inorder is guaranteed to be the inorder traversal of the tree. 
// postorder is guaranteed to be the postorder traversal of the tree. 
// 
// Related Topics Array Hash Table Divide and Conquer Tree Binary Tree 
// 👍 3214 👎 56


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal_106 {

    
    
    @Test
    public void testConstructBinaryTreeFromInorderAndPostorderTraversal(){
       Solution solution = new ConstructBinaryTreeFromInorderAndPostorderTraversal_106()
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
 *
 * inorder -- left, root, right
 * preorder -- root, left, right
 * postorder -- left, right, root
 */
class Solution {
    int postorderidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderidx=postorder.length-1;
        //key-inorder array value, value - inorder array idx
        Map<Integer,Integer> inorderIdxMap = new HashMap<>();
        for(int i=0; i< inorder.length; i++){
            inorderIdxMap.put(inorder[i], i);
        }
        return buildTree(postorder,0, inorder.length-1, inorderIdxMap);
    }

    /**
     *
     * @param postorder
     * @param left -- inorder left boundary
     * @param right -- inorder right boundary
     * @param inorderIdxMap
     * @return
     */
    private TreeNode buildTree(int[] postorder, int left, int right, Map<Integer,Integer> inorderIdxMap) {
        if(left>right) return null;
        int rootValue = postorder[postorderidx];
        postorderidx--;
        TreeNode root = new TreeNode(rootValue);
        root.right=buildTree(postorder,inorderIdxMap.get(rootValue)+1, right,inorderIdxMap);
        root.left=buildTree(postorder,left, inorderIdxMap.get(rootValue)-1,inorderIdxMap);
        return root;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
