//You are a professional robber planning to rob houses along a street. Each hous
//e has a certain amount of money stashed. All houses at this place are arranged i
//n a circle. That means the first house is the neighbor of the last one. Meanwhil
//e, adjacent houses have a security system connected, and it will automatically c
//ontact the police if two adjacent houses were broken into on the same night. 
//
// Given an integer array nums representing the amount of money of each house, r
//eturn the maximum amount of money you can rob tonight without alerting the polic
//e. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,2]
//Output: 3
//Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 
//2), because they are adjacent houses.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2,3]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 1000 
// 
// Related Topics Array Dynamic Programming 
// 👍 3567 👎 70


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class HouseRobberIi_213 {

    
    
    @Test
    public void testHouseRobberIi(){
       Solution solution = new HouseRobberIi_213()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        /**
         * 考虑到每间房屋的最高总金额只和该房屋的前两间房屋的最高总金额相关，
         * 因此可以使用滚动数组，在每个时刻只需要存储前两间房屋的最高总金额，
         * 将空间复杂度降到 O(1)。
         *
         *假设数组 nums 的长度为 nn。
         * 如果不偷窃最后一间房屋，则偷窃房屋的下标范围是 [0, n-2]；
         * 如果不偷窃第一间房屋，则偷窃房屋的下标范围是 [1, n-1]
         * time O(n)
         * space O(1)
         */
        public int rob(int[] nums) {
            //equation of state
            //dp[start]=nums[start]
            //dp[start+1]=max(nums[start],nums[start+1])+dp[start];
            if(nums==null) return 0;
            if(nums.length==1) return nums[0];
            if(nums.length==2) return Math.max(nums[0],nums[1]);
            return Math.max(robRange(nums,0,nums.length-2),
                robRange(nums,1,nums.length-1));
        }

        public int robRange(int[] nums, int start, int end){
            int first = nums[start], second = Math.max(nums[start], nums[start+1]);
            for(int i=start+2; i<=end; i++){
                int tmp = second;
                second = Math.max(first + nums[i], second);
                first=tmp;
            }
            return second;
        }

        /**
         * naive DP
          * @param nums
         * @return
         *
         * time O(n)
         * space O(n)
         */
    public int rob_naivedp(int[] nums) {
        if(nums==null) return 0;
        if(nums.length==1) return nums[0];
        //check house robber question 198
        int dp[][]=new int[nums.length][2];
        int dp1[][]=new int[nums.length][2];
        int maxDp, maxDp1;
        int n = nums.length;
        //dp - rob/not rob house 0, always not rob house n-1; --aka skip n-1
        //dp1 - always not house 0, rob/not rob house n; --aka skip 0
        dp[0][1]=nums[0];
        dp[0][0]=0;
        dp1[1][0]=0;
        dp1[1][1]=nums[1];
        for(int i=1; i<n; i++){
            if(i!=1){
                //skip dp1[0]
                //money rob house i = not rob house i-1 + house i money
                dp1[i][1]=dp1[i-1][0] + nums[i];
                //money not rob house i = max(not rob house i-1, rob house i-1)
                dp1[i][0]=Math.max(dp1[i-1][0], dp1[i-1][1]);
            }
            //money rob house i = not rob house i-1 + house i money
            dp[i][1]=dp[i-1][0] + nums[i];
            //money not rob house i = max(not rob house i-1, rob house i-1)
            dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]);
        }
        //skip dp0[n-1]
        maxDp=Math.max(dp[n-2][0],dp[n-2][1]);
        maxDp1=Math.max(dp1[n-1][0],dp1[n-1][1]);
        return Math.max(maxDp,maxDp1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
