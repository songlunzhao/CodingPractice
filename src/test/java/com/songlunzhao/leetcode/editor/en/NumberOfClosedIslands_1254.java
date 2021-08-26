//Given a 2D grid consists of 0s (land) and 1s (water). An island is a maximal 4
//-directionally connected group of 0s and a closed island is an island totally (a
//ll left, top, right, bottom) surrounded by 1s. 
//
// Return the number of closed islands. 
//
// 
// Example 1: 
//
// 
//
// 
//Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,
//0,1,0,1],[1,1,1,1,1,1,1,0]]
//Output: 2
//Explanation: 
//Islands in gray are closed because they are completely surrounded by water (gr
//oup of 1s). 
//
// Example 2: 
//
// 
//
// 
//Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: grid = [[1,1,1,1,1,1,1],
//               [1,0,0,0,0,0,1],
//               [1,0,1,1,1,0,1],
//               [1,0,1,0,1,0,1],
//               [1,0,1,1,1,0,1],
//               [1,0,0,0,0,0,1],
//               [1,1,1,1,1,1,1]]
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// 1 <= grid.length, grid[0].length <= 100 
// 0 <= grid[i][j] <=1 
// 
// Related Topics Array Depth-First Search Breadth-First Search Union Find Matri
//x 
// 👍 1061 👎 28


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class NumberOfClosedIslands_1254 {

    
    
    @Test
    public void testNumberOfClosedIslands(){
       Solution solution = new NumberOfClosedIslands_1254()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int closedIsland(int[][] grid) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
