//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once. The relative order
// of the elements should be kept the same. 
//
// Since it is impossible to change the length of the array in some languages, y
//ou must instead have the result be placed in the first part of the array nums. M
//ore formally, if there are k elements after removing the duplicates, then the fi
//rst k elements of nums should hold the final result. It does not matter what you
// leave beyond the first k elements. 
//
// Return k after placing the final result in the first k slots of nums. 
//
// Do not allocate extra space for another array. You must do this by modifying 
//the input array in-place with O(1) extra memory. 
//
// Custom Judge: 
//
// The judge will test your solution with the following code: 
//
// 
//int[] nums = [...]; // Input array
//int[] expectedNums = [...]; // The expected answer with correct length
//
//int k = removeDuplicates(nums); // Calls your implementation
//
//assert k == expectedNums.length;
//for (int i = 0; i < k; i++) {
//    assert nums[i] == expectedNums[i];
//}
// 
//
// If all assertions pass, then your solution will be accepted. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of
// nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are unders
//cores).
// 
//
// Example 2: 
//
// 
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements o
//f nums being 0, 1, 2, 3, and 4 respectively.
//It does not matter what you leave beyond the returned k (hence they are unders
//cores).
// 
//
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 3 * 104 
// -100 <= nums[i] <= 100 
// nums is sorted in non-decreasing order. 
// 
// Related Topics Array Two Pointers 
// 👍 4254 👎 7431


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class RemoveDuplicatesFromSortedArray_26 {

    
    
    @Test
    public void testRemoveDuplicatesFromSortedArray(){
       Solution solution = new RemoveDuplicatesFromSortedArray_26()
                        .new Solution();
       int[] nums = new int[] {-3,-1,0,0,0,3,3};
        PrintUtils.printArray(nums);
        solution.removeDuplicates(nums);
        nums = new int[] {1,1,2};
        solution.removeDuplicates(nums);
        PrintUtils.printArray(nums);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums==null || nums.length==0) return 0;
            if(nums.length==1) return 1;
            int preValue = nums[0], preIndex=0;
            int len=1;
            for(int i=1; i<nums.length; i++){
                if(nums[i]!=preValue){
                    nums[preIndex+1]=nums[i];
                    preValue=nums[i];
                    preIndex++;
                    len++;
                }
            }
            return len;

        }
        //Tree Set solution
//    public int removeDuplicates(int[] nums) {
//        Set<Integer> numSet = new TreeSet<>();
//        for(int i=0; i<nums.length;  i++) {
//            numSet.add(nums[i]);
//        }
//
//        int j=0;
//        for(Integer i: numSet){
//            nums[j]=i;
//            j++;
//        }
//
//        return numSet.size();
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
