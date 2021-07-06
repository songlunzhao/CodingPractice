//Given two integers n and k,
// return all possible combinations of k numbers out
//of the range [1, n]. 
//
// You may return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: n = 4, k = 2
//Output:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//]
// 
//
// Example 2: 
//
// 
//Input: n = 1, k = 1
//Output: [[1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
// Related Topics Array Backtracking 
// 👍 2486 👎 88


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {

    
    
    @Test
    public void testCombinations(){
       Solution solution = new Combinations_77()
                        .new Solution();
        List<List<Integer>> ans = solution.combine(4,2);
        PrintUtils<Integer> printUtils = new PrintUtils<>();
        printUtils.print2DList(ans);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backTrack(n,k,1, combination,ans);
        return ans;
    }

    void backTrack(int n, int size, int beginIdx, List<Integer> combination, List<List<Integer>> ans) {
            if(combination.size()==size){
                ans.add(new ArrayList<>(combination));
                return;
            }
            for(int i=beginIdx; i<=n;i++){
                combination.add(i);
                backTrack(n,size,i+1, combination, ans);
                combination.remove(combination.size()-1);
            }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
