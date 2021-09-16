//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint stopping you
// from robbing each of them is that adjacent houses have security systems connected and
//it will automatically contact the police if two adjacent houses were broken into
// on the same night. 
//
// Given an integer array nums representing the amount of money of each house,
// return the maximum amount of money you can rob tonight without alerting the police.
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 
//(money = 1).
//Total amount you can rob = 2 + 9 + 1 = 12.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 400 
// 
// Related Topics Array Dynamic Programming 
// 👍 8376 👎 210


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class HouseRobber_198 {

    
    
    @Test
    public void testHouseRobber(){
       Solution solution = new HouseRobber_198()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        /**
         * 考虑到每间房屋的最高总金额只和该房屋的前两间房屋的最高总金额相关，
         *          * 因此可以使用滚动数组，在每个时刻只需要存储前两间房屋的最高总金额，
         *          * 将空间复杂度降到 O(1)。
         *          *
         * @param nums
         * @return
         */
        public int rob(int[] nums) {
            if(nums==null) return 0;
            if(nums.length==1) return nums[0];
            if(nums.length==2) return Math.max(nums[0],nums[1]);

            int first=nums[0], second=Math.max(nums[0],nums[1]);
            for(int i=2; i<nums.length; i++){
                int tmp = second;
                second = Math.max(first+nums[i], second);
                first = tmp;
            }
            return second;
        }
        /**
         * naive dp
         * @param nums
         * @return
         *
         * time O(n)
         * space O(n)
         */
    public int rob_naivedp(int[] nums) {

        //dp[i][0] -- not rob house i
        //dp[i][1] -- rob house i
        int dp[][] = new int[nums.length][2];
        //equation of state
        // dp[i][0]=dp[i-1][1] + nums[i]
        // dp[i][1]=max(dp[i-1][0], dp[i-1][1]
        //ans = max(dp[n][0],dp[n][1])
        dp[0][0]=0;
        dp[0][1]=nums[0];
        for(int i=1; i<nums.length; i++){
            //money rob house i = not rob house i-1 + house i money
            dp[i][1]=dp[i-1][0] + nums[i];
            //money not rob house i = max(not rob house i-1, rob house i-1)
            dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]);
        }
        return Math.max(dp[nums.length-1][0], dp[nums.length-1][1]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
