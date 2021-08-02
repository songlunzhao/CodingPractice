//You are given two integer arrays of the same length nums1 and nums2. In one op
//eration, you are allowed to swap nums1[i] with nums2[i]. 
//
// 
// For example, if nums1 = [1,2,3,8], and nums2 = [5,6,7,4], you can swap the el
//ement at i = 3 to obtain nums1 = [1,2,3,4] and nums2 = [5,6,7,8]. 
// 
//
// Return the minimum number of needed operations to make nums1 and nums2 strict
//ly increasing. The test cases are generated so that the given input always makes
// it possible. 
//
// An array arr is strictly increasing if and only if arr[0] < arr[1] < arr[2] <
// ... < arr[arr.length - 1]. 
//
// 
// Example 1: 
//
// 
//Input: nums1 = [1,3,5,4], nums2 = [1,2,3,7]
//Output: 1
//Explanation: 
//Swap nums1[3] and nums2[3]. Then the sequences are:
//nums1 = [1, 3, 5, 7] and nums2 = [1, 2, 3, 4]
//which are both strictly increasing.
// 
//
// Example 2: 
//
// 
//Input: nums1 = [0,3,5,8,9], nums2 = [2,1,4,6,9]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums1.length <= 105 
// nums2.length == nums1.length 
// 0 <= nums1[i], nums2[i] <= 2 * 105 
// 
// Related Topics Array Dynamic Programming 
// 👍 1684 👎 120


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MinimumSwapsToMakeSequencesIncreasing_801 {

    
    
    @Test
    public void testMinimumSwapsToMakeSequencesIncreasing(){
       Solution solution = new MinimumSwapsToMakeSequencesIncreasing_801()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
