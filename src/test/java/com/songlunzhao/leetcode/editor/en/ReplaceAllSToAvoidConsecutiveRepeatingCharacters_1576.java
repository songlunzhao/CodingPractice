//Given a string s containing only lower case English letters and the '?' charac
//ter, convert all the '?' characters into lower case letters such that the final 
//string does not contain any consecutive repeating characters. You cannot modify 
//the non '?' characters. 
//
// It is guaranteed that there are no consecutive repeating characters in the gi
//ven string except for '?'. 
//
// Return the final string after all the conversions (possibly zero) have been m
//ade. If there is more than one solution, return any of them. It can be shown tha
//t an answer is always possible with the given constraints. 
//
// 
// Example 1: 
//
// 
//Input: s = "?zs"
//Output: "azs"
//Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all
// are valid. Only "z" is an invalid modification as the string will consist of co
//nsecutive repeating characters in "zzs". 
//
// Example 2: 
//
// 
//Input: s = "ubv?w"
//Output: "ubvaw"
//Explanation: There are 24 solutions for this problem. Only "v" and "w" are inv
//alid modifications as the strings will consist of consecutive repeating characte
//rs in "ubvvw" and "ubvww".
// 
//
// Example 3: 
//
// 
//Input: s = "j?qg??b"
//Output: "jaqgacb"
// 
//
// Example 4: 
//
// 
//Input: s = "??yw?ipkj?"
//Output: "acywaipkja"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 100 
// s contains only lower case English letters and '?'. 
// 
// Related Topics String 
// 👍 290 👎 124


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ReplaceAllSToAvoidConsecutiveRepeatingCharacters_1576 {

    
    
    @Test
    public void testReplaceAllSToAvoidConsecutiveRepeatingCharacters(){
       Solution solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters_1576()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String modifyString(String s) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
