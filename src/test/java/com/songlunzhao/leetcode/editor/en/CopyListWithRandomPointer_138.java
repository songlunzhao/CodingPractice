//A linked list of length n is given such that each node contains
// an additional
//random pointer, which could point to any node in the list, or null. 
//
// Construct a deep copy of the list. The deep copy should consist of exactly n 
//brand new nodes, where each new node has its value set to the value of its corre
//sponding original node. Both the next and random pointer of the new nodes should
// point to new nodes in the copied list such that the pointers in the original li
//st and copied list represent the same list state. None of the pointers in the ne
//w list should point to nodes in the original list. 
//
// For example, if there are two nodes X and Y in the original list, where X.ran
//dom --> Y, then for the corresponding two nodes x and y in the copied list, x.ra
//ndom --> y. 
//
// Return the head of the copied linked list. 
//
// The linked list is represented in the input/output as a list of n nodes. Each
// node is represented as a pair of [val, random_index] where: 
//
// 
// val: an integer representing Node.val 
// random_index: the index of the node (range from 0 to n-1) that the random poi
//nter points to, or null if it does not point to any node. 
// 
//
// Your code will only be given the head of the original linked list. 
//
// 
// Example 1: 
//
// 
//Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
// 
//
// Example 2: 
//
// 
//Input: head = [[1,1],[2,1]]
//Output: [[1,1],[2,1]]
// 
//
// Example 3: 
//
// 
//
// 
//Input: head = [[3,null],[3,0],[3,null]]
//Output: [[3,null],[3,0],[3,null]]
// 
//
// Example 4: 
//
// 
//Input: head = []
//Output: []
//Explanation: The given linked list is empty (null pointer), so return null.
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 1000 
// -10000 <= Node.val <= 10000 
// Node.random is null or is pointing to some node in the linked list. 
// 
// Related Topics Hash Table Linked List 
// 👍 5750 👎 850


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.Node;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer_138 {

    
    
    @Test
    public void testCopyListWithRandomPointer(){
       Solution solution = new CopyListWithRandomPointer_138()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Map<Node,Integer> nodeMap = new HashMap<>();
        Node p = head;
        int i=0;
        //go through list and put idx to each node
        while(p!=null){
            nodeMap.put(p,i);
            i++;
            p=p.next;
        }
        Node[] newNodes = new Node[nodeMap.size()];
        i=0;p=head;
        while(p!=null){

            if(newNodes[i]==null){
                Node node = new Node(p.val);
                newNodes[i]=node;
            }
            //set next pointer
            if(i>0){
                newNodes[i-1].next=newNodes[i];
            }
            //set random pointer
            if(p.random!=null){
                int idx = nodeMap.get(p.random);
                if(newNodes[idx]==null){
                    Node node = new Node(p.random.val);
                    newNodes[idx]=node;
                }
                newNodes[i].random=newNodes[idx];
            }
            p=p.next;
            i++;
        }

        return newNodes[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
