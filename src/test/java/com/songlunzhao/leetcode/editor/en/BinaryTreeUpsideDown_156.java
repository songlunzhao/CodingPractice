//Given the root of a binary tree,
// turn the tree upside down and return the new
//root. 
//
// You can turn a binary tree upside down with the following steps: 
//
// 
// The original left child becomes the new root. 
// The original root becomes the new right child. 
// The original right child becomes the new left child. 
// 
//
// 
//
// The mentioned steps are done level by level, it is guaranteed that every node
// in the given tree has either 0 or 2 children. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,4,5]
//Output: [4,5,2,null,null,3,1]
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
// 
// Constraints: 
//
// 
// The number of nodes in the tree will be in the range [0, 10]. 
// 1 <= Node.val <= 10 
// Every right node in the tree has a sibling (a left node that shares the same 
//parent). 
// 
// Related Topics Tree Depth-First Search Binary Tree 
// 👍 7 👎 12


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

public class BinaryTreeUpsideDown_156 {

    
    
    @Test
    public void testBinaryTreeUpsideDown(){
       Solution solution = new BinaryTreeUpsideDown_156()
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
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        return inorderTraversal(root);
    }

    private TreeNode inorderTraversal(TreeNode root) {
        if(root==null || root.left==null) return root;
        TreeNode left = root.left, right=root.right;
        TreeNode node = inorderTraversal(left);
        left.right=root;
        left.left = right;
        root.left=null;
        root.right=null;
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
