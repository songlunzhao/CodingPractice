//Given the roots of two binary trees p and q, write a function to check if they
// are the same or not. 
//
// Two binary trees are considered the same if they are structurally identical, 
//and the nodes have the same value. 
//
// 
// Example 1: 
//
// 
//Input: p = [1,2,3], q = [1,2,3]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: p = [1,2], q = [1,null,2]
//Output: false
// 
//
// Example 3: 
//
// 
//Input: p = [1,2,1], q = [1,1,2]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both trees is in the range [0, 100]. 
// -104 <= Node.val <= 104 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 3624 👎 94


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

public class SameTree_100 {

    
    
    @Test
    public void testSameTree(){
       Solution solution = new SameTree_100()
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p,q);
    }

    private boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if((p==null && q!=null )||(p!=null && q==null) ) return false;
        if(p.val!=q.val) return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
