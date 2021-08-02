//Given an m x n board of characters and a list of strings words, return all wor
//ds on the board. 
//
// Each word must be constructed from letters of sequentially adjacent cells, wh
//ere adjacent cells are horizontally or vertically neighboring. The same letter c
//ell may not be used more than once in a word. 
//
// 
// Example 1: 
//
// 
//Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f"
//,"l","v"]], words = ["oath","pea","eat","rain"]
//Output: ["eat","oath"]
// 
//
// Example 2: 
//
// 
//Input: board = [["a","b"],["c","d"]], words = ["abcb"]
//Output: []
// 
//
// 
// Constraints: 
//
// 
// m == board.length 
// n == board[i].length 
// 1 <= m, n <= 12 
// board[i][j] is a lowercase English letter. 
// 1 <= words.length <= 3 * 104 
// 1 <= words[i].length <= 10 
// words[i] consists of lowercase English letters. 
// All the strings of words are unique. 
// 
// Related Topics Array String Backtracking Trie Matrix 
// 👍 4161 👎 152


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class WordSearchIi_212 {

    
    
    @Test
    public void testWordSearchIi(){
       Solution solution = new WordSearchIi_212()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
