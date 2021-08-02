//On an 2 x 3 board, there are five tiles labeled from 1 to 5, and an empty squa
//re represented by 0. A move consists of choosing 0 and a 4-directionally adjacen
//t number and swapping it. 
//
// The state of the board is solved if and only if the board is [[1,2,3],[4,5,0]
//]. 
//
// Given the puzzle board board, return the least number of moves required so th
//at the state of the board is solved. If it is impossible for the state of the bo
//ard to be solved, return -1. 
//
// 
// Example 1: 
//
// 
//Input: board = [[1,2,3],[4,0,5]]
//Output: 1
//Explanation: Swap the 0 and the 5 in one move.
// 
//
// Example 2: 
//
// 
//Input: board = [[1,2,3],[5,4,0]]
//Output: -1
//Explanation: No number of moves will make the board solved.
// 
//
// Example 3: 
//
// 
//Input: board = [[4,1,2],[5,0,3]]
//Output: 5
//Explanation: 5 is the smallest number of moves that solves the board.
//An example path:
//After move 0: [[4,1,2],[5,0,3]]
//After move 1: [[4,1,2],[0,5,3]]
//After move 2: [[0,1,2],[4,5,3]]
//After move 3: [[1,0,2],[4,5,3]]
//After move 4: [[1,2,0],[4,5,3]]
//After move 5: [[1,2,3],[4,5,0]]
// 
//
// Example 4: 
//
// 
//Input: board = [[3,2,4],[1,5,0]]
//Output: 14
// 
//
// 
// Constraints: 
//
// 
// board.length == 2 
// board[i].length == 3 
// 0 <= board[i][j] <= 5 
// Each value board[i][j] is unique. 
// 
// Related Topics Array Breadth-First Search Matrix 
// 👍 1099 👎 32


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class SlidingPuzzle_773 {

    
    
    @Test
    public void testSlidingPuzzle(){
       Solution solution = new SlidingPuzzle_773()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int slidingPuzzle(int[][] board) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
