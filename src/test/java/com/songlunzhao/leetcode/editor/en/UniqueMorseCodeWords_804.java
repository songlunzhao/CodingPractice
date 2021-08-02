//International Morse Code defines a standard encoding where each letter is mapp
//ed to a series of dots and dashes, as follows: 
//
// 
// 'a' maps to ".-", 
// 'b' maps to "-...", 
// 'c' maps to "-.-.", and so on. 
// 
//
// For convenience, the full table for the 26 letters of the English alphabet is
// given below: 
//
// 
//[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--
//","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.
//."] 
//
// Given an array of strings words where each word can be written as a concatena
//tion of the Morse code of each letter. 
//
// 
// For example, "cab" can be written as "-.-..--...", which is the concatenation
// of "-.-.", ".-", and "-...". We will call such a concatenation the transformati
//on of a word. 
// 
//
// Return the number of different transformations among all words we have. 
//
// 
// Example 1: 
//
// 
//Input: words = ["gin","zen","gig","msg"]
//Output: 2
//Explanation: The transformation of each word is:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//There are 2 different transformations: "--...-." and "--...--.".
// 
//
// Example 2: 
//
// 
//Input: words = ["a"]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 12 
// words[i] consists of lowercase English letters. 
// 
// Related Topics Array Hash Table String 
// 👍 993 👎 890


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class UniqueMorseCodeWords_804 {

    
    
    @Test
    public void testUniqueMorseCodeWords(){
       Solution solution = new UniqueMorseCodeWords_804()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
