//Given two sorted arrays nums1 and nums2 of size m and n respectively, return t
//he median of the two sorted arrays. 
//
// The overall run time complexity should be O(log (m+n)). 
//
// 
// Example 1: 
//
// 
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
// 
//
// Example 2: 
//
// 
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// 
//
// Example 3: 
//
// 
//Input: nums1 = [0,0], nums2 = [0,0]
//Output: 0.00000
// 
//
// Example 4: 
//
// 
//Input: nums1 = [], nums2 = [1]
//Output: 1.00000
// 
//
// Example 5: 
//
// 
//Input: nums1 = [2], nums2 = []
//Output: 2.00000
// 
//
// 
// Constraints: 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
// Related Topics Array Binary Search Divide and Conquer 
// 👍 10665 👎 1579


package com.songlunzhao.leetcode.editor.en;

public class MedianOfTwoSortedArrays_4 {

    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays_4()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0, preValue=0, currValue=0;
        int currentLen=0;
        boolean oneValue=(nums1.length+nums2.length)%2==0?false:true;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                currValue=nums1[i];
                i++;
            } else {
                currValue=nums2[j];
                j++;
            }
            currentLen++;
            if(currentLen==(nums1.length+nums2.length)/2+1){
                if(oneValue){
                    return currValue;
                } else {
                    return(currValue+preValue)/2.0;
                }
            }
            preValue=currValue;
        }
        int[] nums=null;
        int k=0;
        if(i<nums1.length){
            nums=nums1;
            k=i;
        } else {
            nums=nums2;
            k=j;
        }
        while(k<nums.length) {
            currValue=nums[k];
            k++;
            currentLen++;
            if(currentLen==(nums1.length+nums2.length)/2+1){
                if(oneValue){
                    return currValue;
                } else {
                    return(currValue+preValue)/2.0;
                }
            }
            preValue=currValue;

        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
