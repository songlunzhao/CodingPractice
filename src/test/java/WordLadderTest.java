import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class WordLadderTest {
    //Wrong Answer: input:"a" "c" ["a","b","c"] Output:1 Expected:2 stdout:
    //Wrong Answer: input:"hit" "cog" ["hot","dot","dog","lot","log","cog"] Output:6 Expected:5 stdout:

    @Test
    public void testWordladder(){
        List<String> wordList = Arrays.asList("a","b","c");
        List<String>input = new ArrayList<>(wordList);
        int ret = ladderLength("a","c",input);
        assertEquals(ret,2);

        wordList=Arrays.asList("hot","dot","dog","lot","log","cog");
        input = new ArrayList<>(wordList);
        ret=ladderLength("hit","cog",input);
        assertEquals(ret,5);
    }

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
