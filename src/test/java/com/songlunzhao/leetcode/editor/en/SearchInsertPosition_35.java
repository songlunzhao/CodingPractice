//Given a sorted array of distinct integers and a target value,
// return the index
// if the target is found. If not, return the index where it would be if it were i
//nserted in order. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [1,3,5,6], target = 5
//Output: 2
// Example 2: 
// Input: nums = [1,3,5,6], target = 2
//Output: 1
// Example 3: 
// Input: nums = [1,3,5,6], target = 7
//Output: 4
// Example 4: 
// Input: nums = [1,3,5,6], target = 0
//Output: 0
// Example 5: 
// Input: nums = [1], target = 0
//Output: 0
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// nums contains distinct values sorted in ascending order. 
// -104 <= target <= 104 
// 
// Related Topics Array Binary Search 
// 👍 3883 👎 306


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchInsertPosition_35 {

    
    
    @Test
    public void testSearchInsertPosition(){
       Solution solution = new SearchInsertPosition_35()
                        .new Solution();
       int[] nums = new int[]{1,3,5,6};
       assertEquals(solution.searchInsert(nums,-1),0);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0, right=nums.length-1, idx=0;
        while(left<=right){
            idx=(left+right)/2;
            if(nums[idx]==target){
                return idx;
            } else if (nums[idx]<target){
               left=idx+1;
            } else {
               right=idx-1;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
