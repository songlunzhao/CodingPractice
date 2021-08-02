//Given an array of strings words (without duplicates), return
// all the concatenated words in the given list of words.
//
// A concatenated word is defined as a string that is comprised entirely of at l
//east two shorter words in the given array. 
//
// 
// Example 1: 
//
// 
//Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses"
//,"rat","ratcatdogcat"]
//Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
//Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
//"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
//"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat". 
//
// Example 2: 
//
// 
//Input: words = ["cat","dog","catdog"]
//Output: ["catdog"]
// 
//
// 
// Constraints: 
//
// 
// 1 <= words.length <= 104 
// 0 <= words[i].length <= 1000 
// words[i] consists of only lowercase English letters. 
// 0 <= sum(words[i].length) <= 105 
// 
// Related Topics String Dynamic Programming Depth-First Search Trie 
// 👍 1366 👎 163


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatenatedWords_472 {

    
    
    @Test
    public void testConcatenatedWords(){
       Solution solution = new ConcatenatedWords_472()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordDict = new HashSet<>(Arrays.asList(words));

    }

    boolean matchWord(String word, Set<String> wordDict) {
        boolean[] dp = new boolean[wordDict.size()+1];
        for(int end=1; end<word.length()+1; end++){
            
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
