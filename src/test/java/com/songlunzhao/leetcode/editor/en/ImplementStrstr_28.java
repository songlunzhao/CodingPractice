//Implement strStr(). 
//
// Return the index of the first occurrence of needle in haystack, or -1 if need
//le is not part of haystack. 
//
// Clarification: 
//
// What should we return when needle is an empty string? This is a great questio
//n to ask during an interview. 
//
// For the purpose of this problem, we will return 0 when needle is an empty str
//ing. This is consistent to C's strstr() and Java's indexOf(). 
//
// 
// Example 1: 
// Input: haystack = "hello", needle = "ll"
//Output: 2
// Example 2: 
// Input: haystack = "aaaaa", needle = "bba"
//Output: -1
// Example 3: 
// Input: haystack = "", needle = ""
//Output: 0
// 
// 
// Constraints: 
//
// 
// 0 <= haystack.length, needle.length <= 5 * 104 
// haystack and needle consist of only lower-case English characters. 
// 
// Related Topics Two Pointers String String Matching 
// 👍 2593 👎 2511


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ImplementStrstr_28 {

    
    
    @Test
    public void testImplementStrstr(){
       Solution solution = new ImplementStrstr_28()
                        .new Solution();
       assertEquals(solution.strStr("123","123"),0);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null) return -1;
        if(needle.equals("")) return 0;
        if(haystack.equals("") && !needle.equals("")) return -1;
        for(int i=0; i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int needleIndex = 0;
                for(int j=i+1, k=1; j<haystack.length() && k<needle.length(); j++,k++){
                    if(haystack.charAt(j)!=needle.charAt(k)){
                        break;
                    }
                    needleIndex=k;
                }
                if(needleIndex==needle.length()-1) {
                    return i;
                }
            }
        }
        return -1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
