//Given a string s and a dictionary of strings wordDict,
// return true if s can be
// segmented into a space-separated sequence of one or more dictionary words. 
//
// Note that the same word in the dictionary may be reused multiple times in the
// segmentation. 
//
// 
// Example 1: 
//
// 
//Input: s = "leetcode", wordDict = ["leet","code"]
//Output: true
//Explanation: Return true because "leetcode" can be segmented as "leet code".
// 
//
// Example 2: 
//
// 
//Input: s = "applepenapple", wordDict = ["apple","pen"]
//Output: true
//Explanation: Return true because "applepenapple" can be segmented as "apple pe
//n apple".
//Note that you are allowed to reuse a dictionary word.
// 
//
// Example 3: 
//
// 
//Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 300 
// 1 <= wordDict.length <= 1000 
// 1 <= wordDict[i].length <= 20 
// s and wordDict[i] consist of only lowercase English letters. 
// All the strings of wordDict are unique. 
// 
// Related Topics Hash Table String Dynamic Programming Trie Memoization 
// 👍 7439 👎 347


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class WordBreak_139 {


    @Test
    public void testWordBreak() {
        Solution solution = new WordBreak_139()
                .new Solution();
        List<String> wordDict = Arrays.asList(new String[]{"leet", "code"});
        solution.buildTrie(wordDict);
        assertEquals(solution.searchWord("leet"), true);
        assertEquals(solution.searchWord("code"), true);
        assertEquals(solution.searchWord("cod"), false);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        class Node {
            boolean endOfWord;
            Map<Character, Node> children = new HashMap<>();
        }

        Node root = new Node();

        public void buildTrie(List<String> wordDict){
            for(String word: wordDict){
                insertWord(word, root);
            }
        }
        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> dict = new HashSet<>(wordDict);
            boolean[] dp = new boolean[s.length()+1];
            dp[0] = true; //空串合法
            //定义 dp[i] 表示字符串 s 前 i 个字符组成的字符串 s[0..i-1]
            // 是否能被空格拆分成若干个字典中出现的单词
            for(int end=1;end<s.length()+1; end++){
                for(int start=0; start<end; start++){
                    dp[end]=dp[start] && dict.contains(s.substring(start, end));
                    if(dp[end]) break;
                }
            }
            return dp[s.length()];
        }

        int matchString(String s, int start, Node root){
            while(start<s.length()){
                if(root.children.containsKey(s.charAt(start))){
                    root=root.children.get(s.charAt(start));
                    start++;
                } else{
                    break;
                }
            }
            return start;

        }

        public boolean searchWord(String word) {
            return searchWord(word, root);
        }

        public boolean searchWord(String word, Node root){
            if(root.children.containsKey(word.charAt(0))){
                if(word.length()>1){
                    return searchWord(word.substring(1), root.children.get(word.charAt(0)));
                } else {
                    return root.endOfWord;
                }
            } else {
                return false;
            }
        }

        private void insertWord(String word, Node node){
            Node child;
            if(!node.children.containsKey(word.charAt(0))){
                child=new Node();
                node.children.put(word.charAt(0), child);
            } else {
                child=node.children.get(word.charAt(0));
            }

            if(word.length()>1){
                insertWord(word.substring(1), child);
            } else {
                node.endOfWord=true;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
