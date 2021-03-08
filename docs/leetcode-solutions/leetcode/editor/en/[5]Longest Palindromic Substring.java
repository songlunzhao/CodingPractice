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
// Related Topics String Dynamic Programming 
// 👍 9719 👎 651


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0) return "";
        int start=0, end=0;
        //expand to both end from i
        for(int i=0; i<s.length(); i++){
            //for palindrome like aba
            //int len1=expandAroundCenter(s,i,i);
            //for palindrome like abba
            //int len2=expandAroundCenter(s,i,i+1);
            //int len = Math.max(len1,len2);
            int len = expandAroundCenter(s,i);
            if(len>end-start) {
                start = i-(len-1)/2;
                end = i+len/2;
            }

        }
        return s.substring(start, end+1);//substring does not count the last index
    }

    /**
     * left=right expand as ..aba.., right=left+1 expand as ..abba..
     * return the length of palindro
     * @param s
     * @param left
     * @param right
     * @return
     */
    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;//minus 1 because l started with 0
    }
    private int expandAroundCenter(String s, int center) {
        int left=center, right=center;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        int len = right-left-1;

        left=center; right=center+1;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        int len2=right-left-1;
        return Math.max(len,len2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
