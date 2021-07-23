//Given a binary search tree (BST),
// find the lowest common ancestor (LCA) of two
// given nodes in the BST. 
//
// According to the definition of LCA on Wikipedia: “The lowest common ancestor 
//is defined between two nodes p and q as the lowest node in T that has both p and
// q as descendants (where we allow a node to be a descendant of itself).” 
//
// 
// Example 1: 
//
// 
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//Output: 6
//Explanation: The LCA of nodes 2 and 8 is 6.
// 
//
// Example 2: 
//
// 
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//Output: 2
//Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant o
//f itself according to the LCA definition.
// 
//
// Example 3: 
//
// 
//Input: root = [2,1], p = 2, q = 1
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 105]. 
// -109 <= Node.val <= 109 
// All Node.val are unique. 
// p != q 
// p and q will exist in the BST. 
// 
// Related Topics Tree Depth-First Search Binary Search Tree Binary Tree 
// 👍 3697 👎 146


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorOfABinarySearchTree_235 {

    
    
    @Test
    public void testLowestCommonAncestorOfABinarySearchTree(){
       Solution solution = new LowestCommonAncestorOfABinarySearchTree_235()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();
        findNode(root, p, pList);
        findNode(root, q, qList);

        for(int i=0; i<Math.min(pList.size(),qList.size()); i++){
            if(pList.get(i)!=qList.get(i)){
                if(i>0)
                    return pList.get(i-1);
                return null;
            }
        }
        if(pList.size()<qList.size()){
            return pList.get(pList.size()-1);
        }
        return qList.get(qList.size()-1);

    }

    private void findNode(TreeNode root, TreeNode p, List<TreeNode> nodeList) {
        if(root==null) return;
        nodeList.add(root);
        if(root.val==p.val) return;
        if(root.val<p.val) {
            findNode(root.right, p, nodeList);
        } else {
            findNode(root.left, p, nodeList);
        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
