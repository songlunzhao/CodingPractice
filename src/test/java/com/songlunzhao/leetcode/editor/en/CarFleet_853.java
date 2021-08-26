//There are n cars going to the same destination along a one-lane road. The dest
//ination is target miles away. 
//
// You are given two integer array position and speed, both of length n, where p
//osition[i] is the position of the ith car and speed[i] is the speed of the ith c
//ar (in miles per hour). 
//
// A car can never pass another car ahead of it, but it can catch up to it, and 
//drive bumper to bumper at the same speed. 
//
// The distance between these two cars is ignored (i.e., they are assumed to hav
//e the same position). 
//
// A car fleet is some non-empty set of cars driving at the same position and sa
//me speed. Note that a single car is also a car fleet. 
//
// If a car catches up to a car fleet right at the destination point, it will st
//ill be considered as one car fleet. 
//
// Return the number of car fleets that will arrive at the destination. 
//
// 
// Example 1: 
//
// 
//Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
//Output: 3
//Explanation: 
//The cars starting at 10 and 8 become a fleet, meeting each other at 12.
//The car starting at 0 doesn't catch up to any other car, so it is a fleet by i
//tself.
//The cars starting at 5 and 3 become a fleet, meeting each other at 6.
//Note that no other cars meet these fleets before the destination, so the answe
//r is 3.
// 
//
// Example 2: 
//
// 
//Input: target = 10, position = [3], speed = [3]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// n == position.length == speed.length 
// 1 <= n <= 105 
// 0 < target <= 106 
// 0 <= position[i] < target 
// All the values of position are unique. 
// 0 < speed[i] <= 106 
// 
// Related Topics Array Sorting 
// 👍 847 👎 323


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class CarFleet_853 {

    
    
    @Test
    public void testCarFleet(){
       Solution solution = new CarFleet_853()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
