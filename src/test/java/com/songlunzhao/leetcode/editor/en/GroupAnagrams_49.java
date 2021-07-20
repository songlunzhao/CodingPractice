//Given an array of strings strs, group the anagrams together.
// You can return the answer in any order.
//
// An Anagram is a word or phrase formed by rearranging the letters of a differe
//nt word or phrase, typically using all the original letters exactly once. 
//
// 
// Example 1: 
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2: 
// Input: strs = [""]
//Output: [[""]]
// Example 3: 
// Input: strs = ["a"]
//Output: [["a"]]
// 
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 104 
// 0 <= strs[i].length <= 100 
// strs[i] consists of lower-case English letters. 
// 
// Related Topics Hash Table String Sorting 
// 👍 5978 👎 243


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.*;

public class GroupAnagrams_49 {

    
    
    @Test
    public void testGroupAnagrams(){
       Solution solution = new GroupAnagrams_49()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> stringMap = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (String s: strs){
            char[] ca= s.toCharArray();
            Arrays.sort(ca);;
            String ss = String.valueOf(ca);
            if(stringMap.containsKey(ss)){
                stringMap.get(ss).add(s);
            } else {
                List<String> l = new ArrayList<>();
                l.add(s);
                stringMap.put(ss,l);
            }
        }
        for(String key: stringMap.keySet()){
            ans.add(stringMap.get(key));
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
