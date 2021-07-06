//An n-bit gray code sequence
// is a sequence of 2n integers where:
//
// 
// Every integer is in the inclusive range [0, 2n - 1], 
// The first integer is 0, 
// An integer appears no more than once in the sequence, 
// The binary representation of every pair of adjacent integers differs by exact
//ly one bit, and 
// The binary representation of the first and last integers differs by exactly o
//ne bit. 
// 
//
// Given an integer n, return any valid n-bit gray code sequence. 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: [0,1,3,2]
//Explanation:
//The binary representation of [0,1,3,2] is [00,01,11,10].
//- 00 and 01 differ by one bit
//- 01 and 11 differ by one bit
//- 11 and 10 differ by one bit
//- 10 and 00 differ by one bit
//[0,2,3,1] is also a valid gray code sequence, whose binary representation is [
//00,10,11,01].
//- 00 and 10 differ by one bit
//- 10 and 11 differ by one bit
//- 11 and 01 differ by one bit
//- 01 and 00 differ by one bit
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 16 
// 
// Related Topics Math Backtracking Bit Manipulation 
// 👍 1089 👎 2012


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GrayCode_89 {

    
    
    @Test
    public void testGrayCode(){
       Solution solution = new GrayCode_89()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        LinkedList<Integer> combination = new LinkedList<>();
        backTrack(n, combination, ans);
        return ans;
    }

    void backTrack(int n, LinkedList<Integer>combination, List<Integer> ans){
        if(combination.size()==n) {
            ans.add(convertToInteger(combination));
            return;
        }
        for(int i=0;i<2;i++){
            combination.add(i);
            backTrack(n,combination,ans);
            combination.remove(combination.size()-1);
        }
    }

    Integer convertToInteger(List<Integer> combination) {
        int sum=0;
        for(int i=combination.size()-1;i>=0; i--){
            sum = sum + (int)(combination.get(i)*Math.pow(2,i));
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
