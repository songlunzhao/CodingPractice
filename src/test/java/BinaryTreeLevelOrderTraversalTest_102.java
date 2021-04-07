import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.testng.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalTest_102 {

    @Test
    public void testBinaryTreeLevelOrderTraversal(){
        //[3,9,20,null,null,15,7]
        TreeNode n1 = new TreeNode(9);

        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(7);
        TreeNode n2 = new TreeNode(20, n3,n4);
        TreeNode root = new TreeNode(3, n1, n2);

        List<List<Integer>> result= levelOrder(root);
        assertEquals(result.size(),3);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null){
            q.add(root);
            levelOrder(result,q);
        }
        List<List<Integer>> r = new ArrayList<>();
        for(int i=result.size()-1; i>=0; i--){
            r.add(result.get(i));
        }
        return r;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null){
            q.add(root);
            levelOrder(result,q);
        }
        return result;
    }

    private void levelOrder(List<List<Integer>>result, Queue<TreeNode> queue) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> r = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            r.add(node.val);
            if (node.left != null)
                q.add(node.left);
            if (node.right!=null)
                q.add(node.right);
        }
        result.add(r);
        if(!q.isEmpty()){
            queue.addAll(q);
            levelOrder(result, queue);
        }
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
