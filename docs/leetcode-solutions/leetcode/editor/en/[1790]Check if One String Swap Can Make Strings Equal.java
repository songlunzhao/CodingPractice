//You are given two strings s1 and s2 of equal length. A string swap is an opera
//tion where you choose two indices in a string (not necessarily different) and sw
//ap the characters at these indices. 
//
// Return true if it is possible to make both strings equal by performing at mos
//t one string swap on exactly one of the strings. Otherwise, return false. 
//
// 
// Example 1: 
//
// 
//Input: s1 = "bank", s2 = "kanb"
//Output: true
//Explanation: For example, swap the first character with the last character of 
//s2 to make "bank".
// 
//
// Example 2: 
//
// 
//Input: s1 = "attack", s2 = "defend"
//Output: false
//Explanation: It is impossible to make them equal with one string swap.
// 
//
// Example 3: 
//
// 
//Input: s1 = "kelb", s2 = "kelb"
//Output: true
//Explanation: The two strings are already equal, so no string swap operation is
// required.
// 
//
// Example 4: 
//
// 
//Input: s1 = "abcd", s2 = "dcba"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= s1.length, s2.length <= 100 
// s1.length == s2.length 
// s1 and s2 consist of only lowercase English letters. 
// 
// Related Topics String 
// 👍 105 👎 6


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1==null && s2==null) return true;
        if(s1==null && s2!=null || s1!=null && s2==null) return false;
        if(s1.length()!=s2.length()) return false;
        int i=0;
        int j=0;
        int[] idx= new int[2];
        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(j<2){
                    idx[j]=i;
                }
                j++;
                if(j==3) return false;
            }
            i++;
        }
        if(j==0) return true;
        if(j==1) return false;
        else {
            if(s1.charAt(idx[0]) == s2.charAt(idx[1])
                    && s1.charAt(idx[1])==s2.charAt(idx[0]))
                return true;

        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
