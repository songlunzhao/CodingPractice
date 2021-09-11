package com.songlunzhao.leetcode.editor.en.common;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildBinaryTree(Integer[] values) {
        if(values==null || values.length==0) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values[0]);
        queue.add(root);
        breathFirstTraversalInsert(values, queue,1);
        //return insertLevelOrder(values, null, 0 );
        return root;
    }

    public static Integer[] buildArray(TreeNode root){
        if(root == null) return null;
        //breath-first traversal
        Queue<TreeNode> queue = new LinkedList();
        List<Integer> ans = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node!=null){
                ans.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else {
                ans.add(null);
            }
        }
        return ans.toArray(new Integer[ans.size()]);
    }

    private static void breathFirstTraversalInsert(Integer[] arr, Queue<TreeNode> queue, int idx){
        Queue<TreeNode> tmp = new LinkedList<>();
        while(!queue.isEmpty() && idx< arr.length){
            TreeNode node = queue.poll();
            if(node!=null){
                if(arr[idx]==null){
                    node.left=null;
                } else {
                    node.left = new TreeNode(arr[idx]);
                }
                tmp.add(node.left);
                idx++;
                if(idx>= arr.length) break;
                if(arr[idx]==null){
                    node.right=null;
                } else {
                    node.right = new TreeNode(arr[idx]);
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
