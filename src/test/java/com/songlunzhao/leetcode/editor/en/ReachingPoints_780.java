//Given four integers sx, sy, tx, and ty, return true if it is possible to conve
//rt the point (sx, sy) to the point (tx, ty) through some operations, or false ot
//herwise. 
//
// The allowed operation on some point (x, y) is to convert it to either (x, x +
// y) or (x + y, y). 
//
// 
// Example 1: 
//
// 
//Input: sx = 1, sy = 1, tx = 3, ty = 5
//Output: true
//Explanation:
//One series of moves that transforms the starting point to the target is:
//(1, 1) -> (1, 2)
//(1, 2) -> (3, 2)
//(3, 2) -> (3, 5)
// 
//
// Example 2: 
//
// 
//Input: sx = 1, sy = 1, tx = 2, ty = 2
//Output: false
// 
//
// Example 3: 
//
// 
//Input: sx = 1, sy = 1, tx = 1, ty = 1
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= sx, sy, tx, ty <= 109 
// 
// Related Topics Math 
// 👍 808 👎 137


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ReachingPoints_780 {

    
    
    @Test
    public void testReachingPoints(){
       Solution solution = new ReachingPoints_780()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
