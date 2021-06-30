//Given an array nums of n integers, return an array of all the unique
// quadruple
//ts [nums[a], nums[b], nums[c], nums[d]] such that: 
//
// 
// 0 <= a, b, c, d < n 
// a, b, c, and d are distinct. 
// nums[a] + nums[b] + nums[c] + nums[d] == target 
// 
//
// You may return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// 
//
// Example 2: 
//
// 
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 200 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// 
// Related Topics Array Two Pointers Sorting 
// 👍 3586 👎 436


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.*;

public class FourSum_18 {

    
    
    @Test
    public void testFourSum(){
       Solution solution = new FourSum_18()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            threeSum(nums, map, target - nums[i], i+1) ;
            if(map.containsKey(target-nums[i] )){
                List<List<Integer>> ll = map.get(target-nums[i]);
                for(List<Integer>l : ll){
                    List<Integer> ret = new ArrayList<>();
                    ret.add(nums[i]);
                    ret.addAll(l);
                    ans.add(ret);
                }
            }
        }
        return ans;
    }

    private void threeSum(int[]nums, Map<Integer, List<List<Integer>>> map, int target, int begin) {
        for(int i=begin; i<nums.length; i++){
            if(i>begin && nums[i]==nums[i-1]) continue;
            int left = i+1, right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum<target){
                    left++;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                } else if(sum>target){
                    right--;
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                } else {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    List<List<Integer>> ll = null;
                    if(map.containsKey(target)){
                        ll = map.get(target);
                    } else {
                        ll = new ArrayList<>();
                        map.put(target, ll);
                    }
                    ll.add(l);

                    left++;
                    while(left<right && nums[left]==nums[left-1]) {
                        left++;
                    }
                    right--;
                    while(left<right && nums[right]==nums[right+1]) {
                        right--;
                    }
                }
            }
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}
