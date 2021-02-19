//Given an array of integers nums and an integer target, return indices
// of the two numbers such that they add up to target.
//
// You may assume that each input would have exactly one solution, and you may n
//ot use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 103 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// Only one valid answer exists. 
// 
// Related Topics Array Hash Table 
// 👍 19311 👎 687



import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int [] ret = new int[2];
        //key = number value, value = number index
        Map<Integer, Integer> numberMap = new HashMap<>();
        for(int i=0; i<len; i++) {
            int key = target - nums[i];
            if (numberMap.containsKey(key)) {
                ret[0]= numberMap.get(key);
                ret[1]=i;
                break;
            } else {
                numberMap.put(nums[i], i);
            }

        }

        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
