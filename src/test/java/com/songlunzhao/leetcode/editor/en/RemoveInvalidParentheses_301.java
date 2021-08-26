//Given a string s that contains parentheses and letters, remove the minimum num
//ber of invalid parentheses to make the input string valid. 
//
// Return all the possible results. You may return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: s = "()())()"
//Output: ["(())()","()()()"]
// 
//
// Example 2: 
//
// 
//Input: s = "(a)())()"
//Output: ["(a())()","(a)()()"]
// 
//
// Example 3: 
//
// 
//Input: s = ")("
//Output: [""]
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 25 
// s consists of lowercase English letters and parentheses '(' and ')'. 
// There will be at most 20 parentheses in s. 
// 
// Related Topics String Backtracking Breadth-First Search 
// 👍 3688 👎 170


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.List;

public class RemoveInvalidParentheses_301 {

    
    
    @Test
    public void testRemoveInvalidParentheses(){
       Solution solution = new RemoveInvalidParentheses_301()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
