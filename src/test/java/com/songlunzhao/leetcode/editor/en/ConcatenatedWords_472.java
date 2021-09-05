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
               "cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"
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
            Arrays.sort(words, Comparator.comparingInt(w->w.length()));
            for(String word:words){
                if(word.equals("")) continue;
                if(isConcatenatedWord(word, root)){
                    result.add(word);
                }
                addToTrie(word,root);
            }
            return result;
        }

        boolean isConcatenatedWord(String word, TrieNode root){
            //-1 not checked, 1 isWord, 0 notWord
            //the Trie root is a dummy node, so the depth of trie is length +1
            //the array saved if a word start on idx i is a word in dict
            int[]isWord = new int[word.length()+1];
            Arrays.fill(isWord,-1);
            return dfs(word, isWord, root, 0);
        }

        boolean dfs(String word, int[] isWord, TrieNode root, int begIdx){
            if(isWord[begIdx]!=-1) return isWord[begIdx]==1; //already checked
            if(begIdx==word.length()) return true; //reached the end of word

            TrieNode cur = root;
            for(int i=begIdx; i<word.length(); i++){
                Character c = word.charAt(i);
                if(!cur.children.containsKey(c)){
                    isWord[begIdx]=0;
                    return false;
                }
                cur=cur.children.get(c);
                if(cur.isWord) {
                    //find one word, check 2nd word
                    if(dfs(word, isWord, root, i+1)){
                        isWord[begIdx]=1;
                        return true;
                    }
                }
            }
            isWord[begIdx]=0;
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

}
//leetcode submit region end(Prohibit modification and deletion)

}
