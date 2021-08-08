//Given a string licensePlate and an array of strings words, find the shortest c
//ompleting word in words. 
//
// A completing word is a word that contains all the letters in licensePlate. Ig
//nore numbers and spaces in licensePlate, and treat letters as case insensitive. 
//If a letter appears more than once in licensePlate, then it must appear in the w
//ord the same number of times or more. 
//
// For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (
//ignoring case), and 'c' twice. Possible completing words are "abccdef", "caaacab
//", and "cbca". 
//
// Return the shortest completing word in words. It is guaranteed an answer exis
//ts. If there are multiple shortest completing words, return the first one that o
//ccurs in words. 
//
// 
// Example 1: 
//
// 
//Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
//Output: "steps"
//Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 
//'t'.
//"step" contains 't' and 'p', but only contains 1 's'.
//"steps" contains 't', 'p', and both 's' characters.
//"stripe" is missing an 's'.
//"stepple" is missing an 's'.
//Since "steps" is the only word containing all the letters, that is the answer.
//
// 
//
// Example 2: 
//
// 
//Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
//Output: "pest"
//Explanation: licensePlate only contains the letter 's'. All the words contain 
//'s', but among these "pest", "stew", and "show" are shortest. The answer is "pes
//t" because it is the word that appears earliest of the 3.
// 
//
// Example 3: 
//
// 
//Input: licensePlate = "Ah71752", words = ["suggest","letter","of","husband","e
//asy","education","drug","prevent","writer","old"]
//Output: "husband"
// 
//
// Example 4: 
//
// 
//Input: licensePlate = "OgEu755", words = ["enough","these","play","wide","wond
//er","box","arrive","money","tax","thus"]
//Output: "enough"
// 
//
// Example 5: 
//
// 
//Input: licensePlate = "iMSlpe4", words = ["claim","consumer","student","camera
//","public","never","wonder","simple","thought","use"]
//Output: "simple"
// 
//
// 
// Constraints: 
//
// 
// 1 <= licensePlate.length <= 7 
// licensePlate contains digits, letters (uppercase or lowercase), or space ' '.
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length <= 15 
// words[i] consists of lower case English letters. 
// 
// Related Topics Hash Table String 
// 👍 249 👎 756


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ShortestCompletingWord_748 {

    
    
    @Test
    public void testShortestCompletingWord(){
       Solution solution = new ShortestCompletingWord_748()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}