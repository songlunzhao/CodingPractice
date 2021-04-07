//Given a non-empty array of integers nums, every element appears twice except f
//or one. Find that single one. 
//
// Follow up: Could you implement a solution with a linear runtime complexity an
//d without using extra memory? 
//
// 
// Example 1: 
// Input: nums = [2,2,1]
//Output: 1
// Example 2: 
// Input: nums = [4,1,2,1,2]
//Output: 4
// Example 3: 
// Input: nums = [1]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 104 
// -3 * 104 <= nums[i] <= 3 * 104 
// Each element in the array appears twice except for one element which appears 
//only once. 
// 
// Related Topics Hash Table Bit Manipulation 
// 👍 6004 👎 197


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
//        if(nums==null || nums.length==0) return 0;
//        if(nums.length==1) return nums[0];
//        Arrays.sort(nums);
//        if(nums[0]!=nums[1]) return nums[0];
//        int count=0;
//        for(int i=1;i<nums.length-1;i++){
//            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
//                return nums[i];
//        }
//        return nums[nums.length-1];

        int a = 0;
        for (int i : nums) {
            //a ^= i;
            a=a^i;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
