//The n-queens puzzle is the problem of placing n queens on an n x n chessboard 
//such that no two queens attack each other. 
//
// Given an integer n, return all distinct solutions to the n-queens puzzle. You
// may return the answer in any order. 
//
// Each solution contains a distinct board configuration of the n-queens' placem
//ent, where 'Q' and '.' both indicate a queen and an empty space, respectively. 
//
// 
// Example 1: 
//
// 
//Input: n = 4
//Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//Explanation: There exist two distinct solutions to the 4-queens puzzle as show
//n above
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: [["Q"]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 9 
// 
// Related Topics Array Backtracking 
// 👍 3569 👎 115


package com.songlunzhao.leetcode.editor.en;

import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens_51 {


    @Test
    public void testNQueens() {
        Solution solution = new NQueens_51()
                .new Solution();
        List<List<String>> ans = solution.solveNQueens(4);
        PrintUtils<String> printUtils = new PrintUtils<>();
        printUtils.print2DList(ans);
        ans = solution.solveNQueens(8);
        printUtils.print2DList(ans);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> solveNQueens(int n) {
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

            return solutions;
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
