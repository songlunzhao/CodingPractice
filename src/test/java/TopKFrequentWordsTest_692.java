import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class TopKFrequentWordsTest_692 {

    @Test
    public void testTopKFrequentWords(){
        //Wrong Answer: input:["i", "love", "leetcode", "i", "love", "coding"] 2
        // Output:[] Expected:["i","love"] stdout:
        //Wrong Answer: input:["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"] 4 Output:["day","is","sunny","the"] Expected:["the","is","sunny","day"] stdout:
        String [] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        List<String> ret = topKFrequent(words,2);
        assertEquals(ret.size(), 2);
    }
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
                return this.word.compareTo(other.word);
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
