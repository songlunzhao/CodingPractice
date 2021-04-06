//Given a non-empty list of words, return the k most frequent elements. 
// Your answer should be sorted by frequency from highest to lowest. If two word
//s have the same frequency, then the word with the lower alphabetical order comes
// first. 
//
// Example 1: 
// 
//Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
//Output: ["i", "love"]
//Explanation: "i" and "love" are the two most frequent words.
//    Note that "i" comes before "love" due to a lower alphabetical order.
// 
// 
//
// Example 2: 
// 
//Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"]
//, k = 4
//Output: ["the", "is", "sunny", "day"]
//Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
//    with the number of occurrence being 4, 3, 2 and 1 respectively.
// 
// 
//
// Note: 
// 
// You may assume k is always valid, 1 ≤ k ≤ number of unique elements. 
// Input words contain only lowercase letters. 
// 
// 
//
// Follow up: 
// 
// Try to solve it in O(n log k) time and O(n) extra space. 
// 
// Related Topics Hash Table Heap Trie 
// 👍 2872 👎 189


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Set<String> wordSet = new HashSet<>();
        Set<Node> nodeSet = new HashSet<>();
        List<String> resultList = new ArrayList<>();
        Trie trie = new Trie();
        for(int i=0; i<words.length;i++){
            trie.insert(words[i]);
        }
        for(int i=0; i<words.length;i++) {
            if (!wordSet.contains(words[i])) {
                nodeSet.add(trie.search(words[i]));
                wordSet.add(words[i]);
            }
        }
        List<Node> nodeList = new ArrayList<>(nodeSet);
        Collections.sort(nodeList);
        int j=0;
        for(int i=nodeList.size()-1;i>=0;i--){
            if(j<k){
                resultList.add(nodeList.get(i).word);
                j++;
            }
        }
        return resultList;
    }

    class Node implements Comparable<Node>{
        boolean isEnd;
        Map<Character, Node> links = new HashMap<>();
        int count=0;
        String word;
        public int compareTo(Node other){
            if(this.count==other.count)
                return 0-this.word.compareTo(other.word);
            return this.count-other.count;
        }
    }

    class Trie {

        Node root=new Node();

        public void insert(String word){
            if(word==null) return;
            Node current=root;
            for(int i=0; i<word.length(); i++){
                if(!current.links.containsKey(word.charAt(i))){
                    current.links.put(word.charAt(i), new Node());
                }
                current=current.links.get(word.charAt(i));
            }
            current.isEnd=true;
            current.count++;
            current.word=word;
        }

        public Node search(String word){
            if(word==null) return null;
            Node current=root;
            for(int i=0; i<word.length(); i++){
                if(current.links.containsKey(word.charAt(i))){
                    current=current.links.get(word.charAt(i));
                } else {
                    return null;
                }
            }
            return current;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
