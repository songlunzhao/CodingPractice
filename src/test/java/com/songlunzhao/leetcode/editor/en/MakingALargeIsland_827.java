//You are given an n x n binary matrix grid. You are allowed to change at most o
//ne 0 to be 1. 
//
// Return the size of the largest island in grid after applying this operation. 
//
//
// An island is a 4-directionally connected group of 1s. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[1,0],[0,1]]
//Output: 3
//Explanation: Change one 0 to 1 and connect two 1s, then we get an island with 
//area = 3.
// 
//
// Example 2: 
//
// 
//Input: grid = [[1,1],[1,0]]
//Output: 4
//Explanation: Change the 0 to 1 and make the island bigger, only one island wit
//h area = 4. 
//
// Example 3: 
//
// 
//Input: grid = [[1,1],[1,1]]
//Output: 4
//Explanation: Can't change any 0 to 1, only one island with area = 4.
// 
//
// 
// Constraints: 
//
// 
// n == grid.length 
// n == grid[i].length 
// 1 <= n <= 500 
// grid[i][j] is either 0 or 1. 
// Related Topics Array Depth-First Search Breadth-First Search Union Find Matri
//x 
// 👍 947 👎 26


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MakingALargeIsland_827 {

    
    
    @Test
    public void testMakingALargeIsland(){
       Solution solution = new MakingALargeIsland_827()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestIsland(int[][] grid) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
