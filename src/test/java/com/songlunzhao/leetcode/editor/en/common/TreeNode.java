package com.songlunzhao.leetcode.editor.en.common;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildBinaryTree(Integer[] values) {
        return insertLevelOrder(values, null, 0 );
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

    private static TreeNode insertLevelOrder(Integer[] arr, TreeNode root, int i) {
        if (i< arr.length){
            TreeNode tmp = new TreeNode(arr[i]);
            root=tmp;
            // insert left child
            if(2*i+1<arr.length && arr[2*i+1]!=null){
                root.left = insertLevelOrder(arr, root.left,
                        2 * i + 1);
            }
            // insert right child
            if(2*i+2<arr.length && arr[2*i+2]!=null){
                root.right = insertLevelOrder(arr, root.right,
                        2 * i + 2);
            }

        }
        return root;
    }

}
