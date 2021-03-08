//Given an array nums of n integers, are there elements a, b, c in nums such tha
//t a + b + c = 0? Find all unique triplets in the array which gives the sum of ze
//ro. 
//
// Notice that the solution set must not contain duplicate triplets. 
//
// 
// Example 1: 
// Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
// Example 2: 
// Input: nums = []
//Output: []
// Example 3: 
// Input: nums = [0]
//Output: []
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics Array Two Pointers 
// 👍 9693 👎 994


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++) {
            //skip duplicate number
            if(i==0 || (i>0 && nums[i] != nums[i-1]) ) {
                int left = i+1, right= nums.length-1;
                //2sum, target=0-nums[i]
                while(left<right) {
                    if(nums[left]+nums[right]+nums[i]==0){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        //advance left & right
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    } else if (nums[left]+nums[right]<-nums[i]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
