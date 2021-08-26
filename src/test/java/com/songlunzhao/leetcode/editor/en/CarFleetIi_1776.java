//There are n cars traveling at different speeds in the same direction along a o
//ne-lane road. You are given an array cars of length n, where cars[i] = [position
//i, speedi] represents: 
//
// 
// positioni is the distance between the ith car and the beginning of the road i
//n meters. It is guaranteed that positioni < positioni+1. 
// speedi is the initial speed of the ith car in meters per second. 
// 
//
// For simplicity, cars can be considered as points moving along the number line
//. Two cars collide when they occupy the same position. Once a car collides with 
//another car, they unite and form a single car fleet. The cars in the formed flee
//t will have the same position and the same speed, which is the initial speed of 
//the slowest car in the fleet. 
//
// Return an array answer, where answer[i] is the time, in seconds, at which the
// ith car collides with the next car, or -1 if the car does not collide with the 
//next car. Answers within 10-5 of the actual answers are accepted. 
//
// 
// Example 1: 
//
// 
//Input: cars = [[1,2],[2,1],[4,3],[7,2]]
//Output: [1.00000,-1.00000,3.00000,-1.00000]
//Explanation: After exactly one second, the first car will collide with the sec
//ond car, and form a car fleet with speed 1 m/s. After exactly 3 seconds, the thi
//rd car will collide with the fourth car, and form a car fleet with speed 2 m/s.
// 
//
// Example 2: 
//
// 
//Input: cars = [[3,4],[5,4],[6,3],[9,1]]
//Output: [2.00000,1.00000,1.50000,-1.00000]
// 
//
// 
// Constraints: 
//
// 
// 1 <= cars.length <= 105 
// 1 <= positioni, speedi <= 106 
// positioni < positioni+1 
// 
// Related Topics Array Math Stack Heap (Priority Queue) Monotonic Stack 
// 👍 318 👎 7


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class CarFleetIi_1776 {

    
    
    @Test
    public void testCarFleetIi(){
       Solution solution = new CarFleetIi_1776()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double[] getCollisionTimes(int[][] cars) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
