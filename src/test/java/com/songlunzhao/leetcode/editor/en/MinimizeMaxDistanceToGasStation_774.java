//You are given an integer array stations that represents the positions of the g
//as stations on the x-axis. You are also given an integer k. 
//
// You should add k new gas stations. You can add the stations anywhere on the x
//-axis, and not necessarily on an integer position. 
//
// Let penalty() be the maximum distance between adjacent gas stations after add
//ing the k new stations. 
//
// Return the smallest possible value of penalty(). Answers within 10-6 of the a
//ctual answer will be accepted. 
//
// 
// Example 1: 
// Input: stations = [1,2,3,4,5,6,7,8,9,10], k = 9
//Output: 0.50000
// Example 2: 
// Input: stations = [23,24,36,39,46,56,57,65,84,98], k = 1
//Output: 14.00000
// 
// 
// Constraints: 
//
// 
// 10 <= stations.length <= 2000 
// 0 <= stations[i] <= 108 
// stations is sorted in a strictly increasing order. 
// 1 <= k <= 106 
// 
// Related Topics Array Binary Search 
// 👍 465 👎 67


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MinimizeMaxDistanceToGasStation_774 {

    
    
    @Test
    public void testMinimizeMaxDistanceToGasStation(){
       Solution solution = new MinimizeMaxDistanceToGasStation_774()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double minmaxGasDist(int[] stations, int k) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
