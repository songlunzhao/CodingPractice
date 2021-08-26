//Design a data structure that supports adding new words and finding if a string
// matches any previously added string. 
//
// Implement the WordDictionary class: 
//
// 
// WordDictionary() Initializes the object. 
// void addWord(word) Adds word to the data structure, it can be matched later. 
//
// bool search(word) Returns true if there is any string in the data structure t
//hat matches word or false otherwise. word may contain dots '.' where dots can be
// matched with any letter. 
// 
//
// 
// Example: 
//
// 
//Input
//["WordDictionary","addWord","addWord","addWord","search","search","search","se
//arch"]
//[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
//Output
//[null,null,null,null,false,true,true,true]
//
//Explanation
//WordDictionary wordDictionary = new WordDictionary();
//wordDictionary.addWord("bad");
//wordDictionary.addWord("dad");
//wordDictionary.addWord("mad");
//wordDictionary.search("pad"); // return False
//wordDictionary.search("bad"); // return True
//wordDictionary.search(".ad"); // return True
//wordDictionary.search("b.."); // return True
// 
//
// 
// Constraints: 
//
// 
// 1 <= word.length <= 500 
// word in addWord consists lower-case English letters. 
// word in search consist of '.' or lower-case English letters. 
// At most 50000 calls will be made to addWord and search. 
// 
// Related Topics String Depth-First Search Design Trie 
// 👍 3272 👎 138


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class DesignAddAndSearchWordsDataStructure_211 {

    
    
    @Test
    public void testDesignAddAndSearchWordsDataStructure(){
        WordDictionary solution = new DesignAddAndSearchWordsDataStructure_211()
                        .new WordDictionary();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class WordDictionary {

    /** Initialize your data structure here. */
    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        
    }
    
    public boolean search(String word) {
        return true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
