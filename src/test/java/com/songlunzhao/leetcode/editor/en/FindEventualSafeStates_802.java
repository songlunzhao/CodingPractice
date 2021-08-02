//We start at some node in a directed graph, and every turn, we walk along a dir
//ected edge of the graph. If we reach a terminal node (that is, it has no outgoin
//g directed edges), we stop. 
//
// We define a starting node to be safe if we must eventually walk to a terminal
// node. More specifically, there is a natural number k, so that we must have stop
//ped at a terminal node in less than k steps for any choice of where to walk. 
//
// Return an array containing all the safe nodes of the graph. The answer should
// be sorted in ascending order. 
//
// The directed graph has n nodes with labels from 0 to n - 1, where n is the le
//ngth of graph. The graph is given in the following form: graph[i] is a list of l
//abels j such that (i, j) is a directed edge of the graph, going from node i to n
//ode j. 
//
// 
// Example 1: 
//
// 
//Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
//Output: [2,4,5,6]
//Explanation: The given graph is shown above.
// 
//
// Example 2: 
//
// 
//Input: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
//Output: [4]
// 
//
// 
// Constraints: 
//
// 
// n == graph.length 
// 1 <= n <= 104 
// 0 <= graph[i].length <= n 
// graph[i] is sorted in a strictly increasing order. 
// The graph may contain self-loops. 
// The number of edges in the graph will be in the range [1, 4 * 104]. 
// 
// Related Topics Depth-First Search Breadth-First Search Graph Topological Sort
// 
// 👍 1352 👎 260


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class FindEventualSafeStates_802 {

    
    
    @Test
    public void testFindEventualSafeStates(){
       Solution solution = new FindEventualSafeStates_802()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
