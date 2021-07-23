//Given the root of a binary tree,
// return all root-to-leaf paths in any order.
//
// A leaf is a node with no children. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,null,5]
//Output: ["1->2->5","1->3"]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: ["1"]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 100]. 
// -100 <= Node.val <= 100 
// 
// Related Topics String Tree Depth-First Search Binary Tree 
// 👍 2852 👎 145


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {

    
    
    @Test
    public void testBinaryTreePaths(){
       Solution solution = new BinaryTreePaths_257()
                        .new Solution();
       Integer[] input = new Integer[]{1,2,3,null,5};
       List<String> ans = solution.binaryTreePaths(TreeNode.buildBinaryTree(input));
        PrintUtils.printStringList(ans);
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        getPath(root, sb, ans);
        return ans;
    }

    private void getPath(TreeNode root, StringBuilder sb, List<String> ans) {
        if(root.left==null && root.right==null){
            ans.add(sb.toString());
        }
        if(root.left!=null){
            int len = sb.length();
            sb.append("->").append(root.left.val);
            getPath(root.left, sb, ans);
            sb.delete(len, sb.length());
        }
        if(root.right!=null){
            int len = sb.length();
            sb.append("->").append(root.right.val);
            getPath(root.right, sb, ans);
            sb.delete(len, sb.length());
        }


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
