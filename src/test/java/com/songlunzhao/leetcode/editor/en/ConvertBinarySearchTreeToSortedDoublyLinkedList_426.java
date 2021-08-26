//Convert a Binary Search Tree to a sorted Circular Doubly-Linked List in place.
// 
//
// You can think of the left and right pointers as synonymous to the predecessor
// and successor pointers in a doubly-linked list. For a circular doubly linked li
//st, the predecessor of the first element is the last element, and the successor 
//of the last element is the first element. 
//
// We want to do the transformation in place. After the transformation, the left
// pointer of the tree node should point to its predecessor, and the right pointer
// should point to its successor. You should return the pointer to the smallest el
//ement of the linked list. 
//
// 
// Example 1: 
//
// 
//
// 
//Input: root = [4,2,5,1,3]
//
//
//Output: [1,2,3,4,5]
//
//Explanation: The figure below shows the transformed BST. The solid line indica
//tes the successor relationship, while the dashed line means the predecessor rela
//tionship.
//
// 
//
// Example 2: 
//
// 
//Input: root = [2,1,3]
//Output: [1,2,3]
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: []
//Explanation: Input is an empty tree. Output is also an empty Linked List.
// 
//
// Example 4: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 2000]. 
// -1000 <= Node.val <= 1000 
// All the values of the tree are unique. 
// 
// Related Topics Linked List Stack Tree Depth-First Search Binary Search Tree B
//inary Tree Doubly-Linked List 
// 👍 1516 👎 131


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.Node;
import org.testng.annotations.Test;

public class ConvertBinarySearchTreeToSortedDoublyLinkedList_426 {

    
    
    @Test
    public void testConvertBinarySearchTreeToSortedDoublyLinkedList(){
       Solution solution = new ConvertBinarySearchTreeToSortedDoublyLinkedList_426()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    public Node treeToDoublyList(Node root) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
