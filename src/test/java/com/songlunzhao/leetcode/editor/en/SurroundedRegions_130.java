//Given an m x n matrix board containing 'X' and 'O',
// capture all regions that are 4-directionally surrounded by 'X'.
//
// A region is captured by flipping all 'O's into 'X's in that surrounded region
//. 
//
// 
// Example 1: 
//
// 
//Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O"
//,"X","X"]]
//Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X
//"]]
//Explanation: Surrounded regions should not be on the border, which means that 
//any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not o
//n the border and it is not connected to an 'O' on the border will be flipped to 
//'X'. Two cells are connected if they are adjacent cells connected horizontally o
//r vertically.
// 
//
// Example 2: 
//
// 
//Input: board = [["X"]]
//Output: [["X"]]
// 
//
// 
// Constraints: 
//
// 
// m == board.length 
// n == board[i].length 
// 1 <= m, n <= 200 
// board[i][j] is 'X' or 'O'. 
// 
// Related Topics Array Depth-First Search Breadth-First Search Union Find Matri
//x 
// 👍 3126 👎 835


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class SurroundedRegions_130 {

    
    
    @Test
    public void testSurroundedRegions(){
       Solution solution = new SurroundedRegions_130()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void solve(char[][] board) {

        if(board==null) return;
        //start from O on boarder line, mark all found O as A
        for(int col=0; col<board[0].length; col++){
            dfs(board, 0, col);
            dfs(board, board.length-1, col);
        }
        for(int row=1;row< board.length-1; row++){
            dfs(board,row,0);
            dfs(board, row,board[0].length-1);
        }
        //go through matrix, mark all O as X (these Os are surrounded by X), A as O
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                } else if(board[i][j]=='A'){
                    board[i][j]='O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        if(row<0||row>=board.length||col<0||col>=board[0].length
                ||board[row][col]!='O'){
            return;
        }
        board[row][col]='A';
        dfs(board,row-1,col);
        dfs(board,row+1,col);
        dfs(board,row, col-1);
        dfs(board,row, col+1);
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
