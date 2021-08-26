//Given a string paragraph and a string array of the banned words banned, return
// the most frequent word that is not banned. It is guaranteed there is at least o
//ne word that is not banned, and that the answer is unique. 
//
// The words in paragraph are case-insensitive and the answer should be returned
// in lowercase. 
//
// 
// Example 1: 
//
// 
//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", 
//banned = ["hit"]
//Output: "ball"
//Explanation: 
//"hit" occurs 3 times, but it is a banned word.
//"ball" occurs twice (and no other word does), so it is the most frequent non-b
//anned word in the paragraph. 
//Note that words in the paragraph are not case sensitive,
//that punctuation is ignored (even if adjacent to words, such as "ball,"), 
//and that "hit" isn't the answer even though it occurs more because it is banne
//d.
// 
//
// Example 2: 
//
// 
//Input: paragraph = "a.", banned = []
//Output: "a"
// 
//
// 
// Constraints: 
//
// 
// 1 <= paragraph.length <= 1000 
// paragraph consists of English letters, space ' ', or one of the symbols: "!?'
//,;.". 
// 0 <= banned.length <= 100 
// 1 <= banned[i].length <= 10 
// banned[i] consists of only lowercase English letters. 
// 
// Related Topics Hash Table String 
// 👍 1031 👎 2214


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MostCommonWord_819 {

    
    
    @Test
    public void testMostCommonWord(){
       Solution solution = new MostCommonWord_819()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
