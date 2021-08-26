//Special binary strings are binary strings with the following two properties: 
//
// 
// The number of 0's is equal to the number of 1's. 
// Every prefix of the binary string has at least as many 1's as 0's. 
// 
//
// You are given a special binary string s. 
//
// A move consists of choosing two consecutive, non-empty, special substrings of
// s, and swapping them. Two strings are consecutive if the last character of the 
//first string is exactly one index before the first character of the second strin
//g. 
//
// Return the lexicographically largest resulting string possible after applying
// the mentioned operations on the string. 
//
// 
// Example 1: 
//
// 
//Input: s = "11011000"
//Output: "11100100"
//Explanation: The strings "10" [occuring at s[1]] and "1100" [at s[3]] are swap
//ped.
//This is the lexicographically largest string possible after some number of swa
//ps.
// 
//
// Example 2: 
//
// 
//Input: s = "10"
//Output: "10"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 50 
// s[i] is either '0' or '1'. 
// s is a special binary string. 
// 
// Related Topics String Recursion 
// 👍 443 👎 151


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class SpecialBinaryString_761 {

    
    
    @Test
    public void testSpecialBinaryString(){
       Solution solution = new SpecialBinaryString_761()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String makeLargestSpecial(String s) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
