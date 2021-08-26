//Given a string num that contains only digits and an integer target, return all
// possibilities to add the binary operators '+', '-', or '*' between the digits o
//f num so that the resultant expression evaluates to the target value. 
//
// 
// Example 1: 
// Input: num = "123", target = 6
//Output: ["1*2*3","1+2+3"]
// Example 2: 
// Input: num = "232", target = 8
//Output: ["2*3+2","2+3*2"]
// Example 3: 
// Input: num = "105", target = 5
//Output: ["1*0+5","10-5"]
// Example 4: 
// Input: num = "00", target = 0
//Output: ["0*0","0+0","0-0"]
// Example 5: 
// Input: num = "3456237490", target = 9191
//Output: []
// 
// 
// Constraints: 
//
// 
// 1 <= num.length <= 10 
// num consists of only digits. 
// -231 <= target <= 231 - 1 
// 
// Related Topics Math String Backtracking 
// 👍 1798 👎 302


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.List;

public class ExpressionAddOperators_282 {

    
    
    @Test
    public void testExpressionAddOperators(){
       Solution solution = new ExpressionAddOperators_282()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> addOperators(String num, int target) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
