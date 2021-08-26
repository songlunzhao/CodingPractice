//You are given an m x n binary matrix grid. An island is a group of 1's (repres
//enting land) connected 4-directionally (horizontal or vertical.) You may assume 
//all four edges of the grid are surrounded by water. 
//
// The area of an island is the number of cells with a value 1 in the island. 
//
// Return the maximum area of an island in grid. If there is no island, return 0
//. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,
//0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,
//0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]
//]
//Output: 6
//Explanation: The answer is not 11, because the island must be connected 4-dire
//ctionally.
// 
//
// Example 2: 
//
// 
//Input: grid = [[0,0,0,0,0,0,0,0]]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 50 
// grid[i][j] is either 0 or 1. 
// 
// Related Topics Array Depth-First Search Breadth-First Search Union Find Matri
//x 
// 👍 3889 👎 115


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MaxAreaOfIsland_695 {

    
    
    @Test
    public void testMaxAreaOfIsland(){
       Solution solution = new MaxAreaOfIsland_695()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
