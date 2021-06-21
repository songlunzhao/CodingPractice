import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class ValidSudokuTest_36 {

    @Test
    public void testIsValidSoduku() {
        char[][] board = new char[][]
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        assertEquals(isValidSudoku(board), true);

        board = new char[][]
                {{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                        {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                        {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                        {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                        {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                        {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                        {'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
        assertEquals(isValidSudoku(board), false);

    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (i % 3 == 0 && j % 3 == 0 && !validate3X3(board, i, j)) {
                    return false;
                }
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        System.out.println("row check failed " + i + " " + j);
                        return false;
                    } else {
                        rowSet.add(board[i][j]);
                    }

                }
                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        System.out.println("column check failed " + i + " " + j);
                        return false;
                    } else {
                        colSet.add(board[j][i]);
                    }

                }
            }
        }
        return true;
    }


    private boolean validate3X3(char[][] board, int row, int col) {
        Set<Character> charSet = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.') {
                    if (charSet.contains(board[i][j])) {
                        System.out.println("3x3 row check failed " + i + " " + j);
                        return false;
                    } else {
                        charSet.add(board[i][j]);
                    }
                }

            }
        }
        return true;
    }
}
