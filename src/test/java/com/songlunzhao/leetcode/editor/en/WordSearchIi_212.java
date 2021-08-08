//Given an m x n board of characters and a list of strings words,
// return all words on the board.
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

import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class WordSearchIi_212 {


    @Test
    public void testWordSearchIi() {
        Solution solution = new WordSearchIi_212()
                .new Solution();
        char[][] board = new char[][]{
                {'o' , 'a' , 'a' , 'n'},
                {'e' , 't' , 'a' , 'e'},
                {'i' , 'h' , 'k' , 'r'},
                {'i' , 'f' , 'l' , 'v'}};
        String[] words = new String[]{"oath", "pea", "eat", "rain",
                "oathk","oathf","oate","oathii","oathfi","oathfii"};
        List<String> ans = solution.findWords(board, words);
        board = new char[][]{
                {'a','b'},
                {'a','a'}
        };
        words=new String[]{"aba","baa","bab","aaab","aaa","aaaa","aaba"};
        ans = solution.findWords(board, words);
        PrintUtils.printStringList(ans);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        class TrieNode {
            HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
            String word = null; // not null means this is the word end node
            public TrieNode() {}
        }

        public List<String> findWords(char[][] board, String[] words) {
            List<String> ans = new ArrayList<>();
            int[][] dirs = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
            boolean[][] visited = new boolean[board.length][board[0].length];


            // Step 1). Construct the Trie
            TrieNode root = new TrieNode();
            for (String word : words) {
                TrieNode node = root;

                for (Character letter : word.toCharArray()) {
                    if (node.children.containsKey(letter)) {
                        node = node.children.get(letter);
                    } else {
                        TrieNode newNode = new TrieNode();
                        node.children.put(letter, newNode);
                        node = newNode;
                    }
                }
                node.word = word;  // store words in Trie
            }

            for (int row = 0; row < board.length; ++row) {
                for (int col = 0; col < board[row].length; ++col) {
                    if (root.children.containsKey(board[row][col])) {
                        backTrack(board, row, col, visited, root, ans);
                    }
                }
            }

            Set<String> wordSet = new HashSet<>(ans);
            return new ArrayList<>(wordSet);

        }

        private void backTrack(char[][]board, int row, int col, boolean[][]visited,
                               TrieNode parent, List<String> ans) {
            Character letter = board[row][col];
            if(!parent.children.containsKey(letter)) return;
            TrieNode currentNode = parent.children.get(letter);

            if(currentNode.word!=null){
                //find match
                ans.add(currentNode.word);
            }
            visited[row][col]=true;

            int[][] dirs = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow < 0 || newRow >= board.length
                        || newCol < 0 || newCol >= board[0].length
                        || visited[newRow][newCol])
                    continue;
                backTrack(board, newRow, newCol, visited, currentNode, ans);
            }
            visited[row][col]=false;
            if (currentNode.children.isEmpty()) {
                parent.children.remove(letter);
            }

        }


            /**
             * backtrack plus hashmap
             * @param board
             * @param words
             * @return
             */
        public List<String> findWords_oldmethod(char[][] board, String[] words) {
            List<String> ans = new ArrayList<>();
            Set<String> wordSet = new HashSet<>(Arrays.asList(words));
            int[][] dirs = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
            boolean[][] visited = new boolean[board.length][board[0].length];

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    sb.append(board[i][j]);
                    visited[i][j] = true;
                    String word = sb.toString();
                    if (wordSet.contains(word)) {
                        ans.add(word);
                        wordSet.remove(word);
                    } else {
                        for (int[] dir : dirs) {
                            int newRow = i + dir[0];
                            int newCol = j + dir[1];
                            if (newRow < 0 || newRow >= board.length
                                    || newCol < 0 || newCol >= board[0].length
                                    || visited[newRow][newCol])
                                continue;
                            visited[newRow][newCol] = true;
                            backTrack(board, sb, visited, dirs, newRow, newCol, wordSet, ans);
                            visited[newRow][newCol] = false;
                        }
                    }
                    visited[i][j] = false;
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            return ans;
        }

        private void backTrack(char[][] board, StringBuilder sb, boolean[][] visited, int[][] dirs, int row, int col, Set<String> words, List<String> ans) {
            if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || words.isEmpty()) {
                return;
            }
            sb.append(board[row][col]);
            String word = sb.toString();
            //instead of using hashMap, we could use Trie and backtrack to solve the problem
            if (words.contains(word)) {
                ans.add(word);
                words.remove(word);
            }
            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow < 0 || newRow >= board.length
                        || newCol < 0 || newCol >= board[0].length
                        || visited[newRow][newCol])
                    continue;
                visited[newRow][newCol] = true;
                backTrack(board, sb, visited, dirs, row + dir[0], col + dir[1], words, ans);
                visited[newRow][newCol] = false;
            }
            sb.deleteCharAt(sb.length() - 1);

        }

    }


//leetcode submit region end(Prohibit modification and deletion)

}
