//Given the root of a binary tree,
// return the zigzag level order traversal of its nodes' values.
// (i.e., from left to right, then right to left for the next level and alternate between).
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[20,9],[15,7]]
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
// -100 <= Node.val <= 100 
// 
// Related Topics Tree Breadth-First Search Binary Tree 
// 👍 3934 👎 132


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal_103 {

    
    
    @Test
    public void testBinaryTreeZigzagLevelOrderTraversal(){
       Solution solution = new BinaryTreeZigzagLevelOrderTraversal_103()
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        boolean fromLeft = true;
        queue.add(root);
        int levelSize = 1;
        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            int size = levelSize;
            levelSize=0;
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(fromLeft){
                    list.add(node.val);
                } else {
                    list.addFirst(node.val);
                }
                if(node.left!=null) {
                    levelSize++;
                    queue.add(node.left);
                }
                if(node.right!=null) {
                    levelSize++;
                    queue.add(node.right);
                }
            }
            if(!list.isEmpty())
                ans.add(list);
            fromLeft=!fromLeft;

        }
        return ans;

    }
    public List<List<Integer>> zigzagLevelOrder_old(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(root);
        while(true){
            List<Integer> levelList = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node!=null){
                    levelList.add(node.val);
                    stack.push(node.left);
                    stack.push(node.right);
                }
            }
            if(levelList.isEmpty())
                break;
            else
                ans.add(levelList);
            levelList = new ArrayList<>();
            Stack<TreeNode> tmpStack = new Stack<>();
            while (!stack.isEmpty()){
                TreeNode node = stack.pop();
                if(node!=null){
                    levelList.add(node.val);
                    tmpStack.push(node.right);
                    tmpStack.push(node.left);
                }
            }
            if(levelList.isEmpty())
                break;
            else {
                ans.add(levelList);
                while(!tmpStack.isEmpty()){
                    queue.add(tmpStack.pop());
                }
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
