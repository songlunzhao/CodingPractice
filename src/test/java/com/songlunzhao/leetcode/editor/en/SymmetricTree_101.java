//Given the root of a binary tree, check whether it is a
// mirror of itself (i.e., symmetric around its center).
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,2,3,4,4,3]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: root = [1,2,2,null,3,null,3]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 1000]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Could you solve it both recursively and iteratively? Related Topics
// Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 6738 👎 177


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

public class SymmetricTree_101 {

    
    
    @Test
    public void testSymmetricTree(){
       Solution solution = new SymmetricTree_101()
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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if((p==null && q!=null) || (p!=null && q==null)) return false;
        if(p.val!=q.val) return false;
        return isSymmetric(p.left, q.right) && isSymmetric(p.right,q.left);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
