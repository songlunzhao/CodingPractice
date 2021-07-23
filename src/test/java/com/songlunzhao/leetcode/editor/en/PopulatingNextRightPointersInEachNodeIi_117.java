//Given a binary tree 
//
// 
//struct Node {
//  int val;
//  Node *left;
//  Node *right;
//  Node *next;
//}
// 
//
// Populate each next pointer to point to its next right node. If there is no ne
//xt right node, the next pointer should be set to NULL. 
//
// Initially, all next pointers are set to NULL. 
//
// 
//
// Follow up: 
//
// 
// You may only use constant extra space. 
// Recursive approach is fine, you may assume implicit stack space does not coun
//t as extra space for this problem. 
// 
//
// 
// Example 1: 
//
// 
//
// 
//Input: root = [1,2,3,4,5,null,7]
//Output: [1,#,2,3,#,4,5,7,#]
//Explanation: Given the above binary tree (Figure A), your function should popu
//late each next pointer to point to its next right node, just like in Figure B. T
//he serialized output is in level order as connected by the next pointers, with '
//#' signifying the end of each level.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the given tree is less than 6000. 
// -100 <= node.val <= 100 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 2667 👎 204


package com.songlunzhao.leetcode.editor.en;

import com.songlunzhao.leetcode.editor.en.common.Node;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeIi_117 {


    @Test
    public void testPopulatingNextRightPointersInEachNodeIi() {
        Solution solution = new PopulatingNextRightPointersInEachNodeIi_117()
                .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

    class Solution {
        public Node connect(Node root) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (true) {
                Queue<Node> levelQueue = new LinkedList<>();
                Node preNode = null;
                while (!queue.isEmpty()) {
                    Node node = queue.poll();
                    if (node != null) {
                        if (preNode != null) {
                            preNode.next = node;
                        }
                        preNode = node;

                        levelQueue.add(node.left);
                        levelQueue.add(node.right);
                    }
                }
                if (levelQueue.isEmpty()) break;
                queue.addAll(levelQueue);
            }

            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
