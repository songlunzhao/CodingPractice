package com.songlunzhao.leetcode.editor.en.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    public int val;
    public int value;
    public int count;
    public int key;
    public Node next;
    public Node random;
    public Node left;
    public Node right;
    public List<Node> neighbors;
    public List<Node> children;

    public Node() {

    }
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int val, ArrayList<Node> neighbors){
        this.val=val;
        this.neighbors=neighbors;
    }


    public static Node buildBinaryTree(Integer[] values) {
        if(values==null || values.length==0) return null;
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(values[0]);
        queue.add(root);
        breathFirstTraversalInsert(values, queue,1);
        //return insertLevelOrder(values, null, 0 );
        return root;
    }

    private static void breathFirstTraversalInsert(Integer[] arr, Queue<Node> queue, int idx){
        Queue<Node> tmp = new LinkedList<>();
        while(!queue.isEmpty() && idx< arr.length){
            Node node = queue.poll();
            if(node!=null){
                if(arr[idx]==null){
                    node.left=null;
                } else {
                    node.left = new Node(arr[idx]);
                }
                tmp.add(node.left);
                idx++;
                if(idx>= arr.length) break;
                if(arr[idx]==null){
                    node.right=null;
                } else {
                    node.right = new Node(arr[idx]);
                }
                tmp.add(node.right);
                idx++;
            }
        }
        if(!tmp.isEmpty()) {
            queue.addAll(tmp);
            breathFirstTraversalInsert(arr, queue, idx);
        }
    }

}
