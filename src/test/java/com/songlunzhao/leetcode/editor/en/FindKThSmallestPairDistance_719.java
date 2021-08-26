//The distance of a pair of integers a and b is defined as the absolute differen
//ce between a and b. 
//
// Given an integer array nums and an integer k, return the kth smallest distanc
//e among all the pairs nums[i] and nums[j] where 0 <= i < j < nums.length. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,3,1], k = 1
//Output: 0
//Explanation: Here are all the pairs:
//(1,3) -> 2
//(1,1) -> 0
//(3,1) -> 2
//Then the 1st smallest distance pair is (1,1), and its distance is 0.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,1,1], k = 2
//Output: 0
// 
//
// Example 3: 
//
// 
//Input: nums = [1,6,1], k = 3
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// n == nums.length 
// 2 <= n <= 104 
// 0 <= nums[i] <= 106 
// 1 <= k <= n * (n - 1) / 2 
// 
// Related Topics Array Two Pointers Binary Search Sorting 
// 👍 1521 👎 53


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class FindKThSmallestPairDistance_719 {

    
    
    @Test
    public void testFindKThSmallestPairDistance(){
       Solution solution = new FindKThSmallestPairDistance_719()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
