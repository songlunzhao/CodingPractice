//The n-queens puzzle is the problem of placing n queens on an n x n chessboard 
//such that no two queens attack each other. 
//
// Given an integer n, return the number of distinct solutions to the n-queens p
//uzzle. 
//
// 
// Example 1: 
//
// 
//Input: n = 4
//Output: 2
//Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
//
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 9 
// 
// Related Topics Backtracking 
// 👍 1056 👎 193


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueensIi_52 {

    
    
    @Test
    public void testNQueensIi(){
       Solution solution = new NQueensIi_52()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        Set<Integer> cols = new HashSet<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        for (int j = 0; j < n; j++) {
            board[0][j] = 'Q';
            cols.add(j);
            backTrack(board, solutions, 0, j, cols);
            cols.remove(j);
            board[0][j] = '.';
        }

        return solutions.size();
    }

        void backTrack(char[][] board, List<List<String>> solutions, int row, int col, Set<Integer> cols) {
            if (!validBoard(board,row)) {
                return;
            }
            if (row == board.length - 1) {
                addSolution(board, solutions);
                return;
            }
            for (int j = 0; j < board[0].length; j++) {
                if (!cols.contains(j) &&  j!=col+1 && j!=col-1) {
                    board[row + 1][j] = 'Q';
                    cols.add(j);
                    backTrack(board, solutions, row + 1, j, cols);
                    cols.remove(j);
                    board[row + 1][j] = '.';
                }
            }
        }

        void addSolution(char[][] board, List<List<String>> solutions) {
            List<String> solution = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board[0].length; j++) {
                    sb.append(board[i][j]);
                }
                solution.add(sb.toString());
            }
            solutions.add(solution);
        }

        boolean validBoard(char[][] board, int row) {
            for (int i = 0; i <=row; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 'Q') {
                        int[][] direction = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {-1, -1}, {1, 1}, {-1, 1}, {1, -1}};
                        for (int[] d : direction) {
                            int ii = i + d[0], jj = j + d[1];
                            while (ii >= 0 && ii <=row && jj >= 0 && jj < board[0].length) {
                                if (board[ii][jj] == 'Q') return false;
                                ii = ii + d[0];
                                jj = jj + d[1];
                            }
                        }
                    }

                }
            }

            return true;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
