//A transformation sequence from word beginWord to word endWord using a dictiona
//ry wordList is a sequence of words such that: 
//
// 
// The first word in the sequence is beginWord. 
// The last word in the sequence is endWord. 
// Only one letter is different between each adjacent pair of words in the seque
//nce. 
// Every word in the sequence is in wordList. 
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
//Explanation: One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -
//> "cog" with 5 words.
// 
//
// Example 2: 
//
// 
//Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot"
//,"log"]
//Output: 0
//Explanation: The endWord "cog" is not in wordList, therefore there is no possi
//ble transformation.
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
// All the strings in wordList are unique. 
// 
// Related Topics Breadth-first Search 
// 👍 4741 👎 1400


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
        while(!queue.isEmpty()){
            Node top = queue.poll();
            if(endWord.equals(top.word)) return top.level;

            Iterator<String> iterator = wordList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                if(element.equals(top.word)){
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
