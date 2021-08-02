//Your car starts at position 0 and speed +1 on an infinite number line. Your ca
//r can go into negative positions. Your car drives automatically according to a s
//equence of instructions 'A' (accelerate) and 'R' (reverse): 
//
// 
// When you get an instruction 'A', your car does the following:
//
// 
// position += speed 
// speed *= 2 
// 
// 
// When you get an instruction 'R', your car does the following:
// 
// If your speed is positive then speed = -1 
// otherwise speed = 1 
// 
// Your position stays the same. 
// 
//
// For example, after commands "AAR", your car goes to positions 0 --> 1 --> 3 -
//-> 3, and your speed goes to 1 --> 2 --> 4 --> -1. 
//
// Given a target position target, return the length of the shortest sequence of
// instructions to get there. 
//
// 
// Example 1: 
//
// 
//Input: target = 3
//Output: 2
//Explanation: 
//The shortest instruction sequence is "AA".
//Your position goes from 0 --> 1 --> 3.
// 
//
// Example 2: 
//
// 
//Input: target = 6
//Output: 5
//Explanation: 
//The shortest instruction sequence is "AAARA".
//Your position goes from 0 --> 1 --> 3 --> 7 --> 7 --> 6.
// 
//
// 
// Constraints: 
//
// 
// 1 <= target <= 104 
// 
// Related Topics Dynamic Programming 
// 👍 715 👎 75


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class RaceCar_818 {

    
    
    @Test
    public void testRaceCar(){
       Solution solution = new RaceCar_818()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int racecar(int target) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
