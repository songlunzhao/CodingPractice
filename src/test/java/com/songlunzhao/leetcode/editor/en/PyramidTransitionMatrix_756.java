//We are stacking blocks to form a pyramid. Each block has a color which is a on
//e-letter string. 
//
// We are allowed to place any color block C on top of two adjacent blocks of co
//lors A and B, if and only if ABC is an allowed triple. 
//
// We start with a bottom row of bottom, represented as a single string. We also
// start with a list of allowed triples allowed. Each allowed triple is represente
//d as a string of length 3. 
//
// Return true if we can build the pyramid all the way to the top, otherwise fal
//se. 
//
// 
// Example 1: 
//
// 
//Input: bottom = "BCD", allowed = ["BCG","CDE","GEA","FFF"]
//Output: true
//Explanation:
//We can stack the pyramid like this:
//    A
//   / \
//  G   E
// / \ / \
//B   C   D
//
//We are allowed to place G on top of B and C because BCG is an allowed triple. 
// Similarly, we can place E on top of C and D, then A on top of G and E.
// 
//
// Example 2: 
//
// 
//Input: bottom = "AABA", allowed = ["AAA","AAB","ABA","ABB","BAC"]
//Output: false
//Explanation:
//We cannot stack the pyramid to the top.
//Note that there could be allowed triples (A, B, C) and (A, B, D) with C != D.
// 
//
// 
// Constraints: 
//
// 
// 2 <= bottom.length <= 8 
// 0 <= allowed.length <= 200 
// allowed[i].length == 3 
// The letters in all input strings are from the set {'A', 'B', 'C', 'D', 'E', '
//F', 'G'}. 
// 
// Related Topics Bit Manipulation Depth-First Search Breadth-First Search 
// 👍 397 👎 398


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.List;

public class PyramidTransitionMatrix_756 {

    
    
    @Test
    public void testPyramidTransitionMatrix(){
       Solution solution = new PyramidTransitionMatrix_756()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
