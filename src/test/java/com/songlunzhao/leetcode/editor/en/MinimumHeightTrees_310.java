//A tree is an undirected graph in which any two vertices
// are connected by exact
//ly one path. In other words, any connected graph without simple cycles is a tree
//. 
//
// Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges
// where edges[i] = [ai, bi] indicates that there is an undirected edge between th
//e two nodes ai and bi in the tree, you can choose any node of the tree as the ro
//ot. When you select a node x as the root, the result tree has height h. Among al
//l possible rooted trees, those with minimum height (i.e. min(h)) are called mini
//mum height trees (MHTs). 
//
// Return a list of all MHTs' root labels. You can return the answer in any orde
//r. 
//
// The height of a rooted tree is the number of edges on the longest downward pa
//th between the root and a leaf. 
//
// 
// Example 1: 
//
// 
//Input: n = 4, edges = [[1,0],[1,2],[1,3]]
//Output: [1]
//Explanation: As shown, the height of the tree is 1 when the root is the node w
//ith label 1 which is the only MHT.
// 
//
// Example 2: 
//
// 
//Input: n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
//Output: [3,4]
// 
//
// Example 3: 
//
// 
//Input: n = 1, edges = []
//Output: [0]
// 
//
// Example 4: 
//
// 
//Input: n = 2, edges = [[0,1]]
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 2 * 104 
// edges.length == n - 1 
// 0 <= ai, bi < n 
// ai != bi 
// All the pairs (ai, bi) are distinct. 
// The given input is guaranteed to be a tree and there will be no repeated edge
//s. 
// 
// Related Topics Depth-First Search Breadth-First Search Graph Topological Sort
// 
// 👍 3572 👎 142


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.*;

public class MinimumHeightTrees_310 {

    
    
    @Test
    public void testMinimumHeightTrees(){
       Solution solution = new MinimumHeightTrees_310()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        if(n<=1){
            return new ArrayList<>(){{add(0);}};
        }
        for(int i=0; i< edges.length; i++){
            Integer i1 = edges[i][0];
            Integer i2 = edges[i][1];
            addToMap(i1,i2,map);
            addToMap(i2,i1,map);
        }
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int key=0; key<n; key++){
            //add leaf nodes to queue
            if(map.containsKey(key) && map.get(key).size()==1){
                queue.add(key);
            }
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            ans = new ArrayList<>();
            //remove leaf nodes from tree,
            //bfs to next level nodes,
            // the last next level nodes are the results
            for(int i=0; i<size; i++){
                int leaf = queue.poll();
                ans.add(leaf); //save leaf to return as result
                for(int nextNode: map.get(leaf)){
                    map.get(nextNode).remove(leaf);
                    if(map.get(nextNode).size()==1){
                        queue.add(nextNode);//nextNode is a leaf add it to queue
                    }
                }
            }

        }
        return ans;
    }

    void addToMap(Integer i1, Integer i2, Map<Integer, Set<Integer>> map){
        if(map.containsKey(i1)){
            map.get(i1).add(i2);
        } else {
            Set<Integer> s = new HashSet<>();
            s.add(i2);
            map.put(i1, s);
        }
    }
    int getDepth(Integer root, Map<Integer, Set<Integer>> map) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0; i<size; i++){
                Integer node = queue.poll();
                visited.add(node);
                if(map.containsKey(node)){
                    Set<Integer> children = map.get(node);
                    for(Integer j: children){
                        if(!visited.contains(j)){
                            queue.add(j);
                        }
                    }
                }
            }
        }
        return depth;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
