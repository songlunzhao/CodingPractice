//A virus is spreading rapidly, and your task is to quarantine the infected area
// by installing walls. 
//
// The world is modeled as an m x n binary grid isInfected, where isInfected[i][
//j] == 0 represents uninfected cells, and isInfected[i][j] == 1 represents cells 
//contaminated with the virus. A wall (and only one wall) can be installed between
// any two 4-directionally adjacent cells, on the shared boundary. 
//
// Every night, the virus spreads to all neighboring cells in all four direction
//s unless blocked by a wall. Resources are limited. Each day, you can install wal
//ls around only one region (i.e., the affected area (continuous block of infected
// cells) that threatens the most uninfected cells the following night). There wil
//l never be a tie. 
//
// Return the number of walls used to quarantine all the infected regions. If th
//e world will become fully infected, return the number of walls used. 
//
// 
// Example 1: 
//
// 
//Input: isInfected = [[0,1,0,0,0,0,0,1],[0,1,0,0,0,0,0,1],[0,0,0,0,0,0,0,1],[0,
//0,0,0,0,0,0,0]]
//Output: 10
//Explanation: There are 2 contaminated regions.
//On the first day, add 5 walls to quarantine the viral region on the left. The 
//board after the virus spreads is:
//
//On the second day, add 5 walls to quarantine the viral region on the right. Th
//e virus is fully contained.
//
// 
//
// Example 2: 
//
// 
//Input: isInfected = [[1,1,1],[1,0,1],[1,1,1]]
//Output: 4
//Explanation: Even though there is only one cell saved, there are 4 walls built
//.
//Notice that walls are only built on the shared boundary of two different cells
//.
// 
//
// Example 3: 
//
// 
//Input: isInfected = [[1,1,1,0,0,0,0,0,0],[1,0,1,0,1,1,1,1,1],[1,1,1,0,0,0,0,0,
//0]]
//Output: 13
//Explanation: The region on the left only builds two new walls.
// 
//
// 
// Constraints: 
//
// 
// m == isInfected.length 
// n == isInfected[i].length 
// 1 <= m, n <= 50 
// isInfected[i][j] is either 0 or 1. 
// There is always a contiguous viral region throughout the described process th
//at will infect strictly more uncontaminated squares in the next round. 
// 
// Related Topics Array Depth-First Search Breadth-First Search Matrix Simulatio
//n 
// 👍 160 👎 329


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ContainVirus_749 {

    
    
    @Test
    public void testContainVirus(){
       Solution solution = new ContainVirus_749()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int containVirus(int[][] isInfected) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
