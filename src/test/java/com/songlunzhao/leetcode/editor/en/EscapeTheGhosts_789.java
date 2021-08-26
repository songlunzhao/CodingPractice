//You are playing a simplified PAC-MAN game on an infinite 2-D grid. You start a
//t the point [0, 0], and you are given a destination point target = [xtarget, yta
//rget], which you are trying to get to. There are several ghosts on the map with 
//their starting positions given as an array ghosts, where ghosts[i] = [xi, yi] re
//presents the starting position of the ith ghost. All inputs are integral coordin
//ates. 
//
// Each turn, you and all the ghosts may independently choose to either move 1 u
//nit in any of the four cardinal directions: north, east, south, or west or stay 
//still. All actions happen simultaneously. 
//
// You escape if and only if you can reach the target before any ghost reaches y
//ou. If you reach any square (including the target) at the same time as a ghost, 
//it does not count as an escape. 
//
// Return true if it is possible to escape, otherwise return false. 
//
// 
// Example 1: 
//
// 
//Input: ghosts = [[1,0],[0,3]], target = [0,1]
//Output: true
//Explanation: You can reach the destination (0, 1) after 1 turn, while the ghos
//ts located at (1, 0) and (0, 3) cannot catch up with you.
// 
//
// Example 2: 
//
// 
//Input: ghosts = [[1,0]], target = [2,0]
//Output: false
//Explanation: You need to reach the destination (2, 0), but the ghost at (1, 0)
// lies between you and the destination.
// 
//
// Example 3: 
//
// 
//Input: ghosts = [[2,0]], target = [1,0]
//Output: false
//Explanation: The ghost can reach the target at the same time as you.
// 
//
// Example 4: 
//
// 
//Input: ghosts = [[5,0],[-10,-2],[0,-5],[-2,-2],[-7,1]], target = [7,7]
//Output: false
// 
//
// Example 5: 
//
// 
//Input: ghosts = [[-1,0],[0,1],[-1,0],[0,1],[-1,0]], target = [0,0]
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= ghosts.length <= 100 
// ghosts[i].length == 2 
// -104 <= xi, yi <= 104 
// There can be multiple ghosts in the same location. 
// target.length == 2 
// -104 <= xtarget, ytarget <= 104 
// 
// Related Topics Array Math 
// 👍 242 👎 383


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class EscapeTheGhosts_789 {

    
    
    @Test
    public void testEscapeTheGhosts(){
       Solution solution = new EscapeTheGhosts_789()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
