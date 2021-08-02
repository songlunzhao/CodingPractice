//We build a table of n rows (1-indexed). We start by writing 0 in the 1st row. 
//Now in every subsequent row, we look at the previous row and replace each occurr
//ence of 0 with 01, and each occurrence of 1 with 10. 
//
// 
// For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row 
//is 0110. 
// 
//
// Given two integer n and k, return the kth (1-indexed) symbol in the nth row o
//f a table of n rows. 
//
// 
// Example 1: 
//
// 
//Input: n = 1, k = 1
//Output: 0
//Explanation: row 1: 0
// 
//
// Example 2: 
//
// 
//Input: n = 2, k = 1
//Output: 0
//Explanation:
//row 1: 0
//row 2: 01
// 
//
// Example 3: 
//
// 
//Input: n = 2, k = 2
//Output: 1
//Explanation:
//row 1: 0
//row 2: 01
// 
//
// Example 4: 
//
// 
//Input: n = 3, k = 1
//Output: 0
//Explanation:
//row 1: 0
//row 2: 01
//row 3: 0110
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 30 
// 1 <= k <= 2n - 1 
// 
// Related Topics Math Bit Manipulation Recursion 
// 👍 1067 👎 215


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class KThSymbolInGrammar_779 {

    
    
    @Test
    public void testKThSymbolInGrammar(){
       Solution solution = new KThSymbolInGrammar_779()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int kthGrammar(int n, int k) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
