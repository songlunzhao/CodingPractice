//Given an array of strings words representing an English Dictionary, return the
// longest word in words that can be built one character at a time by other words 
//in words. 
//
// If there is more than one possible answer, return the longest word with the s
//mallest lexicographical order. If there is no answer, return the empty string. 
//
// 
// Example 1: 
//
// 
//Input: words = ["w","wo","wor","worl","world"]
//Output: "world"
//Explanation: The word "world" can be built one character at a time by "w", "wo
//", "wor", and "worl".
// 
//
// Example 2: 
//
// 
//Input: words = ["a","banana","app","appl","ap","apply","apple"]
//Output: "apple"
//Explanation: Both "apply" and "apple" can be built from other words in the dic
//tionary. However, "apple" is lexicographically smaller than "apply".
// 
//
// 
// Constraints: 
//
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length <= 30 
// words[i] consists of lowercase English letters. 
// 
// Related Topics Array Hash Table String Trie Sorting 
// 👍 1021 👎 1156


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class LongestWordInDictionary_720 {

    
    
    @Test
    public void testLongestWordInDictionary(){
       Solution solution = new LongestWordInDictionary_720()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestWord(String[] words) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
