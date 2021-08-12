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
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class ConcatenatedWords_472 {

    
    
    @Test
    public void testConcatenatedWords(){
       Solution solution = new ConcatenatedWords_472()
                        .new Solution();

       String[] dict = new String[]{
               "dogcat","cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"
       };
       List<String> ans = solution.findAllConcatenatedWordsInADict(dict);
        PrintUtils.printStringList(ans);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        class TrieNode {
            HashMap<Character, TrieNode> children =
                    new HashMap<>();
            String word = null; // not null means this is not the word end node
            boolean isWord = false;
            public TrieNode() {}
        }

        /**
         * Trie solution
         * @param words
         * @return
         */
        public List<String> findAllConcatenatedWordsInADict(String[] words) {
            List<String> result = new ArrayList<>();
            //construct trie
            TrieNode root = new TrieNode();
            root.children = new HashMap<>();
            for(String word:words){
                addToTrie(word,root);
            }
            for(String word:words){
                if(find2WordsInTrie(word, 0, 0, root)){
                    result.add(word);
                }
            }
            return result;
        }

    public List<String> findAllConcatenatedWordsInADict_DPSolution(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> preWords = new HashSet<>();
        Arrays.sort(words, new Comparator<String>() {
            public int compare (String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        for (int i = 0; i < words.length; i++) {
            if (matchWord(words[i], preWords)) {
                result.add(words[i]);
            }
            preWords.add(words[i]);
        }

        return result;

    }

        /**
         * wordCount -- how many words found before calling this method
         * @param word
         * @param beginIdx
         * @param wordCount
         * @param root
         * @return
         */
    private boolean find2WordsInTrie(String word, int beginIdx, int wordCount, TrieNode root){
        TrieNode current = root;
        for(int i=beginIdx; i<word.length();i++){
                if(!current.children.containsKey(word.charAt(i))) return false;
                TrieNode node = current.children.get(word.charAt(i));
                if(node.isWord){
                    if(i==word.length()-1){
                        return wordCount+1>=2; //find word cconcatenated by at lest 2 word
                    }
                    if(find2WordsInTrie(word,i+1, wordCount+1, root))
                        return true;
                }
                current=node;
            }
            return false;
    }
    private void addToTrie(String word, TrieNode root) {
        if(word==null || word.length()==0) return;
        for(int i=0; i<word.length(); i++){
            if(!root.children.containsKey(word.charAt(i))){
                TrieNode node = new TrieNode();
                node.children = new HashMap<>();
                root.children.put(word.charAt(i), node);
            }
            root=root.children.get(word.charAt(i));
        }
        root.isWord=true;
    }

    boolean matchWord(String word, Set<String> dict) {
        if (dict.isEmpty()) return false;
        boolean[] dp = new boolean[word.length() + 1];
        //dp[i]==true means string ends at index i is good
        dp[0] = true;
        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (!dp[j]) continue;
                if (dict.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[word.length()];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
