//Given a rows x cols screen and a sentence represented as a list of strings, re
//turn the number of times the given sentence can be fitted on the screen. 
//
// The order of words in the sentence must remain unchanged, and a word cannot b
//e split into two lines. A single space must separate two consecutive words in a 
//line. 
//
// 
// Example 1: 
//
// 
//Input: sentence = ["hello","world"], rows = 2, cols = 8
//Output: 1
//Explanation:
//hello---
//world---
//The character '-' signifies an empty space on the screen.
// 
//
// Example 2: 
//
// 
//Input: sentence = ["a", "bcd", "e"], rows = 3, cols = 6
//Output: 2
//Explanation:
//a-bcd- 
//e-a---
//bcd-e-
//The character '-' signifies an empty space on the screen.
// 
//
// Example 3: 
//
// 
//Input: sentence = ["i","had","apple","pie"], rows = 4, cols = 5
//Output: 1
//Explanation:
//i-had
//apple
//pie-i
//had--
//The character '-' signifies an empty space on the screen.
// 
//
// 
// Constraints: 
//
// 
// 1 <= sentence.length <= 100 
// 1 <= sentence[i].length <= 10 
// sentence[i] consists of lowercase English letters. 
// 1 <= rows, cols <= 2 * 104 
// 
// Related Topics String Dynamic Programming 
// 👍 646 👎 313


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class SentenceScreenFitting_418 {

    
    
    @Test
    public void testSentenceScreenFitting(){
       Solution solution = new SentenceScreenFitting_418()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
