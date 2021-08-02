//Alice plays the following game, loosely based on the card game "21". 
//
// Alice starts with 0 points and draws numbers while she has less than k points
//. During each draw, she gains an integer number of points randomly from the rang
//e [1, maxPts], where maxPts is an integer. Each draw is independent and the outc
//omes have equal probabilities. 
//
// Alice stops drawing numbers when she gets k or more points. 
//
// Return the probability that Alice has n or fewer points. 
//
// Answers within 10-5 of the actual answer are considered accepted. 
//
// 
// Example 1: 
//
// 
//Input: n = 10, k = 1, maxPts = 10
//Output: 1.00000
//Explanation: Alice gets a single card, then stops.
// 
//
// Example 2: 
//
// 
//Input: n = 6, k = 1, maxPts = 10
//Output: 0.60000
//Explanation: Alice gets a single card, then stops.
//In 6 out of 10 possibilities, she is at or below 6 points.
// 
//
// Example 3: 
//
// 
//Input: n = 21, k = 17, maxPts = 10
//Output: 0.73278
// 
//
// 
// Constraints: 
//
// 
// 0 <= k <= n <= 104 
// 1 <= maxPts <= 104 
// 
// Related Topics Math Dynamic Programming Sliding Window Probability and Statis
//tics 
// 👍 785 👎 481


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class New21Game_837 {

    
    
    @Test
    public void testNew21Game(){
       Solution solution = new New21Game_837()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double new21Game(int n, int k, int maxPts) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
