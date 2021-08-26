//You are given a string sentence that consist of words separated by spaces. Eac
//h word consists of lowercase and uppercase letters only. 
//
// We would like to convert the sentence to "Goat Latin" (a made-up language sim
//ilar to Pig Latin.) The rules of Goat Latin are as follows: 
//
// 
// If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to th
//e end of the word.
//
// 
// For example, the word "apple" becomes "applema". 
// 
// 
// If a word begins with a consonant (i.e., not a vowel), remove the first lette
//r and append it to the end, then add "ma".
// 
// For example, the word "goat" becomes "oatgma". 
// 
// 
// Add one letter 'a' to the end of each word per its word index in the sentence
//, starting with 1.
// 
// For example, the first word gets "a" added to the end, the second word gets "
//aa" added to the end, and so on. 
// 
// 
// 
//
// Return the final sentence representing the conversion from sentence to Goat L
//atin. 
//
// 
// Example 1: 
// Input: sentence = "I speak Goat Latin"
//Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
// Example 2: 
// Input: sentence = "The quick brown fox jumped over the lazy dog"
//Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetm
//aaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
// 
// 
// Constraints: 
//
// 
// 1 <= sentence.length <= 150 
// sentence consists of English letters and spaces. 
// sentence has no leading or trailing spaces. 
// All the words in sentence are separated by a single space. 
// 
// Related Topics String 
// 👍 562 👎 985


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class GoatLatin_824 {

    
    
    @Test
    public void testGoatLatin(){
       Solution solution = new GoatLatin_824()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toGoatLatin(String sentence) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
