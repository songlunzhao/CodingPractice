//Given the roots of two binary trees root and subRoot, return true if
// there is a subtree of root with the same structure and node values of subRoot and false o
//therwise. 
//
// A subtree of a binary tree tree is a tree that consists of a node in tree and
// all of this node's descendants. The tree tree could also be considered as a sub
//tree of itself. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,4,5,1,2], subRoot = [4,1,2]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the root tree is in the range [1, 2000]. 
// The number of nodes in the subRoot tree is in the range [1, 1000]. 
// -104 <= root.val <= 104 
// -104 <= subRoot.val <= 104 
// 
// Related Topics Tree Depth-First Search String Matching Binary Tree Hash Funct
//ion 
// 👍 3833 👎 187


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Queue;

public class SubtreeOfAnotherTree_572 {

    
    
    @Test
    public void testSubtreeOfAnotherTree(){
       Solution solution = new SubtreeOfAnotherTree_572()
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }

    private boolean dfs(TreeNode root, TreeNode subRoot){
        if(root==null) return false;
        if(compareTree(root, subRoot)) return true;
        return dfs(root.left, subRoot) || dfs(root.right,subRoot);
    }

    private boolean compareTree(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1!=null && root2==null) return false;
        if(root1.val!=root2.val) return false;
        if(!compareTree(root1.left, root2.left))return false;
        if(!compareTree(root1.right, root2.right))return false;
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
