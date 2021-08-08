//A transformation sequence from word beginWord to
// word endWord using a dictionary wordList is a
// sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:
// 
//
// 
// Every adjacent pair of words differs by a single letter. 
// Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to
// be in wordList. 
// sk == endWord 
// 
//
// Given two words, beginWord and endWord, and a dictionary wordList, return the
// number of words in the shortest transformation sequence from beginWord to endWo
//rd, or 0 if no such sequence exists. 
//
// 
// Example 1: 
//
// 
//Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot"
//,"log","cog"]
//Output: 5
//Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -
//> "dog" -> cog", which is 5 words long.
// 
//
// Example 2: 
//
// 
//Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot"
//,"log"]
//Output: 0
//Explanation: The endWord "cog" is not in wordList, therefore there is no valid
// transformation sequence.
// 
//
// 
// Constraints: 
//
// 
// 1 <= beginWord.length <= 10 
// endWord.length == beginWord.length 
// 1 <= wordList.length <= 5000 
// wordList[i].length == beginWord.length 
// beginWord, endWord, and wordList[i] consist of lowercase English letters. 
// beginWord != endWord 
// All the words in wordList are unique. 
// 
// Related Topics Hash Table String Breadth-First Search 
// 👍 5627 👎 1468


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.*;

public class WordLadder_127 {

    
    
    @Test
    public void testWordLadder(){
       Solution solution = new WordLadder_127()
                        .new Solution();
       List<String> wordList = Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"});
        solution.ladderLength("hit","cog", wordList);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        class Node {
            String word;
            int level;
            Node(String word, int level){
                this.word=word;
                this.level=level;
            }
        }
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(beginWord, 1));
            Set<String> wordSet = new HashSet<>(wordList);
            while(!queue.isEmpty()){
                Node top = queue.poll();
                if(endWord.equals(top.word)) return top.level;

                Iterator<String> iterator = wordSet.iterator();
                while (iterator.hasNext()) {
                    String element = iterator.next();
                    if(element.equals(top.word)){
                        iterator.remove();
                        continue;
                    }
                    if (isChild(top.word, element)) {
                        queue.add(new Node(element, top.level+1));
                        iterator.remove();
                    }
                }
            }
            return 0;
        }

        public boolean isChild(String word1, String word2){
            //check if word2 is child of word1

            if(word1.length()!=word2.length()){
                return false;
            }
            int j=0;
            for(int i=0; i<word1.length(); i++){
                if(word1.charAt(i)!=word2.charAt(i)){
                    j++;
                    if(j>1){
                        return false;
                    }
                }
            }
            return j<=1;

        }


}
//leetcode submit region end(Prohibit modification and deletion)

}
