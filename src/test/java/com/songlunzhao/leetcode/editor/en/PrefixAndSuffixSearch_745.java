//Design a special dictionary with some words that searchs the words in it by a 
//prefix and a suffix. 
//
// Implement the WordFilter class: 
//
// 
// WordFilter(string[] words) Initializes the object with the words in the dicti
//onary. 
// f(string prefix, string suffix) Returns the index of the word in the dictiona
//ry, which has the prefix prefix and the suffix suffix. If there is more than one
// valid index, return the largest of them. If there is no such word in the dictio
//nary, return -1. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["WordFilter", "f"]
//[[["apple"]], ["a", "e"]]
//Output
//[null, 0]
//
//Explanation
//WordFilter wordFilter = new WordFilter(["apple"]);
//wordFilter.f("a", "e"); // return 0, because the word at index 0 has prefix = 
//"a" and suffix = 'e".
// 
//
// 
// Constraints: 
//
// 
// 1 <= words.length <= 15000 
// 1 <= words[i].length <= 10 
// 1 <= prefix.length, suffix.length <= 10 
// words[i], prefix and suffix consist of lower-case English letters only. 
// At most 15000 calls will be made to the function f. 
// 
// Related Topics String Design Trie 
// 👍 801 👎 297


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class PrefixAndSuffixSearch_745 {

    
    
    @Test
    public void testPrefixAndSuffixSearch(){
        WordFilter solution = new PrefixAndSuffixSearch_745()
                        .new WordFilter(null);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class WordFilter {

    public WordFilter(String[] words) {
        
    }
    
    public int f(String prefix, String suffix) {
        return 1;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
