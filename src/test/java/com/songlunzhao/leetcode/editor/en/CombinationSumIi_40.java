//Given a collection of candidate numbers (candidates) and
// a target number (target), find all unique combinations in candidates where the candidate numbers sum
//to target. 
//
// Each number in candidates may only be used once in the combination. 
//
// Note: The solution set must not contain duplicate combinations. 
//
// 
// Example 1: 
//
// 
//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output: 
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]
// 
//
// Example 2: 
//
// 
//Input: candidates = [2,5,2,1,2], target = 5
//Output: 
//[
//[1,2,2],
//[5]
//]
// 
//
// 
// Constraints: 
//
// 
// 1 <= candidates.length <= 100 
// 1 <= candidates[i] <= 50 
// 1 <= target <= 30 
// 
// Related Topics Array Backtracking 
// 👍 3073 👎 94


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class CombinationSumIi_40 {

    
    
    @Test
    public void testCombinationSumIi(){
       Solution solution = new CombinationSumIi_40()
                        .new Solution();
        PrintUtils<Integer> printUtils = new PrintUtils<>();
       int[] candidates = new int[]{2,5,2,1,2};
        List<List<Integer>> ans = solution.combinationSum2(candidates, 8);
        printUtils.print2DList(ans);
        candidates =  new int[] {2,5,2,1,2};
        ans = solution.combinationSum2(candidates, 5);
        printUtils.print2DList(ans);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(candidates, target, 0 , combination, ans);
        return ans;
    }

    void backTrack(int[] candidates, int target, int beginIdx, List<Integer> combination, List<List<Integer>> ans) {
        if(target==0){
            ans.add(new ArrayList<>(combination));
            return;
        }
        for(int i=beginIdx; i<candidates.length && target>=candidates[i]; i++) {
            if(i>beginIdx && candidates[i]==candidates[i-1]) continue;
            combination.add(candidates[i]);
            backTrack(candidates, target-candidates[i], i+1, combination,  ans);
            combination.remove(combination.size()-1);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
