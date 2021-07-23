//Given the root of a binary tree and
// an integer targetSum, return all root-to-leaf paths
// where each path's sum equals targetSum.
//
// A leaf is a node with no children. 
//
// 
// Example 1: 
//
// 
//Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//Output: [[5,4,11,2],[5,8,4,5]]
// 
//
// Example 2: 
//
// 
//Input: root = [1,2,3], targetSum = 5
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1,2], targetSum = 0
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 5000]. 
// -1000 <= Node.val <= 1000 
// -1000 <= targetSum <= 1000 
// 
// Related Topics Backtracking Tree Depth-First Search Binary Tree 
// 👍 3124 👎 89


package com.songlunzhao.leetcode.editor.en;

import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PathSumIi_113 {


    @Test
    public void testPathSumIi() {
        Solution solution = new PathSumIi_113()
                .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) return ans;
            List<Integer> result = new ArrayList<>();
            preorderTraversal(root, targetSum, ans, result);
            return ans;
        }

        private void preorderTraversal(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> result) {
            if (root.left == null && root.right == null) {
                if (targetSum == root.val) {
                    result.add(root.val);
                    List<Integer> tmp = new ArrayList<>(result);
                    ans.add(tmp);
                    result.remove(result.size() - 1);
                }
                return;
            }
            if(root.left!=null){
                result.add(root.val);
                preorderTraversal(root.left, targetSum-root.val, ans, result);
                result.remove(result.size() - 1);
            }
            if(root.right!=null){
                result.add(root.val);
                preorderTraversal(root.right, targetSum-root.val, ans, result);
                result.remove(result.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
