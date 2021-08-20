//Given the root of a binary tree,
// imagine yourself standing on the right side of it,
// return the values of the nodes you can see ordered
// from top to bottom.
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,null,5,null,4]
//Output: [1,3,4]
// 
//
// Example 2: 
//
// 
//Input: root = [1,null,3]
//Output: [1,3]
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
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 4461 👎 239


package com.songlunzhao.leetcode.editor.en;

import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView_199 {


    @Test
    public void testBinaryTreeRightSideView() {
        Solution solution = new BinaryTreeRightSideView_199()
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
        public List<Integer> rightSideView(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> ans = new ArrayList<>();
            if (root == null) return ans;
            queue.add(root);


            while (!queue.isEmpty()) {
                int size = queue.size();
                TreeNode node = null;
                for (int i = 0; i < size; i++) {
                    node = queue.poll();
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                //add the most right node to ans
                ans.add(node.val);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
