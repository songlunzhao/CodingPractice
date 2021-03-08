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
// Related Topics Array Two Pointers 
// 👍 2961 👎 166


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ret=0, diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            //skip duplicates
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int left=i+1, right= nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum==target){
                        return sum;
                    }
                    if(Math.abs(sum-target)<diff){
                        diff=Math.abs(sum-target);
                        ret = sum;
                    }
                    if(sum>target) {
                        right--;
                    } else {
                        left++;
                    }
                }

            }

        }
        return ret;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
