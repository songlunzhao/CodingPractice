//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k
//]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
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
// 👍 11245 👎 1120


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    
    
    @Test
    public void testThreeSum(){
       Solution solution = new ThreeSum_15()
                        .new Solution();
       int[]input = new int[] {-1,0,1,2,-1,-4};
       List<List<Integer>> ans = solution.threeSum(input);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            List<List<Integer>> result = twoSum(nums[i], nums, i+1);
            if(!result.isEmpty()){
                ans.addAll(result);
            }
        }
        return ans;
    }

    List<List<Integer>> twoSum(int total, int[]nums, int begin){
        List<List<Integer>> ans = new ArrayList<>();
        int left = begin, right = nums.length-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum+total<0) {
                left++;
                while(left<right && nums[left]==nums[left-1]) {
                    left++;
                }
            } else if(sum+total>0) {
                right--;
                while(left<right && nums[right]==nums[right+1]) {
                    right--;
                }
            } else {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(total);
                tmp.add(nums[left]);
                tmp.add(nums[right]);
                ans.add(tmp);
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1]) {
                    left++;
                }
                while(left<right && nums[right]==nums[right+1]) {
                    right--;
                }
            }

        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
