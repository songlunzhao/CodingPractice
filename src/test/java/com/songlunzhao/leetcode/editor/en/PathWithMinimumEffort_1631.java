//You are a hiker preparing for an upcoming hike. You are given heights, a 2D ar
//ray of size rows x columns, where heights[row][col] represents the height of cel
//l (row, col). You are situated in the top-left cell, (0, 0), and you hope to tra
//vel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can mov
//e up, down, left, or right, and you wish to find a route that requires the minim
//um effort. 
//
// A route's effort is the maximum absolute difference in heights between two co
//nsecutive cells of the route. 
//
// Return the minimum effort required to travel from the top-left cell to the bo
//ttom-right cell. 
//
// 
// Example 1: 
//
// 
//
// 
//Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
//Output: 2
//Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 i
//n consecutive cells.
//This is better than the route of [1,2,2,2,5], where the maximum absolute diffe
//rence is 3.
// 
//
// Example 2: 
//
// 
//
// 
//Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
//Output: 1
//Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 i
//n consecutive cells, which is better than route [1,3,5,3,5].
// 
//
// Example 3: 
//
// 
//Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
//
//Output: 0
//Explanation: This route does not require any effort.
// 
//
// 
// Constraints: 
//
// 
// rows == heights.length 
// columns == heights[i].length 
// 1 <= rows, columns <= 100 
// 1 <= heights[i][j] <= 106 
// Related Topics Array Binary Search Depth-First Search Breadth-First Search Un
//ion Find Heap (Priority Queue) Matrix 
// 👍 1450 👎 72


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class PathWithMinimumEffort_1631 {

    
    
    @Test
    public void testPathWithMinimumEffort(){
       Solution solution = new PathWithMinimumEffort_1631()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumEffortPath(int[][] heights) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
