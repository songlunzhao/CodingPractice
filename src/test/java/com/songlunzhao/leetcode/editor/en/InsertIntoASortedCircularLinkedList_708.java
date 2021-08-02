//Given a Circular Linked List node, which is sorted in ascending order, write a
// function to insert a value insertVal into the list such that it remains a sorte
//d circular list. The given node can be a reference to any single node in the lis
//t and may not necessarily be the smallest value in the circular list. 
//
// If there are multiple suitable places for insertion, you may choose any place
// to insert the new value. After the insertion, the circular list should remain s
//orted. 
//
// If the list is empty (i.e., the given node is null), you should create a new 
//single circular list and return the reference to that single node. Otherwise, yo
//u should return the originally given node. 
//
// 
// Example 1: 
// 
// 
// 
//Input: head = [3,4,1], insertVal = 2
//Output: [3,4,1,2]
//Explanation: In the figure above, there is a sorted circular list of three ele
//ments. You are given a reference to the node with value 3, and we need to insert
// 2 into the list. The new node should be inserted between node 1 and node 3. Aft
//er the insertion, the list should look like this, and we should still return nod
//e 3.
//
//
//
// 
//
// Example 2: 
//
// 
//Input: head = [], insertVal = 1
//Output: [1]
//Explanation: The list is empty (given head is null). We create a new single ci
//rcular list and return the reference to that single node.
// 
//
// Example 3: 
//
// 
//Input: head = [1], insertVal = 0
//Output: [1,0]
// 
//
// 
// Constraints: 
//
// 
// 0 <= Number of Nodes <= 5 * 104 
// -106 <= Node.val, insertVal <= 106 
// 
// Related Topics Linked List 
// 👍 616 👎 459


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class InsertIntoASortedCircularLinkedList_708 {

    
    
    @Test
    public void testInsertIntoASortedCircularLinkedList(){
       Solution solution = new InsertIntoASortedCircularLinkedList_708()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
