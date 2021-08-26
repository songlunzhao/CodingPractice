//Given the root of a binary tree where every node has a unique value and a targ
//et integer k, return the value of the nearest leaf node to the target k in the t
//ree. 
//
// Nearest to a leaf means the least number of edges traveled on the binary tree
// to reach any leaf of the tree. Also, a node is called a leaf if it has no child
//ren. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,3,2], k = 1
//Output: 2
//Explanation: Either 2 or 3 is the nearest leaf node to the target of 1.
// 
//
// Example 2: 
//
// 
//Input: root = [1], k = 1
//Output: 1
//Explanation: The nearest leaf node is the root node itself.
// 
//
// Example 3: 
//
// 
//Input: root = [1,2,3,4,null,null,null,5,null,6], k = 2
//Output: 3
//Explanation: The leaf node with value 3 (and not the leaf node with value 6) i
//s nearest to the node with value 2.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 1000]. 
// 1 <= Node.val <= 1000 
// All the values of the tree are unique. 
// There exist some node in the tree where Node.val == k. 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 631 👎 121


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

public class ClosestLeafInABinaryTree_742 {

    
    
    @Test
    public void testClosestLeafInABinaryTree(){
       Solution solution = new ClosestLeafInABinaryTree_742()
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
    public int findClosestLeaf(TreeNode root, int k) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
