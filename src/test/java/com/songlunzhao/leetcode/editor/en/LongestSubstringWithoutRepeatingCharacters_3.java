//Given a string s, find the length of the longest substring without repeating c
//haracters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// Example 4: 
//
// 
//Input: s = ""
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 104 
// s consists of English letters, digits, symbols and spaces. 
// 
// Related Topics Hash Table Two Pointers String Sliding Window 
// 👍 15125 👎 767


package com.songlunzhao.leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters_3()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        //sliding window,
        // left end of window start at 0,
        // extend right end of window until find duplicate,
        // save the length of window if the length is the current max,
        // move left end of window until reach the duplicate char
    public int lengthOfLongestSubstring(String s) {
        int ret=0, left=0,right=0;
        Set<Character> longestSubString = new HashSet<>();
        while(left<s.length() && right<s.length()){
            if(!longestSubString.contains(s.charAt(right))){
                longestSubString.add(s.charAt(right));
                right++;
                ret = Math.max(ret, right-left);

            } else {
                longestSubString.remove(s.charAt(left));
                left++;
            }
        }
        return ret;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}
