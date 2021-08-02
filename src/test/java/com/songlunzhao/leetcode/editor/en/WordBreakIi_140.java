//Given a string s and a dictionary of strings wordDict, add spaces in s to cons
//truct a sentence where each word is a valid dictionary word. Return all such pos
//sible sentences in any order. 
//
// Note that the same word in the dictionary may be reused multiple times in the
// segmentation. 
//
// 
// Example 1: 
//
// 
//Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
//Output: ["cats and dog","cat sand dog"]
// 
//
// Example 2: 
//
// 
//Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","p
//ineapple"]
//Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
//Explanation: Note that you are allowed to reuse a dictionary word.
// 
//
// Example 3: 
//
// 
//Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
//Output: []
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 20 
// 1 <= wordDict.length <= 1000 
// 1 <= wordDict[i].length <= 10 
// s and wordDict[i] consist of only lowercase English letters. 
// All the strings of wordDict are unique. 
// 
// Related Topics Hash Table String Dynamic Programming Backtracking Trie Memoiz
//ation 
// 👍 3563 👎 449


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class WordBreakIi_140 {

    
    
    @Test
    public void testWordBreakIi(){
       Solution solution = new WordBreakIi_140()
                        .new Solution();
       String s = "catsanddog";
       List<String> dict = Arrays.asList(new String[]{"cat","cats","and","sand","dog"});
       List<String> ans =solution.wordBreak(s,dict);
       PrintUtils.printStringList(ans);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        //ans.get(i) stores the sentences which the end index is i
        Map<Integer,List<String>>ans= new HashMap<>();
        ans.put(0,new ArrayList<>());
        ans.get(0).add("");
        //定义 dp[i] 表示字符串 s 前 i 个字符组成的字符串 s[0..i-1]
        // 是否能被空格拆分成若干个字典中出现的单词
        for(int end=1;end<s.length()+1; end++){
           // for(int start=end-1; start>=0; start--){
            for(int start=0; start<end; start++){
                String word = s.substring(start,end);
                if(dict.contains(word)){
                    List<String> sentenceEndAtStart = ans.get(start);
                    if(sentenceEndAtStart!=null && !sentenceEndAtStart.isEmpty()){
                        //cut a word from start to end,
                        // check if we have sentence ended at index start,
                        // if there is one that means this end is a valid one
                        if(!ans.containsKey(end)){
                            ans.put(end, new ArrayList<>());
                        }
                        List<String> wordBreakEnd = ans.get(end);
                        for(String sentence: sentenceEndAtStart){
                            String newSentence = sentence.equals("")?
                                    word:sentence+" "+word;
                            wordBreakEnd.add(newSentence);
                        }

                    }

                }
            }
        }
        return ans.get(s.length())==null?new ArrayList<>():ans.get(s.length());
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}
