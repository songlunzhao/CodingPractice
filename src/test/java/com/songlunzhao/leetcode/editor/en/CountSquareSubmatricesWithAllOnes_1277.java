//Given a m * n matrix of ones and zeros, return how many square submatrices hav
//e all ones. 
//
// 
// Example 1: 
//
// 
//Input: matrix =
//[
//  [0,1,1,1],
//  [1,1,1,1],
//  [0,1,1,1]
//]
//Output: 15
//Explanation: 
//There are 10 squares of side 1.
//There are 4 squares of side 2.
//There is  1 square of side 3.
//Total number of squares = 10 + 4 + 1 = 15.
// 
//
// Example 2: 
//
// 
//Input: matrix = 
//[
//  [1,0,1],
//  [1,1,0],
//  [1,1,0]
//]
//Output: 7
//Explanation: 
//There are 6 squares of side 1.  
//There is 1 square of side 2. 
//Total number of squares = 6 + 1 = 7.
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 300 
// 1 <= arr[0].length <= 300 
// 0 <= arr[i][j] <= 1 
// 
// Related Topics Array Dynamic Programming Matrix 
// 👍 2331 👎 38


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class CountSquareSubmatricesWithAllOnes_1277 {

    
    
    @Test
    public void testCountSquareSubmatricesWithAllOnes(){
       Solution solution = new CountSquareSubmatricesWithAllOnes_1277()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSquares(int[][] matrix) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
