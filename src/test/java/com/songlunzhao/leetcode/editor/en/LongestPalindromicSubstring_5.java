//Given a string s, return the longest palindromic substring in s. 
//
// 
// Example 1: 
//
// 
//Input: s = "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
// 
//
// Example 2: 
//
// 
//Input: s = "cbbd"
//Output: "bb"
// 
//
// Example 3: 
//
// 
//Input: s = "a"
//Output: "a"
// 
//
// Example 4: 
//
// 
//Input: s = "ac"
//Output: "a"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consist of only digits and English letters (lower-case and/or upper-case), 
//
// 
// Related Topics String Dynamic Programming 
// 👍 11428 👎 718


package com.songlunzhao.leetcode.editor.en;


import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring_5 {

    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring_5()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==1) return s;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            sb.append('|');
            sb.append(s.charAt(i));

        }
        sb.append('|');
        String s1=sb.toString();
        int[]palindromeRadius = new int[s1.length()];

        int center=0;
        Set<Character> charSet = new HashSet<>();
        while(center<s1.length()){
            int r=0;
            while(center-r>=0 && center+r<s1.length()
                    &&s1.charAt(center-r)==s1.charAt(center+r)){
                r++;
            }
            palindromeRadius[center]=r;
            center++;
        }
        int maxLen=0;
        int maxLenIdx=0;
        for (int i=0; i<s1.length(); i++){
            if(palindromeRadius[i]>maxLen){
                maxLen=palindromeRadius[i];
                maxLenIdx=i;
            }
        }
        int r=1; center=maxLenIdx;
        StringBuilder ans = new StringBuilder();
        if(s1.charAt(center)!='|'){
            ans.append(s1.charAt(center));
        }
        while(r<maxLen){
            if(s1.charAt(center+r)!='|'){
                ans.append(s1.charAt(center+r));
                ans.insert(0, s1.charAt(center+r));
            }
            r++;
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
