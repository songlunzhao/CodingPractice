//You are given an integer array nums. You want to maximize the number of points
// you get by performing the following operation any number of times: 
//
// 
// Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must d
//elete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
// 
// 
//
// Return the maximum number of points you can earn by applying the above operat
//ion some number of times. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,4,2]
//Output: 6
//Explanation: You can perform the following operations:
//- Delete 4 to earn 4 points. Consequently, 3 is also deleted. nums = [2].
//- Delete 2 to earn 2 points. nums = [].
//You earn a total of 6 points.
// 
//
// Example 2: 
//
// 
//Input: nums = [2,2,3,3,3,4]
//Output: 9
//Explanation: You can perform the following operations:
//- Delete a 3 to earn 3 points. All 2's and 4's are also deleted. nums = [3,3].
//
//- Delete a 3 again to earn 3 points. nums = [3].
//- Delete a 3 once more to earn 3 points. nums = [].
//You earn a total of 9 points. 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 104 
// 1 <= nums[i] <= 104 
// 
// Related Topics Array Hash Table Dynamic Programming 
// 👍 1838 👎 138


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class DeleteAndEarn_740 {

    
    
    @Test
    public void testDeleteAndEarn(){
       Solution solution = new DeleteAndEarn_740()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int deleteAndEarn(int[] nums) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
