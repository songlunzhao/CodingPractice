//Write a program to solve a Sudoku puzzle by filling the empty cells. 
//
// A sudoku solution must satisfy all of the following rules: 
//
// 
// Each of the digits 1-9 must occur exactly once in each row. 
// Each of the digits 1-9 must occur exactly once in each column. 
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes
// of the grid. 
// 
//
// The '.' character indicates empty cells. 
//
// 
// Example 1: 
//
// 
//Input: board = [['5','3','.','.','7','.','.','.','.'],['6','.','.','1','9','5'
//,'.','.','.'],['.','9','8','.','.','.','.','6','.'],['8','.','.','.','6','.','.'
//,'.','3'],['4','.','.','8','.','3','.','.','1'],['7','.','.','.','2','.','.','.'
//,'6'],['.','6','.','.','.','.','2','8','.'],['.','.','.','4','1','9','.','.','5'
//],['.','.','.','.','8','.','.','7','9']]
//Output: [['5','3','4','6','7','8','9','1','2'],['6','7','2','1','9','5','3','4
//','8'],['1','9','8','3','4','2','5','6','7'],['8','5','9','7','6','1','4','2','3
//'],['4','2','6','8','5','3','7','9','1'],['7','1','3','9','2','4','8','5','6'],[
//'9','6','1','5','3','7','2','8','4'],['2','8','7','4','1','9','6','3','5'],['3',
//'4','5','2','8','6','1','7','9']]
//Explanation: The input board is shown above and the only valid solution is sho
//wn below:
//
//
// 
//
// 
// Constraints: 
//
// 
// board.length == 9 
// board[i].length == 9 
// board[i][j] is a digit or '.'. 
// It is guaranteed that the input board has only one solution. 
// 
// Related Topics Array Backtracking Matrix 
// 👍 3077 👎 114


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SudokuSolver_37 {


    @Test
    public void testSudokuSolver() {
        Solution solution = new SudokuSolver_37()
                .new Solution();
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

//        board = new char[][]{
//                {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
//                {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
//                {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
//                {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
//                {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
//                {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
//                {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
//                {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
//                {'3', '4', '5', '2', '8', '6', '1', '7', '9'}};

        solution.solveSudoku(board);
        System.out.println(Arrays.deepToString(board));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //if row 1-9 has number 1-9, same number cannot be on same row
        boolean[][] rowStatus = new boolean[9][9];
        //if column 1-9 has number 1-9, same number cannot be on same row
        boolean[][] colStatus = new boolean[9][9];
        //if block 1-9 has number 1-9, same number cannot be on same block
        boolean[][][] blockStatus = new boolean[3][3][9];

        char[]values=new char[]{'1','2','3','4','5','6','7','8','9'};
        public void solveSudoku(char[][] board) {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int t = board[i][j] - '1';
                        //mark existing number
                        rowStatus[i][t] = colStatus[j][t] = blockStatus[i / 3][j / 3][t] = true;
                    }
                }
            }

            backTrack(board, 0, 0);
//            dfs(board,0,0);
        }

        /**
         *
         * @param board
         * @param row
         * @param column
         * @return true -- find a solution for current row/column; false -- no solution for current row/column
         */
        private boolean backTrack(char[][] board, int row, int column) {
            //reached end row of current column, move to beginning row of next column
            if(row==9) return backTrack(board, 0, column+1);
            //reached end row and end column, find answer
            if(column==9) return true;
            //board[row][column] has number, move to next row of current column
            if(board[row][column]!='.'){
                return backTrack(board, row+1, column);
            }
            //board[row][column] is empty, check if we can put one of number 1-9
            for(int i=0; i<9; i++){
                //integer values[i] already exists in the row or column or block
                if (rowStatus[row][i]
                        ||colStatus[column][i]
                        ||blockStatus[row/3][column/3][i])
                    continue;
                //set value i to board[row][column]
                board[row][column]=values[i];
                rowStatus[row][i]=colStatus[column][i]=blockStatus[row/3][column/3][i]=true;
                if(backTrack(board, row+1, column)) {
                    //find correct value
                    break;
                }
                else {
                    //board[row][column] cannot be values[i], reverse board value
                    board[row][column]='.';
                    rowStatus[row][i]=colStatus[column][i]=blockStatus[row/3][column/3][i]=false;
                }

            }

            //if 1-9 all cannot put into current row/column, return false, then backtrack to change value in previous spot
            return board[row][column]!='.';
        }

        boolean dfs(char[][] board, int x, int y) {
            if (y == 9) return dfs(board, x + 1, 0);
            if (x == 9) return true;
            if (board[x][y] != '.') return dfs(board, x, y + 1);
            for (int i = 0; i < 9; i++) {
                if (!rowStatus[x][i] && !colStatus[y][i] && !blockStatus[x / 3][y / 3][i]) {
                    board[x][y] = values[i];
                    rowStatus[x][i] = colStatus[y][i] = blockStatus[x / 3][y / 3][i] = true;
                    if (dfs(board, x, y + 1)) {
                        break;
                    } else {
                        board[x][y] = '.';
                        rowStatus[x][i] = colStatus[y][i] = blockStatus[x / 3][y / 3][i] = false;
                    }
                }
            }
            return board[x][y] != '.';
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
