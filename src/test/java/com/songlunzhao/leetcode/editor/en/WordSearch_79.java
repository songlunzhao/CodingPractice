//Given an m x n grid of characters board and a string word,
// return true if word
// exists in the grid. 
//
// The word can be constructed from letters of sequentially adjacent cells, wher
//e adjacent cells are horizontally or vertically neighboring. The same letter cel
//l may not be used more than once. 
//
// 
// Example 1: 
//
// 
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCCED"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "SEE"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCB"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == board.length 
// n = board[i].length 
// 1 <= m, n <= 6 
// 1 <= word.length <= 15 
// board and word consists of only lowercase and uppercase English letters. 
// 
//
// 
// Follow up: Could you use search pruning to make your solution faster with a l
//arger board? 
// Related Topics Array Backtracking Matrix 
// 👍 6148 👎 252


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WordSearch_79 {

    
    
    @Test
    public void testWordSearch(){
       Solution solution = new WordSearch_79()
                        .new Solution();
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =

        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        assertEquals(solution.exist(board, "ABCCED"), true);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {
        StringBuilder sb = new StringBuilder();
        boolean [][] visited = new boolean[ board.length][board[0].length];
        for(int i= 0; i<board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //sb.append(board[i][j]);
                visited[i][j]=true;
                if (backTrack(board, visited, i, j, word, 0)) {
                    return true;
                } else {
                    //sb.deleteCharAt(sb.length()-1);
                    visited[i][j]=false;
                }
            }
        }
        return false;
    }
    boolean backTrack(char[][]board, boolean[][]visited, int row, int col, String word, int position) {
        if(board[row][col]!=word.charAt(position)) {
            return false;
        }
        if(position==word.length()-1) {
            return true;
        }
        //visited[row][col]=true; -- this also work.
        int[][]steps = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        for(int[]step: steps){
            int nextRow=row+step[0];
            int nextCol=col+step[1];
            if(nextRow<0 || nextRow>=board.length || nextCol<0 || nextCol>=board[0].length) continue;
            if (!visited[nextRow][nextCol]){
                //sb.append(board[nextRow][nextCol]);
                visited[nextRow][nextCol]=true;
                if(backTrack(board,visited, nextRow, nextCol, word, position+1)){
                    return true;
                } else {
                    visited[nextRow][nextCol]=false;
                  //  sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        //visited[row][col]=false;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
