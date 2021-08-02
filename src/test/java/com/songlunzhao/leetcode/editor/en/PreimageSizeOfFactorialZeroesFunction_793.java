//Let f(x) be the number of zeroes at the end of x!. Recall that x! = 1 * 2 * 3 
//* ... * x and by convention, 0! = 1. 
//
// 
// For example, f(3) = 0 because 3! = 6 has no zeroes at the end, while f(11) = 
//2 because 11! = 39916800 has two zeroes at the end. 
// 
//
// Given an integer k, return the number of non-negative integers x have the pro
//perty that f(x) = k. 
//
// 
// Example 1: 
//
// 
//Input: k = 0
//Output: 5
//Explanation: 0!, 1!, 2!, 3!, and 4! end with k = 0 zeroes.
// 
//
// Example 2: 
//
// 
//Input: k = 5
//Output: 0
//Explanation: There is no x such that x! ends in k = 5 zeroes.
// 
//
// Example 3: 
//
// 
//Input: k = 3
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// 0 <= k <= 109 
// 
// Related Topics Math Binary Search 
// 👍 241 👎 65


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class PreimageSizeOfFactorialZeroesFunction_793 {

    
    
    @Test
    public void testPreimageSizeOfFactorialZeroesFunction(){
       Solution solution = new PreimageSizeOfFactorialZeroesFunction_793()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int preimageSizeFZF(int k) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
