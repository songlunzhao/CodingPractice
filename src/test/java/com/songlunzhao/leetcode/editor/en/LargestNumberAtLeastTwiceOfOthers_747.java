//You are given an integer array nums where the largest integer is unique. 
//
// Determine whether the largest element in the array is at least twice as much 
//as every other number in the array. If it is, return the index of the largest el
//ement, or return -1 otherwise. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,6,1,0]
//Output: 1
//Explanation: 6 is the largest integer.
//For every other number in the array x, 6 is at least twice as big as x.
//The index of value 6 is 1, so we return 1.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,4]
//Output: -1
//Explanation: 4 is less than twice the value of 3, so we return -1. 
//
// Example 3: 
//
// 
//Input: nums = [1]
//Output: 0
//Explanation: 1 is trivially at least twice the value as any other number becau
//se there are no other numbers.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 50 
// 0 <= nums[i] <= 100 
// The largest element in nums is unique. 
// 
// Related Topics Array Sorting 
// 👍 492 👎 694


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class LargestNumberAtLeastTwiceOfOthers_747 {

    
    
    @Test
    public void testLargestNumberAtLeastTwiceOfOthers(){
       Solution solution = new LargestNumberAtLeastTwiceOfOthers_747()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int dominantIndex(int[] nums) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
