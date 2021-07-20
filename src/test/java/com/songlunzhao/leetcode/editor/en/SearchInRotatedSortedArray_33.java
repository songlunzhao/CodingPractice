//There is an integer array nums sorted in
// ascending order (with distinct values
//). 
//
// Prior to being passed to your function, nums is rotated at an unknown pivot i
//ndex k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+
//1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, 
//[0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. 
//
// Given the array nums after the rotation and an integer target, return the ind
//ex of target if it is in nums, or -1 if it is not in nums. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
// Example 3: 
// Input: nums = [1], target = 0
//Output: -1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5000 
// -104 <= nums[i] <= 104 
// All values of nums are unique. 
// nums is guaranteed to be rotated at some pivot. 
// -104 <= target <= 104 
// 
// Related Topics Array Binary Search 
// 👍 8533 👎 705


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchInRotatedSortedArray_33 {

    
    
    @Test
    public void testSearchInRotatedSortedArray(){
       Solution solution = new SearchInRotatedSortedArray_33()
                        .new Solution();
        int []nums = new int[] {4,5,6,7,0,1,2};
        assertEquals(solution.search(nums,0),4);
        assertEquals(solution.search(nums,5),1);
        assertEquals(solution.search(nums,3),-1);
        assertEquals(solution.search(nums,2),6);
        nums = new int[] {4,1};
        assertEquals(solution.search(nums,1),1);


    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1, mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            //[6,7,8,9,0,1,2]
            if(nums[0]<=nums[mid]){
                //0 to mid is ascending order
                if(nums[mid]>target && target>=nums[0]){
                    //target is between begin & mid
                    right=mid-1;
                } else {
                    left=mid+1;
                }
            } else {
                //mid to right is ascending order
                if(nums[mid]<target && target<=nums[nums.length-1]){
                    //target is between mid and end
                    left=mid+1;
                } else {
                    right=mid-1;
                }
            }

        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
