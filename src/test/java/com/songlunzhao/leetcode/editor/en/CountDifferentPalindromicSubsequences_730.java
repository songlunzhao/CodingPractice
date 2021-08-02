//Given a string s, return the number of different non-empty palindromic subsequ
//ences in s. Since the answer may be very large, return it modulo 109 + 7. 
//
// A subsequence of a string is obtained by deleting zero or more characters fro
//m the string. 
//
// A sequence is palindromic if it is equal to the sequence reversed. 
//
// Two sequences a1, a2, ... and b1, b2, ... are different if there is some i fo
//r which ai != bi. 
//
// 
// Example 1: 
//
// 
//Input: s = "bccb"
//Output: 6
//Explanation: The 6 different non-empty palindromic subsequences are 'b', 'c', 
//'bb', 'cc', 'bcb', 'bccb'.
//Note that 'bcb' is counted only once, even though it occurs twice.
// 
//
// Example 2: 
//
// 
//Input: s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"
//Output: 104860361
//Explanation: There are 3104860382 different non-empty palindromic subsequences
//, which is 104860361 modulo 109 + 7.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s[i] is either 'a', 'b', 'c', or 'd'. 
// 
// Related Topics String Dynamic Programming 
// 👍 924 👎 54


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class CountDifferentPalindromicSubsequences_730 {

    
    
    @Test
    public void testCountDifferentPalindromicSubsequences(){
       Solution solution = new CountDifferentPalindromicSubsequences_730()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPalindromicSubsequences(String s) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
