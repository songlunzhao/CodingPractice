//A linked list of length n is given such that each node contains an additional 
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
// 👍 5397 👎 833


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
        Node cur = head;
        Map<Integer, Integer> nodeIndex = new HashMap<>();//node hashcode & node index in list
        List<Node> nodeList = new ArrayList<>();
        List<Node> nodeList1 = new ArrayList<>();

        int idx=0;
        while (cur!=null) {
            nodeIndex.put(cur.hashCode(),idx);
            nodeList.add(cur);

            Node node = new Node(cur.val);
            nodeList1.add(node);
            if(idx>0){
                nodeList1.get(idx-1).next=node;
            }
            idx++;
            cur=cur.next;
        }
        for(int i=0; i<nodeList.size();i++){
            if(nodeList.get(i).random!=null){
                int index = nodeIndex.get(nodeList.get(i).random.hashCode());
                nodeList1.get(i).random=nodeList1.get(index);
            }
        }


        return nodeList1.get(0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
