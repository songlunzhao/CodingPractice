//A transformation sequence from word beginWord to
// word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:
// 
//
// 
// Every adjacent pair of words differs by a single letter. 
// Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to
// be in wordList. 
// sk == endWord 
// 
//
// Given two words, beginWord and endWord, and a dictionary wordList, return all
// the shortest transformation sequences from beginWord to endWord, or an empty li
//st if no such sequence exists. Each sequence should be returned as a list of the
// words [beginWord, s1, s2, ..., sk]. 
//
// 
// Example 1: 
//
// 
//Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot"
//,"log","cog"]
//Output: [["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
//Explanation: There are 2 shortest transformation sequences:
//"hit" -> "hot" -> "dot" -> "dog" -> "cog"
//"hit" -> "hot" -> "lot" -> "log" -> "cog"
// 
//
// Example 2: 
//
// 
//Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot"
//,"log"]
//Output: []
//Explanation: The endWord "cog" is not in wordList, therefore there is no valid
// transformation sequence.
// 
//
// 
// Constraints: 
//
// 
// 1 <= beginWord.length <= 5 
// endWord.length == beginWord.length 
// 1 <= wordList.length <= 1000 
// wordList[i].length == beginWord.length 
// beginWord, endWord, and wordList[i] consist of lowercase English letters. 
// beginWord != endWord 
// All the words in wordList are unique. 
// 
// Related Topics Hash Table String Backtracking Breadth-First Search 
// 👍 2977 👎 312


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class WordLadderIi_126 {

    
    
    @Test
    public void testWordLadderIi(){
       Solution solution = new WordLadderIi_126()
                        .new Solution();
       List<String> words = Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"});
       List<List<String>> output = solution.findLadders("hit","cog", words);
        PrintUtils.print2DStringList(output);

        words = Arrays.asList(new String[]{"ted","tex","red","tax","tad","den","rex","pee"});
        output = solution.findLadders("red","tax", words);
        PrintUtils.print2DStringList(output);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        if(beginWord.equals(endWord)||!dict.contains(endWord))
            return ans;
        dict.remove(beginWord);
        //use BFS to build a tree
        //key-child, values-parents
        Map<String, Set<String>> from = new HashMap<>();
        //key-word, value - level
        Map<String, Integer> wordLevelMap = new HashMap<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        wordLevelMap.put(beginWord,0);
        queue.add(beginWord);
        visited.add(beginWord);

        int level=1;
        boolean found = false;
        while(true){
            Queue<String> levelQueue = new LinkedList<>();
            while(!queue.isEmpty()){
                String word = queue.poll();
                for(String s: dict){
                    if(!visited.contains(s) && isChangeable(word, s)){
                        wordLevelMap.put(s,level);
                        levelQueue.add(s);
                        if(from.containsKey(s)){
                            from.get(s).add(word);
                        } else {
                            Set<String> list = new HashSet<>();
                            list.add(word);
                            from.put(s,list);
                        }
                        if(s.equals(endWord)){
                            found=true;
                        }
                    }
                }
            }
            if(found || levelQueue.isEmpty()) break;
            visited.addAll(levelQueue);
            queue=levelQueue;
            level++;

        }

        if(!found) return ans;

        List<String> result = new ArrayList<>();
        result.add(endWord);
        dfs(ans,endWord,beginWord, from, wordLevelMap, result, level-1);
        List<List<String>> ret = new ArrayList<>();
        for(List<String> s: ans){
            List<String> tmp = new ArrayList<>();
            for(int i= s.size()-1; i>=0; i--){
                tmp.add(s.get(i));
            }
            ret.add(tmp);
        }
        return ret;
    }

    void dfs(List<List<String>> ans, String endWord, String beginWord,
             Map<String, Set<String>> from, Map<String, Integer> wordLevelMap,
             List<String> result, int level){
        if(endWord.equals(beginWord)){
            List<String> tmp = new ArrayList<>(result);
            ans.add(tmp);
        } else {
            for(String s: from.get(endWord)){
                if(wordLevelMap.get(s)==level){
                    result.add(s);
                    dfs(ans,s,beginWord,from,wordLevelMap,result,level-1);
                }
            }
        }
        result.remove(result.size()-1);

    }
    boolean isChangeable(String originWord, String newWord){
        if(originWord.length()!=newWord.length()) return false;
        int diff = 0;
        for(int i=0; i<originWord.length(); i++){
            if(originWord.charAt(i)!=newWord.charAt(i)){
                diff++;
                if(diff>1) return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
