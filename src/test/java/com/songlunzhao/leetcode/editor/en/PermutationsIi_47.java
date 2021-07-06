//Given a collection of numbers, nums,
// that might contain duplicates, return all
// possible unique permutations in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,1,2]
//Output:
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
// Related Topics Array Backtracking 
// 👍 3263 👎 81


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsIi_47 {

    
    
    @Test
    public void testPermutationsIi(){
       Solution solution = new PermutationsIi_47()
                        .new Solution();
        int[] nums = new int[]{1,1,2};
        List<List<Integer>> ans = solution.permuteUnique(nums);
        PrintUtils<Integer> printUtils = new PrintUtils<>();
        printUtils.print2DList(ans);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backTrack(nums, visited, combination, ans);
        return ans;
    }

    void backTrack(int[]nums, boolean[] visited, List<Integer> combination, List<List<Integer>> ans) {
        if(combination.size()== nums.length){
            ans.add(new ArrayList<>(combination));
            return;
        }
        for(int i=0; i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !visited[i-1]) continue;
            if(visited[i]) continue;
            combination.add(nums[i]);
            visited[i]=true;
            backTrack(nums, visited,combination, ans);
            visited[i]=false;
            combination.remove(combination.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
