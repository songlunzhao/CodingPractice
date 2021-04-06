import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TrieTest_208 {

    @Test
    public void testTrie(){
        Trie obj = new Trie();
        obj.insert("hello");
        obj.insert("kitty");
        boolean ret = obj.search("kitty");
        boolean ret1 = obj.startsWith("prefix");

        assertEquals(ret, true);
        assertEquals(ret1, false);

        //input:["Trie","insert","search","startsWith"]
        // [[],["ab"],["a"],["a"]] Output:[null,null,true,true] Expected:[null,null,false,true] stdout:
    }

    class Trie {
        TrieNode root;
        class TrieNode {
            int end;
            char c;
            Map<Character, TrieNode> children = new HashMap<>();
            TrieNode(char c) {
                this.c = c;
            }
        }

        /** Initialize your data structure here. */
        public Trie() {
             root = new TrieNode('0');
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            if(word==null) return;
            Map<Character, TrieNode> currentMap=root.children;

            for(int i=0;i<word.length();i++){
                if(!currentMap.containsKey(word.charAt(i))){
                    currentMap.put(word.charAt(i), new TrieNode(word.charAt(i)));
                }
                if(i==word.length()-1){
                    currentMap.get(word.charAt(i)).end=word.length();
                }
                currentMap=currentMap.get(word.charAt(i)).children;
            }
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            if(word==null) return false;
            Map<Character, TrieNode> currentMap=root.children;

            for(int i=0;i<word.length();i++){
                if(currentMap.containsKey(word.charAt(i))){
                    if(i==word.length()-1){
                        if(currentMap.get(word.charAt(i)).end==word.length())
                            return true;
                    }
                    currentMap=currentMap.get(word.charAt(i)).children;
                } else {
                    return false;
                }
            }
            return false;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
                if(prefix==null) return false;
                Map<Character, TrieNode> currentMap=root.children;

                for(int i=0;i<prefix.length();i++){
                    if(currentMap.containsKey(prefix.charAt(i))){
                        currentMap=currentMap.get(prefix.charAt(i)).children;
                    } else {
                        return false;
                    }
                }
                return true;
        }
    }
}
