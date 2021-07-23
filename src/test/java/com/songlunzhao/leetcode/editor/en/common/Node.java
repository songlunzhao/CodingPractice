package com.songlunzhao.leetcode.editor.en.common;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public Node next;
    public Node random;
    public Node left;
    public Node right;
    public List<Node> neighbors;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int val, ArrayList<Node> neighbors){
        this.val=val;
        this.neighbors=neighbors;
    }
}
