//Given an integer array nums of unique elements,
// return all possible subsets (t
//he power set). 
//
// The solution set must not contain duplicate subsets. Return the solution in a
//ny order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// 
//
// Example 2: 
//
// 
//Input: nums = [0]
//Output: [[],[0]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// All the numbers of nums are unique. 
// 
// Related Topics Array Backtracking Bit Manipulation 
// 👍 6295 👎 115


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {

    
    
    @Test
    public void testSubsets(){
       Solution solution = new Subsets_78()
                        .new Solution();

        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans = solution.subsets(nums);
        PrintUtils<Integer> printUtils = new PrintUtils<>();
        printUtils.print2DList(ans);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backTrack(nums,0,combination,ans);
        return ans;
    }

    void backTrack(int[]nums, int beginIdx, List<Integer> combination, List<List<Integer>> ans) {
        ans.add(new ArrayList(combination));
        for(int i=beginIdx; i<nums.length; i++){
            combination.add(nums[i]);
            backTrack(nums, i+1, combination, ans);
            combination.remove(combination.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
