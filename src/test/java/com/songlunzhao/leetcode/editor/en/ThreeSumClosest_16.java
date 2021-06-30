//Given an array nums of n integers and an integer target, find three integers i
//n nums such that the sum is closest to target. Return the sum of the three integ
//ers. You may assume that each input would have exactly one solution. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// 
//
// 
// Constraints: 
//
// 
// 3 <= nums.length <= 10^3 
// -10^3 <= nums[i] <= 10^3 
// -10^4 <= target <= 10^4 
// 
// Related Topics Array Two Pointers Sorting 
// 👍 3529 👎 183


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ThreeSumClosest_16 {


    @Test
    public void testThreeSumClosest() {
        Solution solution = new ThreeSumClosest_16()
                .new Solution();
        int[] nums = new int[] {-1,2,1,-4};
        int ret = solution.threeSumClosest(nums, 1);
        assertEquals(ret, 2);
        nums = new int[] {1,1,-1,-1,3};
        ret = solution.threeSumClosest(nums, -1);
        assertEquals(ret, -1);

        nums = new int[] {0,1,2};
        ret = solution.threeSumClosest(nums, 3);
        assertEquals(ret, 3);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int min = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                Integer result = twoSum(nums[i], nums, i + 1, target);
                if (result !=null && Math.abs(result - target) < min) {
                    min = Math.abs(result - target);
                    ans = result;
                }
            }
            return ans;
        }

        Integer twoSum(int num, int[] nums, int begin, int target) {
            int left = begin, right = nums.length - 1;
            int min = Integer.MAX_VALUE;
            Integer ret=null;
            while (left < right) {
                int sum = nums[left] + nums[right] + num;
                if (min > Math.abs(sum - target)) {
                    min = Math.abs(sum - target);
                    ret = sum;
                }
                if (sum < target) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (sum > target) {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else {
                    return ret;
                }


            }
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
