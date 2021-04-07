import java.util.ArrayList;
import java.util.List;

public class InorderTraveralTest_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode node, List<Integer> result){
        if(node!=null){
            inorderTraversal(node.left);
            result.add(node.val);
            inorderTraversal(node.right);
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
