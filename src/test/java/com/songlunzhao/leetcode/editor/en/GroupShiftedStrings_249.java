//We can shift a string by shifting each of its letters to its successive letter
//. 
//
// 
// For example, "abc" can be shifted to be "bcd". 
// 
//
// We can keep shifting the string to form a sequence. 
//
// 
// For example, we can keep shifting "abc" to form the sequence: "abc" -> "bcd" 
//-> ... -> "xyz". 
// 
//
// Given an array of strings strings, group all strings[i] that belong to the sa
//me shifting sequence. You may return the answer in any order. 
//
// 
// Example 1: 
// Input: strings = ["abc","bcd","acef","xyz","az","ba","a","z"]
//Output: [["acef"],["a","z"],["abc","bcd","xyz"],["az","ba"]]
// Example 2: 
// Input: strings = ["a"]
//Output: [["a"]]
// 
// 
// Constraints: 
//
// 
// 1 <= strings.length <= 200 
// 1 <= strings[i].length <= 50 
// strings[i] consists of lowercase English letters. 
// 
// Related Topics Array Hash Table String 
// 👍 837 👎 165


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class GroupShiftedStrings_249 {

    
    
    @Test
    public void testGroupShiftedStrings(){
       Solution solution = new GroupShiftedStrings_249()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
