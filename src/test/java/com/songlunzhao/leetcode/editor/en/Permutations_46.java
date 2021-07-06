//Given an array nums of distinct integers,
// return all the possible permutations
//. You can return the answer in any order. 
//
// 
// Example 1: 
// Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2: 
// Input: nums = [0,1]
//Output: [[0,1],[1,0]]
// Example 3: 
// Input: nums = [1]
//Output: [[1]]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// All the integers of nums are unique. 
// 
// Related Topics Array Backtracking 
// 👍 6601 👎 139


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

    
    
    @Test
    public void testPermutations(){
       Solution solution = new Permutations_46()
                        .new Solution();

        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans = solution.permute(nums);
        PrintUtils<Integer> printUtils = new PrintUtils<>();
        printUtils.print2DList(ans);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(nums,visited, combination, ans);
        return ans;
    }

    void backTrack(int[]nums, boolean[] visited, List<Integer> combination, List<List<Integer>> ans){
        if(combination.size()==nums.length){
            ans.add(new ArrayList<>(combination));
            return;
        }
        for(int i=0; i< nums.length; i++){
            if(visited[i]) continue;
            combination.add(nums[i]);
            visited[i]=true;
            backTrack(nums, visited, combination, ans);
            visited[i]=false;
            combination.remove(combination.size()-1);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
