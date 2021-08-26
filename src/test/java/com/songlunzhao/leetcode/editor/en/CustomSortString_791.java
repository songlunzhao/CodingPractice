//You are given two strings order and s. All the words of order are unique and w
//ere sorted in some custom order previously. 
//
// Permute the characters of s so that they match the order that order was sorte
//d. More specifically, if a character x occurs before a character y in order, the
//n x should occur before y in the permuted string. 
//
// Return any permutation of s that satisfies this property. 
//
// 
// Example 1: 
//
// 
//Input: order = "cba", s = "abcd"
//Output: "cbad"
//Explanation: 
//"a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b
//", and "a". 
//Since "d" does not appear in order, it can be at any position in the returned 
//string. "dcba", "cdba", "cbda" are also valid outputs.
// 
//
// Example 2: 
//
// 
//Input: order = "cbafg", s = "abcd"
//Output: "cbad"
// 
//
// 
// Constraints: 
//
// 
// 1 <= order.length <= 26 
// 1 <= s.length <= 200 
// order and s consist of lowercase English letters. 
// All the characters of order are unique. 
// 
// Related Topics Hash Table String Sorting 
// 👍 1430 👎 248


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class CustomSortString_791 {

    
    
    @Test
    public void testCustomSortString(){
       Solution solution = new CustomSortString_791()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String customSortString(String order, String s) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
