//A trie (pronounced as "try") or prefix tree is a tree data structure used to e
//fficiently store and retrieve keys in a dataset of strings. There are various ap
//plications of this data structure, such as autocomplete and spellchecker. 
//
// Implement the Trie class: 
//
// 
// Trie() Initializes the trie object. 
// void insert(String word) Inserts the string word into the trie. 
// boolean search(String word) Returns true if the string word is in the trie (i
//.e., was inserted before), and false otherwise. 
// boolean startsWith(String prefix) Returns true if there is a previously inser
//ted string word that has the prefix prefix, and false otherwise. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
//[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
//Output
//[null, null, true, false, true, null, true]
//
//Explanation
//Trie trie = new Trie();
//trie.insert("apple");
//trie.search("apple");   // return True
//trie.search("app");     // return False
//trie.startsWith("app"); // return True
//trie.insert("app");
//trie.search("app");     // return True
// 
//
// 
// Constraints: 
//
// 
// 1 <= word.length, prefix.length <= 2000 
// word and prefix consist only of lowercase English letters. 
// At most 3 * 104 calls in total will be made to insert, search, and startsWith
//. 
// 
// Related Topics Design Trie 
// 👍 4382 👎 70


//leetcode submit region begin(Prohibit modification and deletion)
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

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)
