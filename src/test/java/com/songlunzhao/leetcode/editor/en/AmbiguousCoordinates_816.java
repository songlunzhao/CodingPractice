//We had some 2-dimensional coordinates, like "(1, 3)" or "(2, 0.5)". Then, we r
//emoved all commas, decimal points, and spaces and ended up with the string s. 
//
// 
// For example, "(1, 3)" becomes s = "(13)" and "(2, 0.5)" becomes s = "(205)". 
//
// 
//
// Return a list of strings representing all possibilities for what our original
// coordinates could have been. 
//
// Our original representation never had extraneous zeroes, so we never started 
//with numbers like "00", "0.0", "0.00", "1.0", "001", "00.01", or any other numbe
//r that can be represented with fewer digits. Also, a decimal point within a numb
//er never occurs without at least one digit occurring before it, so we never star
//ted with numbers like ".1". 
//
// The final answer list can be returned in any order. All coordinates in the fi
//nal answer have exactly one space between them (occurring after the comma.) 
//
// 
// Example 1: 
//
// 
//Input: s = "(123)"
//Output: ["(1, 2.3)","(1, 23)","(1.2, 3)","(12, 3)"]
// 
//
// Example 2: 
//
// 
//Input: s = "(0123)"
//Output: ["(0, 1.23)","(0, 12.3)","(0, 123)","(0.1, 2.3)","(0.1, 23)","(0.12, 3
//)"]
//Explanation: 0.0, 00, 0001 or 00.01 are not allowed.
// 
//
// Example 3: 
//
// 
//Input: s = "(00011)"
//Output: ["(0, 0.011)","(0.001, 1)"]
// 
//
// Example 4: 
//
// 
//Input: s = "(100)"
//Output: ["(10, 0)"]
//Explanation: 1.0 is not allowed.
// 
//
// 
// Constraints: 
//
// 
// 4 <= s.length <= 12 
// s[0] == '(' and s[s.length - 1] == ')'. 
// The rest of s are digits. 
// 
// Related Topics String Backtracking 
// 👍 224 👎 540


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.List;

public class AmbiguousCoordinates_816 {

    
    
    @Test
    public void testAmbiguousCoordinates(){
       Solution solution = new AmbiguousCoordinates_816()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> ambiguousCoordinates(String s) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
