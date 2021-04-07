//Given the root of a binary tree, return the bottom-up level order traversal of
// its nodes' values. (i.e., from left to right, level by level from leaf to root)
//. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[15,7],[9,20],[3]]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: [[1]]
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
// The number of nodes in the tree is in the range [0, 2000]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics Tree Breadth-first Search 
// 👍 2089 👎 245


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

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
}
//leetcode submit region end(Prohibit modification and deletion)
