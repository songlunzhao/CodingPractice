//We can represent a sentence as an array of words, for example, the sentence "I
// am happy with leetcode" can be represented as arr = ["I","am",happy","with","le
//etcode"]. 
//
// Given two sentences sentence1 and sentence2 each represented as a string arra
//y and given an array of string pairs similarPairs where similarPairs[i] = [xi, y
//i] indicates that the two words xi and yi are similar. 
//
// Return true if sentence1 and sentence2 are similar, or false if they are not 
//similar. 
//
// Two sentences are similar if: 
//
// 
// They have the same length (i.e., the same number of words) 
// sentence1[i] and sentence2[i] are similar. 
// 
//
// Notice that a word is always similar to itself, also notice that the similari
//ty relation is transitive. For example, if the words a and b are similar, and th
//e words b and c are similar, then a and c are similar. 
//
// 
// Example 1: 
//
// 
//Input: sentence1 = ["great","acting","skills"], sentence2 = ["fine","drama","t
//alent"], similarPairs = [["great","good"],["fine","good"],["drama","acting"],["s
//kills","talent"]]
//Output: true
//Explanation: The two sentences have the same length and each word i of sentenc
//e1 is also similar to the corresponding word in sentence2.
// 
//
// Example 2: 
//
// 
//Input: sentence1 = ["I","love","leetcode"], sentence2 = ["I","love","onepiece"
//], similarPairs = [["manga","onepiece"],["platform","anime"],["leetcode","platfo
//rm"],["anime","manga"]]
//Output: true
//Explanation: "leetcode" --> "platform" --> "anime" --> "manga" --> "onepiece".
//
//Since "leetcode is similar to "onepiece" and the first two words are the same,
// the two sentences are similar. 
//
// Example 3: 
//
// 
//Input: sentence1 = ["I","love","leetcode"], sentence2 = ["I","love","onepiece"
//], similarPairs = [["manga","hunterXhunter"],["platform","anime"],["leetcode","p
//latform"],["anime","manga"]]
//Output: false
//Explanation: "leetcode" is not similar to "onepiece".
// 
//
// 
// Constraints: 
//
// 
// 1 <= sentence1.length, sentence2.length <= 1000 
// 1 <= sentence1[i].length, sentence2[i].length <= 20 
// sentence1[i] and sentence2[i] consist of lower-case and upper-case English le
//tters. 
// 0 <= similarPairs.length <= 2000 
// similarPairs[i].length == 2 
// 1 <= xi.length, yi.length <= 20 
// xi and yi consist of English letters. 
// 
// Related Topics Array Hash Table String Depth-First Search Breadth-First Searc
//h Union Find 
// 👍 622 👎 39


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.List;

public class SentenceSimilarityIi_737 {

    
    
    @Test
    public void testSentenceSimilarityIi(){
       Solution solution = new SentenceSimilarityIi_737()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean areSentencesSimilarTwo(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
