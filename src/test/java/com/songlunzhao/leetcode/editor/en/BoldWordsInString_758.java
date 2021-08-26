//Given an array of keywords words and a string s, make all appearances of all k
//eywords words[i] in s bold. Any letters between <b> and </b> tags become bold. 
//
// Return s after adding the bold tags. The returned string should use the least
// number of tags possible, and the tags should form a valid combination. 
//
// 
// Example 1: 
//
// 
//Input: words = ["ab","bc"], s = "aabcd"
//Output: "a<b>abc</b>d"
//Explanation: Note that returning "a<b>a<b>b</b>c</b>d" would use more tags, so
// it is incorrect.
// 
//
// Example 2: 
//
// 
//Input: words = ["ab","cb"], s = "aabcd"
//Output: "a<b>ab</b>cd"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 500 
// 0 <= words.length <= 50 
// 1 <= words[i].length <= 10 
// s and words[i] consist of lowercase English letters. 
// 
//
// 
// Note: This question is the same as 616: https://leetcode.com/problems/add-bol
//d-tag-in-string/ 
// Related Topics Array Hash Table String Trie String Matching 
// 👍 203 👎 106


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class BoldWordsInString_758 {

    
    
    @Test
    public void testBoldWordsInString(){
       Solution solution = new BoldWordsInString_758()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String boldWords(String[] words, String s) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
