//Given the root of a binary tree,
// flatten the tree into a "linked list":
//
// 
// The "linked list" should use the same TreeNode class where the right child po
//inter points to the next node in the list and the left child pointer is always n
//ull. 
// The "linked list" should be in the same order as a pre-order traversal of the
// binary tree. 
// 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,5,3,4,null,6]
//Output: [1,null,2,null,3,null,4,null,5,null,6]
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
//Input: root = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 2000]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Can you flatten the tree in-place (with O(1) extra space)? Related 
//Topics Linked List Stack Tree Depth-First Search Binary Tree 
// 👍 4946 👎 425


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList_114 {

    
    
    @Test
    public void testFlattenBinaryTreeToLinkedList(){
       Solution solution = new FlattenBinaryTreeToLinkedList_114()
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
    public void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        preorderTraversal(root,nodes);
        for(int i=1; i<nodes.size(); i++){
            TreeNode preNode = nodes.get(i-1);
            preNode.left=null;
            preNode.right=nodes.get(i);
        }
    }

    private void preorderTraversal(TreeNode root, List<TreeNode> nodes){
        if(root==null) return;
        nodes.add(root);
        preorderTraversal(root.left, nodes);
        preorderTraversal(root.right, nodes);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
