//You are given an m x n grid where each cell can have one of three values: 
//
// 
// 0 representing an empty cell, 
// 1 representing a fresh orange, or 
// 2 representing a rotten orange. 
// 
//
// Every minute, any fresh orange that is 4-directionally adjacent to a rotten o
//range becomes rotten. 
//
// Return the minimum number of minutes that must elapse until no cell has a fre
//sh orange. If this is impossible, return -1. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
//Output: 4
// 
//
// Example 2: 
//
// 
//Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
//Output: -1
//Explanation: The orange in the bottom left corner (row 2, column 0) is never r
//otten, because rotting only happens 4-directionally.
// 
//
// Example 3: 
//
// 
//Input: grid = [[0,2]]
//Output: 0
//Explanation: Since there are already no fresh oranges at minute 0, the answer 
//is just 0.
// 
//
// 
// Constraints: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 10 
// grid[i][j] is 0, 1, or 2. 
// 
// Related Topics Array Breadth-First Search Matrix 
// 👍 3909 👎 222


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class RottingOranges_994 {

    
    
    @Test
    public void testRottingOranges(){
       Solution solution = new RottingOranges_994()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int orangesRotting(int[][] grid) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
