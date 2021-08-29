//Given the root of a binary tree, return the postorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3]
//Output: [3,2,1]
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
// Example 4: 
//
// 
//Input: root = [1,2]
//Output: [2,1]
// 
//
// Example 5: 
//
// 
//Input: root = [1,null,2]
//Output: [2,1]
// 
//
// 
// Constraints: 
//
// 
// The number of the nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Recursive solution is trivial, could you do it iteratively? Related
// Topics Stack Tree Depth-First Search Binary Tree 
// 👍 2859 👎 122


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal_145 {

    
    
    @Test
    public void testBinaryTreePostorderTraversal(){
       Solution solution = new BinaryTreePostorderTraversal_145()
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
//        postorderTraversal(root, ans);
//        postorderTraversalStack(root, ans);
        postorderTraversal2Stack(root, ans);
        return ans;
    }

    private void postorderTraversal2Stack(TreeNode root, List<Integer> ans) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> path = new Stack<>();
        if(root==null) return;
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.peek();
            if(!path.isEmpty() && path.peek()==root){
                ans.add(root.val);
                path.pop();
                stack.pop();
            } else {
                path.push(root);
                if(root.right!=null){
                    stack.push(root.right);
                }
                if(root.left!=null){
                    stack.push(root.left);
                }
            }
        }

    }

    private void postorderTraversalStack(TreeNode root, List<Integer> ans){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while(root!=null || !stack.isEmpty()){
            if(root!=null){
                //push all left nodes to stack
                stack.push(root);
                root = root.left;
            } else {
                //reach left leaf, check if the leaf has right child
                root = stack.peek();
                if(root.right==null || root.right == pre){
                    //dosn't have right child, pop leaf and get value
                    stack.pop();
                    ans.add(root.val);
                    pre = root;
                    root = null; //go back to loop and peek next node
                } else {
                    //left leaf has right child, check right child first
                    //right child will be push to stack
                    root=root.right;
                }
            }
        }
    }
    private void postorderTraversal(TreeNode root, List<Integer> ans) {
        if(root==null) return;
        postorderTraversal(root.left, ans);
        postorderTraversal(root.right, ans);
        ans.add(root.val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
