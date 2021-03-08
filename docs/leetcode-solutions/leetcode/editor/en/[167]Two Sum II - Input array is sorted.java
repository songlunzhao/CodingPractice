//Given an array of integers numbers that is already sorted in ascending order, 
//find two numbers such that they add up to a specific target number. 
//
// Return the indices of the two numbers (1-indexed) as an integer array answer 
//of size 2, where 1 <= answer[0] < answer[1] <= numbers.length. 
//
// You may assume that each input would have exactly one solution and you may no
//t use the same element twice. 
//
// 
// Example 1: 
//
// 
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
// 
//
// Example 2: 
//
// 
//Input: numbers = [2,3,4], target = 6
//Output: [1,3]
// 
//
// Example 3: 
//
// 
//Input: numbers = [-1,0], target = -1
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// 2 <= numbers.length <= 3 * 104 
// -1000 <= numbers[i] <= 1000 
// numbers is sorted in increasing order. 
// -1000 <= target <= 1000 
// Only one valid answer exists. 
// 
// Related Topics Array Two Pointers Binary Search 
// 👍 2422 👎 694


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j) {
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                int[] ret = new int[2];
                ret[0]=i+1;
                ret[1]=j+1;
                return ret;
            }
            if(sum<target) i++;
            else j--;
        }
        return null;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
