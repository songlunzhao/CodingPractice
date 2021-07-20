//You are given an n x n 2D matrix
// representing an image, rotate the image by 90
// degrees (clockwise). 
//
// You have to rotate the image in-place, which means you have to modify the inp
//ut 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation. 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
// 
//
// Example 2: 
//
// 
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
// 
//
// Example 3: 
//
// 
//Input: matrix = [[1]]
//Output: [[1]]
// 
//
// Example 4: 
//
// 
//Input: matrix = [[1,2],[3,4]]
//Output: [[3,1],[4,2]]
// 
//
// 
// Constraints: 
//
// 
// matrix.length == n 
// matrix[i].length == n 
// 1 <= n <= 20 
// -1000 <= matrix[i][j] <= 1000 
// 
// Related Topics Array Math Matrix 
// 👍 5593 👎 362


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

public class RotateImage_48 {

    
    
    @Test
    public void testRotateImage(){
       Solution solution = new RotateImage_48()
                        .new Solution();
       int[][]matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       PrintUtils.print2DArray(matrix);
       solution.rotate(matrix);
        PrintUtils.print2DArray(matrix);
        matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintUtils.print2DArray(matrix);
        solution.rotate(matrix);
        PrintUtils.print2DArray(matrix);
        matrix = new int[][]{
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}};
        PrintUtils.print2DArray(matrix);
        solution.rotate(matrix);
        PrintUtils.print2DArray(matrix);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {
        int maxRow = matrix.length, maxCol = matrix[0].length;

        int n = matrix.length/2;
        int step = 0;
        while(step<n){
            int row = step;
            for(int col=step; col<maxCol-step-1; col++){
                int val = matrix[row][col];
                int[]newRow = new int[4];
                int[]newCol = new int[4];
                newRow[0]=col;
                newCol[0]=maxRow-1-row;
                for(int i=1; i<4; i++){
                    newRow[i]= newCol[i-1];
                    newCol[i]= maxRow -1 - newRow[i-1];
                }
                for (int i=3; i>0; i--){
                    matrix[newRow[i]][newCol[i]]=matrix[newRow[i-1]][newCol[i-1]];
                }
                matrix[newRow[0]][newCol[0]]=val;
                //PrintUtils.print2DArray(matrix);
            }
            step++;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
