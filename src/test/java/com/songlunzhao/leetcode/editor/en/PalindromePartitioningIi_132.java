//Given a string s, partition s such that every
// substring of the partition is a
//palindrome. 
//
// Return the minimum cuts needed for a palindrome partitioning of s. 
//
// 
// Example 1: 
//
// 
//Input: s = "aab"
//Output: 1
//Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 
//cut.
// 
//
// Example 2: 
//
// 
//Input: s = "a"
//Output: 0
// 
//
// Example 3: 
//
// 
//Input: s = "ab"
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 2000 
// s consists of lower-case English letters only. 
// 
// Related Topics String Dynamic Programming 
// 👍 2606 👎 69


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class PalindromePartitioningIi_132 {

    
    
    @Test
    public void testPalindromePartitioningIi(){
       Solution solution = new PalindromePartitioningIi_132()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCut(String s) {
        int dp[] = new int[s.length()];
        dp[0]=0;
        for(int i=0; i<s.length();i++){

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
