//Given a string s and an array of strings words, return the number of words[i] 
//that is a subsequence of s. 
//
// A subsequence of a string is a new string generated from the original string 
//with some characters (can be none) deleted without changing the relative order o
//f the remaining characters. 
//
// 
// For example, "ace" is a subsequence of "abcde". 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "abcde", words = ["a","bb","acd","ace"]
//Output: 3
//Explanation: There are three strings in words that are a subsequence of s: "a"
//, "acd", "ace".
// 
//
// Example 2: 
//
// 
//Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 5 * 104 
// 1 <= words.length <= 5000 
// 1 <= words[i].length <= 50 
// s and words[i] consist of only lowercase English letters. 
// 
// Related Topics Hash Table String Trie Sorting 
// 👍 2030 👎 117


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class NumberOfMatchingSubsequences_792 {

    
    
    @Test
    public void testNumberOfMatchingSubsequences(){
       Solution solution = new NumberOfMatchingSubsequences_792()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
