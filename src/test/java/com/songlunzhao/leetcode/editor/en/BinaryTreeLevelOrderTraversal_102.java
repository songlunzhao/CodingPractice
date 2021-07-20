//Given the root of a binary tree, return the level order traversal of its nodes
//' values. (i.e., from left to right, level by level). 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[9,20],[15,7]]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: [[1]]
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 2000]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics Tree Breadth-First Search Binary Tree 
// 👍 5293 👎 113


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal_102 {

    
    
    @Test
    public void testBinaryTreeLevelOrderTraversal(){
       Solution solution = new BinaryTreeLevelOrderTraversal_102()
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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.add(root);
        while(true) {
            Queue<TreeNode> childNodes = new LinkedList<>();
            List<Integer> values = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if(node!=null){
                    values.add(node.val);
                    childNodes.add(node.left);
                    childNodes.add(node.right);
                }
            }
            if(!values.isEmpty()) {
                ans.add(values);
            }
            if(childNodes.isEmpty()){
                break;
            } else {
                queue.addAll(childNodes);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
