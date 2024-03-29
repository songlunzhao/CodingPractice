//Serialization is the process of converting a data
// structure or object into a sequence of bits so that it can be
// stored in a file or memory buffer, or transmitted across a network
// connection link to be reconstructed later in the same or an
//other computer environment. 
//
// Design an algorithm to serialize and deserialize an N-ary tree. An N-ary tree
// is a rooted tree in which each node has no more than N children. There is no re
//striction on how your serialization/deserialization algorithm should work. You j
//ust need to ensure that an N-ary tree can be serialized to a string and this str
//ing can be deserialized to the original tree structure. 
//
// For example, you may serialize the following 3-ary tree 
//
// 
//
// as [1 [3[5 6] 2 4]]. Note that this is just an example, you do not necessaril
//y need to follow this format. 
//
// Or you can follow LeetCode's level order traversal serialization format, wher
//e each group of children is separated by the null value. 
//
// 
//
// For example, the above tree may be serialized as [1,null,2,3,4,5,null,null,6,
//7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]. 
//
// You do not necessarily need to follow the above-suggested formats, there are 
//many more different formats that work so please be creative and come up with dif
//ferent approaches yourself. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null
//,12,null,13,null,null,14]
//Output: [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,nu
//ll,13,null,null,14]
// 
//
// Example 2: 
//
// 
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [1,null,3,2,4,null,5,6]
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
// The number of nodes in the tree is in the range [0, 104]. 
// 0 <= Node.val <= 104 
// The height of the n-ary tree is less than or equal to 1000 
// Do not use class member/global/static variables to store states. Your encode 
//and decode algorithms should be stateless. 
// 
// Related Topics String Tree Depth-First Search Breadth-First Search 
// 👍 681 👎 38


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.Node;
import org.testng.annotations.Test;

import java.util.*;

public class SerializeAndDeserializeNAryTree_428 {

    
    
    @Test
    public void testSerializeAndDeserializeNAryTree(){
        Codec solution = new SerializeAndDeserializeNAryTree_428()
                        .new Codec();
        Integer[] input = new Integer[]{
            1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14
        };

        String data = solution.serialize(solution.buildTree());
        System.out.println(data);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Codec {
    // Encodes a tree to a single string.

    /**
     * dfs, comma separated number, the second number is how many children it has
     * @param root
     * @return
     */
    public String serialize(Node root) {
        List<String> list=new LinkedList<>();
        serializeHelper(root,list);
        return String.join(",",list);
    }

    /**
     * dfs traversal
     * @param root
     * @param list
     */
    private void serializeHelper(Node root, List<String> list){
        if(root==null){
            return;
        }else{
            list.add(String.valueOf(root.val));
            list.add(String.valueOf(root.children.size()));
            for(Node child:root.children){
                serializeHelper(child,list);
            }
        }
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        if(data.isEmpty())
            return null;

        String[] ss=data.split(",");
        Queue<String> q=new LinkedList<>(Arrays.asList(ss));
        return deserializeHelper(q);
    }

    /**
     * dfs deserialize
     * @param q
     * @return
     */
    private Node deserializeHelper(Queue<String> q){
        Node root=new Node();
        root.val=Integer.parseInt(q.poll());
        int size=Integer.parseInt(q.poll());
        root.children=new ArrayList<Node>(size);
        for(int i=0;i<size;i++){
            root.children.add(deserializeHelper(q));
        }
        return root;
    }

    public Node buildTree() {
        // [1,null,3,2,4,null,5,6]
        Node node1=new Node(1);
        node1.children=new ArrayList<>();
        Node node3=new Node(3);
        Node node2=new Node(2);
        Node node4=new Node(4);
        node1.children.add(node3);
        node1.children.add(node2);
        node1.children.add(node4);
        Node node5=new Node(5);
        Node node6=new Node(6);
        node3.children=new ArrayList<>();
        node3.children.add(node5);
        node3.children.add(node6);

        return node1;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}
