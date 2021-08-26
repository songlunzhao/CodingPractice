//Given a string s representing a valid expression, implement a basic calculator
// to evaluate it, and return the result of the evaluation. 
//
// Note: You are not allowed to use any built-in function which evaluates string
//s as mathematical expressions, such as eval(). 
//
// 
// Example 1: 
//
// 
//Input: s = "1 + 1"
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: s = " 2-1 + 2 "
//Output: 3
// 
//
// Example 3: 
//
// 
//Input: s = "(1+(4+5+2)-3)+(6+8)"
//Output: 23
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 3 * 105 
// s consists of digits, '+', '-', '(', ')', and ' '. 
// s represents a valid expression. 
// '+' is not used as a unary operation. 
// '-' could be used as a unary operation but it has to be followed by parenthes
//es. 
// Every number and running calculation will fit in a signed 32-bit integer. 
// 
// Related Topics Math String Stack Recursion 
// 👍 2486 👎 222


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class BasicCalculator_224 {

    
    
    @Test
    public void testBasicCalculator(){
       Solution solution = new BasicCalculator_224()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calculate(String s) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
