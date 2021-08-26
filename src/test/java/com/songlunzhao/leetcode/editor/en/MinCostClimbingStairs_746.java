//You are given an integer array cost where cost[i] is the cost of ith step on a
// staircase. Once you pay the cost, you can either climb one or two steps. 
//
// You can either start from the step with index 0, or the step with index 1. 
//
// Return the minimum cost to reach the top of the floor. 
//
// 
// Example 1: 
//
// 
//Input: cost = [10,15,20]
//Output: 15
//Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
// 
//
// Example 2: 
//
// 
//Input: cost = [1,100,1,1,1,100,1,1,100,1]
//Output: 6
//Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost
//[3].
// 
//
// 
// Constraints: 
//
// 
// 2 <= cost.length <= 1000 
// 0 <= cost[i] <= 999 
// 
// Related Topics Array Dynamic Programming 
// 👍 3823 👎 787


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MinCostClimbingStairs_746 {

    
    
    @Test
    public void testMinCostClimbingStairs(){
       Solution solution = new MinCostClimbingStairs_746()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
