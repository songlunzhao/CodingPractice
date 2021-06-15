/**
 * Given an integer array nums, handle multiple queries of the following type:
 *
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 *
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 *
 */


package fackbook;

public class NumArray {
    int [] sumArray;
    public NumArray(int[] nums) {
        if (nums==null) return;
        sumArray = new int[nums.length];
        sumArray[0]=nums[0];

        for(int i=1; i<nums.length; i++){
            sumArray[i]=sumArray[i-1]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left==0) return sumArray[right];
        return sumArray[right]-sumArray[left-1];
    }
}
