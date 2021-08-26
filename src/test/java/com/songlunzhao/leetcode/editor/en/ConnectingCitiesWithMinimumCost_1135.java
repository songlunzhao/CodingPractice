//There are n cities numbered from 1 to n. 
//
// You are given connections, where each connections[i] = [city1, city2, cost] r
//epresents the cost to connect city1 and city2 together. (A connection is bidirec
//tional: connecting city1 and city2 is the same as connecting city2 and city1.) 
//
// Return the minimum cost so that for every pair of cities, there exists a path
// of connections (possibly of length 1) that connects those two cities together. 
//The cost is the sum of the connection costs used. If the task is impossible, ret
//urn -1. 
//
// 
//
// Example 1: 
//
// 
//
// 
//Input: n = 3, connections = [[1,2,5],[1,3,6],[2,3,1]]
//Output: 6
//Explanation: 
//Choosing any 2 edges will connect all cities so we choose the minimum 2.
// 
//
// Example 2: 
//
// 
//
// 
//Input: n = 4, connections = [[1,2,3],[3,4,4]]
//Output: -1
//Explanation: 
//There is no way to connect all cities even if all edges are used.
// 
//
// 
//
// Note: 
//
// 
// 1 <= n <= 10000 
// 1 <= connections.length <= 10000 
// 1 <= connections[i][0], connections[i][1] <= n 
// 0 <= connections[i][2] <= 105 
// connections[i][0] != connections[i][1] 
// 
// Related Topics Union Find Graph Heap (Priority Queue) Minimum Spanning Tree 
// 👍 588 👎 29


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ConnectingCitiesWithMinimumCost_1135 {

    
    
    @Test
    public void testConnectingCitiesWithMinimumCost(){
       Solution solution = new ConnectingCitiesWithMinimumCost_1135()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumCost(int n, int[][] connections) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
