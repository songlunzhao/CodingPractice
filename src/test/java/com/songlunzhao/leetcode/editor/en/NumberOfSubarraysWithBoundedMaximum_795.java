//Given an integer array nums and two integers left and right, return the number
// of contiguous non-empty subarrays such that the value of the maximum array elem
//ent in that subarray is in the range [left, right]. 
//
// The test cases are generated so that the answer will fit in a 32-bit integer.
// 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,1,4,3], left = 2, right = 3
//Output: 3
//Explanation: There are three subarrays that meet the requirements: [2], [2, 1]
//, [3].
// 
//
// Example 2: 
//
// 
//Input: nums = [2,9,2,5,6], left = 2, right = 8
//Output: 7
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 105 
// 0 <= nums[i] <= 109 
// 0 <= left <= right <= 109 
// 
// Related Topics Array Two Pointers 
// 👍 1265 👎 79


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class NumberOfSubarraysWithBoundedMaximum_795 {

    
    
    @Test
    public void testNumberOfSubarraysWithBoundedMaximum(){
       Solution solution = new NumberOfSubarraysWithBoundedMaximum_795()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
