//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics String 
// 👍 4635 👎 2329


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class LongestCommonPrefix_14 {

    
    
    @Test
    public void testLongestCommonPrefix(){
       Solution solution = new LongestCommonPrefix_14()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null) return "";
        if(strs.length==1) return strs[0];
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(true){
            for(int i=0; i<strs.length;i++){
                if(strs[i].length()<=j){
                    return sb.toString();
                }
                if(i>0 && strs[i].charAt(j)!=strs[i-1].charAt(j)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(j));
            j++;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
