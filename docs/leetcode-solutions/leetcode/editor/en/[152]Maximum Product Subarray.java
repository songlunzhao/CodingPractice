//Given an integer array nums, find a contiguous non-empty subarray within the a
//rray that has the largest product, and return the product. 
//
// It is guaranteed that the answer will fit in a 32-bit integer. 
//
// A subarray is a contiguous subsequence of the array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 104 
// -10 <= nums[i] <= 10 
// 
// Related Topics Array Dynamic Programming 
// 👍 6350 👎 206


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int globalMax=nums[0], currentMax=nums[0], currentMin=nums[0];

        for(int i=1;i< nums.length; i++){
            int tmpMax=currentMax;
            currentMax=Math.max(Math.max(nums[i], currentMax*nums[i]), currentMin*nums[i]);
            currentMin=Math.min(Math.min(nums[i], tmpMax*nums[i]), currentMin*nums[i]);
            globalMax=Math.max(globalMax,currentMax);
        }
        return globalMax;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
