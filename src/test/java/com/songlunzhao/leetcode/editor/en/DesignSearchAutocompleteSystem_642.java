//Design a search autocomplete system for a search engine. Users may input a sen
//tence (at least one word and end with a special character '#'). 
//
// You are given a string array sentences and an integer array times both of len
//gth n where sentences[i] is a previously typed sentence and times[i] is the corr
//esponding number of times the sentence was typed. For each input character excep
//t '#', return the top 3 historical hot sentences that have the same prefix as th
//e part of the sentence already typed. 
//
// Here are the specific rules: 
//
// 
// The hot degree for a sentence is defined as the number of times a user typed 
//the exactly same sentence before. 
// The returned top 3 hot sentences should be sorted by hot degree (The first is
// the hottest one). If several sentences have the same hot degree, use ASCII-code
// order (smaller one appears first). 
// If less than 3 hot sentences exist, return as many as you can. 
// When the input is a special character, it means the sentence ends, and in thi
//s case, you need to return an empty list. 
// 
//
// Implement the AutocompleteSystem class: 
//
// 
// AutocompleteSystem(String[] sentences, int[] times) Initializes the object wi
//th the sentences and times arrays. 
// List<String> input(char c) This indicates that the user typed the character c
//.
// 
// Returns an empty array [] if c == '#' and stores the inputted sentence in the
// system. 
// Returns the top 3 historical hot sentences that have the same prefix as the p
//art of the sentence already typed. If there are fewer than 3 matches, return the
//m all. 
// 
// 
// 
//
// 
// Example 1: 
//
// 
//Input
//["AutocompleteSystem", "input", "input", "input", "input"]
//[[["i love you", "island", "iroman", "i love leetcode"], [5, 3, 2, 2]], ["i"],
// [" "], ["a"], ["#"]]
//Output
//[null, ["i love you", "island", "i love leetcode"], ["i love you", "i love lee
//tcode"], [], []]
//
//Explanation
//AutocompleteSystem obj = new AutocompleteSystem(["i love you", "island", "irom
//an", "i love leetcode"], [5, 3, 2, 2]);
//obj.input("i"); // return ["i love you", "island", "i love leetcode"]. There a
//re four sentences that have prefix "i". Among them, "ironman" and "i love leetco
//de" have same hot degree. Since ' ' has ASCII code 32 and 'r' has ASCII code 114
//, "i love leetcode" should be in front of "ironman". Also we only need to output
// top 3 hot sentences, so "ironman" will be ignored.
//obj.input(" "); // return ["i love you", "i love leetcode"]. There are only tw
//o sentences that have prefix "i ".
//obj.input("a"); // return []. There are no sentences that have prefix "i a".
//obj.input("#"); // return []. The user finished the input, the sentence "i a" 
//should be saved as a historical sentence in system. And the following input will
// be counted as a new search.
// 
//
// 
// Constraints: 
//
// 
// n == sentences.length 
// n == times.length 
// 1 <= n <= 100 
// 1 <= sentences[i].length <= 100 
// 1 <= times[i] <= 50 
// c is a lowercase English letter, a hash '#', or space ' '. 
// Each tested sentence will be a sequence of characters c that end with the cha
//racter '#'. 
// Each tested sentence will have a length in the range [1, 200]. 
// The words in each input sentence are separated by single spaces. 
// At most 5000 calls will be made to input. 
// 
// Related Topics String Design Trie Data Stream 
// 👍 1426 👎 96


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.List;

public class DesignSearchAutocompleteSystem_642 {

    
    
    @Test
    public void testDesignSearchAutocompleteSystem(){
        AutocompleteSystem solution = new DesignSearchAutocompleteSystem_642()
                        .new AutocompleteSystem(null,null);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class AutocompleteSystem {

    public AutocompleteSystem(String[] sentences, int[] times) {
        
    }
    
    public List<String> input(char c) {
        return null;
    }
}

/**
 * Your AutocompleteSystem object will be instantiated and called as such:
 * AutocompleteSystem obj = new AutocompleteSystem(sentences, times);
 * List<String> param_1 = obj.input(c);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
