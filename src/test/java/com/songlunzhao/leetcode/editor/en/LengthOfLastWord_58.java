//Given a string s consists of some words
// separated by spaces,
// return the length of the last word in the string.
// If the last word does not exist, return 0.
//
// A word is a maximal substring consisting of non-space characters only. 
//
// 
// Example 1: 
// Input: s = "Hello World"
//Output: 5
// Example 2: 
// Input: s = " "
//Output: 0
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 104 
// s consists of only English letters and spaces ' '. 
// 
// Related Topics String 
// 👍 1264 👎 3413


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class LengthOfLastWord_58 {

    
    
    @Test
    public void testLengthOfLastWord(){
       Solution solution = new LengthOfLastWord_58()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.trim().length()==0) return 0;
        String[] output = s.split(" ");
        if(output==null) return 0;
        return output[output.length-1].length();
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
