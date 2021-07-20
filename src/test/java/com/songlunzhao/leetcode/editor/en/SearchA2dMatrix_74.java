//Write an efficient algorithm that
// searches for a value in an m x n matrix. Thi
//s matrix has the following properties: 
//
// 
// Integers in each row are sorted from left to right. 
// The first integer of each row is greater than the last integer of the previou
//s row. 
// 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 100 
// -104 <= matrix[i][j], target <= 104 
// 
// Related Topics Array Binary Search Matrix 
// 👍 3743 👎 208


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchA2dMatrix_74 {

    
    
    @Test
    public void testSearchA2dMatrix(){
       Solution solution = new SearchA2dMatrix_74()
                        .new Solution();

       int[][] matrix = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       assertEquals(solution.searchMatrix(matrix, -1), false);
       assertEquals(solution.searchMatrix(matrix, 20), true);

        matrix = new int[][]{{1,3,5,7,8},{10,11,16,20,21},{23,30,34,60,61}};
        assertEquals(solution.searchMatrix(matrix, 9), false);
        assertEquals(solution.searchMatrix(matrix, 8), true);
       assertEquals(solution.searchMatrix(matrix, 62), false);
       matrix = new int[][]{
               {-8,-6,-6,-4,-2,-1,-1,-1,0,1,2,4,6,7,7},
               {10,10,12,13,13,14,14,16,17,17,17,17,17,18,19},
               {22,24,26,28,29,31,32,34,34,34,34,36,38,39,39},
               {40,40,41,43,43,44,46,47,49,49,50,52,53,55,55},
               {56,57,59,61,62,64,65,65,66,67,68,68,69,70,71},
               {74,75,77,77,79,79,79,80,81,83,85,87,88,89,89},
               {91,93,94,96,97,98,99,99,100,100,102,104,105,107,107},
               {110,112,114,114,115,117,117,118,118,120,120,121,123,124,124},
               {127,127,129,131,133,134,134,135,137,139,139,140,142,143,144},
               {145,146,147,149,151,151,153,155,156,156,158,160,162,162,163}};
        assertEquals(solution.searchMatrix(matrix, 107), true);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left =0, right = matrix.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[mid][0]==target){
                return true;
            } else if(matrix[mid][0]<target){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        int row = Math.min(left,right);
        if(row<0) return false;
        left=0;
        right = matrix[row].length -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[row][mid]==target){
                return true;
            } else if(matrix[row][mid]<target){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
