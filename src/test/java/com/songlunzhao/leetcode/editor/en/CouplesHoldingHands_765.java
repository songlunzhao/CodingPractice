//There are n couples sitting in 2n seats arranged in a row and want to hold han
//ds. 
//
// The people and seats are represented by an integer array row where row[i] is 
//the ID of the person sitting in the ith seat. The couples are numbered in order,
// the first couple being (0, 1), the second couple being (2, 3), and so on with t
//he last couple being (2n - 2, 2n - 1). 
//
// Return the minimum number of swaps so that every couple is sitting side by si
//de. A swap consists of choosing any two people, then they stand up and switch se
//ats. 
//
// 
// Example 1: 
//
// 
//Input: row = [0,2,1,3]
//Output: 1
//Explanation: We only need to swap the second (row[1]) and third (row[2]) perso
//n.
// 
//
// Example 2: 
//
// 
//Input: row = [3,2,0,1]
//Output: 0
//Explanation: All couples are already seated side by side.
// 
//
// 
// Constraints: 
//
// 
// 2n == row.length 
// 2 <= n <= 30 
// n is even. 
// 0 <= row[i] < 2n 
// All the elements of row are unique. 
// 
// Related Topics Greedy Depth-First Search Breadth-First Search Union Find Grap
//h 
// 👍 1235 👎 75


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class CouplesHoldingHands_765 {

    
    
    @Test
    public void testCouplesHoldingHands(){
       Solution solution = new CouplesHoldingHands_765()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSwapsCouples(int[] row) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
