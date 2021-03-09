//Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: nums = [0]
//Output: 0
// 
//
// Example 4: 
//
// 
//Input: nums = [-1]
//Output: -1
// 
//
// Example 5: 
//
// 
//Input: nums = [-100000]
//Output: -100000
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//Follow up: If you have figured out the O(n) solution, try coding another solut
//ion using the divide and conquer approach, which is more subtle. Related Topics 
//Array Divide and Conquer Dynamic Programming 
// 👍 11085 👎 529


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        //dynamic programming
        //largest sum total[i]=total[i-1]+nums[i]

        if(nums.length==1) return nums[0];
        int globalMax=nums[0], currentMax=nums[0];

        for(int i=1;i< nums.length; i++){
            currentMax=Math.max(nums[i], currentMax+nums[i]);
            globalMax=Math.max(globalMax,currentMax);
        }
        return globalMax;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
