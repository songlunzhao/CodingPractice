//You have a graph of n nodes. You are given an integer n and an array edges whe
//re edges[i] = [ai, bi] indicates that there is an edge between ai and bi in the 
//graph. 
//
// Return the number of connected components in the graph. 
//
// 
// Example 1: 
//
// 
//Input: n = 5, edges = [[0,1],[1,2],[3,4]]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 2000 
// 1 <= edges.length <= 5000 
// edges[i].length == 2 
// 0 <= ai <= bi < n 
// ai != bi 
// There are no repeated edges. 
// 
// Related Topics Depth-First Search Breadth-First Search Union Find Graph 
// 👍 1423 👎 42


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class NumberOfConnectedComponentsInAnUndirectedGraph_323 {

    
    
    @Test
    public void testNumberOfConnectedComponentsInAnUndirectedGraph(){
       Solution solution = new NumberOfConnectedComponentsInAnUndirectedGraph_323()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countComponents(int n, int[][] edges) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
