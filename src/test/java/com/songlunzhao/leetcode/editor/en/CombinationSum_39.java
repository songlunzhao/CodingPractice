//Given an array of distinct integers candidates and a target integer target,
// return a list of all unique combinations of candidates where the chosen numbers su
//m to target. You may return the combinations in any order. 
//
// The same number may be chosen from candidates an unlimited number of times. T
//wo combinations are unique if the frequency of at least one of the chosen number
//s is different. 
//
// It is guaranteed that the number of unique combinations that sum up to target
// is less than 150 combinations for the given input. 
//
// 
// Example 1: 
//
// 
//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple ti
//mes.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.
// 
//
// Example 2: 
//
// 
//Input: candidates = [2,3,5], target = 8
//Output: [[2,2,2,2],[2,3,3],[3,5]]
// 
//
// Example 3: 
//
// 
//Input: candidates = [2], target = 1
//Output: []
// 
//
// Example 4: 
//
// 
//Input: candidates = [1], target = 1
//Output: [[1]]
// 
//
// Example 5: 
//
// 
//Input: candidates = [1], target = 2
//Output: [[1,1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// All elements of candidates are distinct. 
// 1 <= target <= 500 
// 
// Related Topics Array Backtracking 
// 👍 6526 👎 163


package com.songlunzhao.leetcode.editor.en;

import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {


    @Test
    public void testCombinationSum() {
        Solution solution = new CombinationSum_39()
                .new Solution();
        PrintUtils<Integer> printUtils = new PrintUtils<>();
        int[]can = new int[]{2,3,5};
        List<List<Integer>> ans = solution.combinationSum(can,8);
        printUtils.print2DList(ans);

        can =  new int[] {2,5,2,1,2};
        ans = solution.combinationSum(can, 5);
        printUtils.print2DList(ans);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            //assume candidates are sorted and has only positive numbers
            Arrays.sort(candidates);
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> combination = new ArrayList<>();
            backTrack(candidates, 0, combination, target, ans);
            return ans;
        }

        private void backTrack(int[] candidates, int beginIdx, List<Integer> combination, int target, List<List<Integer>> ans) {
            if(target==0) {
                ans.add(new ArrayList<>(combination));
                return;
            }
            for(int i=beginIdx; i<candidates.length && target>=candidates[i]; i++) {
                if(i>beginIdx && candidates[i]==candidates[i-1]) continue;
                combination.add(candidates[i]);
                backTrack(candidates, i, combination, target-candidates[i], ans);
                combination.remove(combination.size()-1);
            }
        }
//
    }
//leetcode submit region end(Prohibit modification and deletion)

}
