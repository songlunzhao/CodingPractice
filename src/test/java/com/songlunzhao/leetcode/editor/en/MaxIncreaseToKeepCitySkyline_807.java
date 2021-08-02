//There is a city composed of n x n blocks, where each block contains a single b
//uilding shaped like a vertical square prism. You are given a 0-indexed n x n int
//eger matrix grid where grid[r][c] represents the height of the building located 
//in the block at row r and column c. 
//
// A city's skyline is the the outer contour formed by all the building when vie
//wing the side of the city from a distance. The skyline from each cardinal direct
//ion north, east, south, and west may be different. 
//
// We are allowed to increase the height of any number of buildings by any amoun
//t (the amount can be different per building). The height of a 0-height building 
//can also be increased. However, increasing the height of a building should not a
//ffect the city's skyline from any cardinal direction. 
//
// Return the maximum total sum that the height of the buildings can be increase
//d by without changing the city's skyline from any cardinal direction. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
//Output: 35
//Explanation: The building heights are shown in the center of the above image.
//The skylines when viewed from each cardinal direction are drawn in red.
//The grid after increasing the height of buildings without affecting skylines i
//s:
//gridNew = [ [8, 4, 8, 7],
//            [7, 4, 7, 7],
//            [9, 4, 8, 7],
//            [3, 3, 3, 3] ]
// 
//
// Example 2: 
//
// 
//Input: grid = [[0,0,0],[0,0,0],[0,0,0]]
//Output: 0
//Explanation: Increasing the height of any building will result in the skyline 
//changing.
// 
//
// 
// Constraints: 
//
// 
// n == grid.length 
// n == grid[r].length 
// 2 <= n <= 50 
// 0 <= grid[r][c] <= 100 
// 
// Related Topics Array Greedy Matrix 
// 👍 1279 👎 361


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MaxIncreaseToKeepCitySkyline_807 {

    
    
    @Test
    public void testMaxIncreaseToKeepCitySkyline(){
       Solution solution = new MaxIncreaseToKeepCitySkyline_807()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
