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

import java.util.*;

public class ConcatenatedWords_472 {

    
    
    @Test
    public void testConcatenatedWords(){
       Solution solution = new ConcatenatedWords_472()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        class TrieNode {
            HashMap<Character, TrieNode> children =
                    new HashMap<Character, TrieNode>();
            String word = null; // not null means this is the word end node
            public TrieNode() {}
        }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordDict = new HashSet<>(Arrays.asList(words));
        Arrays.sort(words);
        List<String> ans = new ArrayList<>();
        for(int i=0; i< words.length; i++){
            if(matchWord(words[i], wordDict)){
                ans.add(words[i]);
            }
        }
        return ans;

    }

    boolean matchWord(String word, Set<String> wordDict) {
        String prefix, suffix;
        for(int i=1; i<word.length(); i++){
            prefix = word.substring(0,i);
            if(!wordDict.contains(prefix)) continue;
            suffix=word.substring(i);
            if(wordDict.contains(suffix)||matchWord(suffix,wordDict)){
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
