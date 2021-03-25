//Given a string s consists of some words separated by spaces, return the length
// of the last word in the string. If the last word does not exist, return 0. 
//
// A word is a maximal substring consisting of non-space characters only. 
//
// 
// Example 1: 
// Input: s = "Hello World"
//Output: 5
// Example 2: 
// Input: s = " "
//Output: 0
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 104 
// s consists of only English letters and spaces ' '. 
// 
// Related Topics String 
// 👍 1022 👎 3072


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0) return 0;
        int i=0, j=s.length()-1, len=0;
        while(i<s.length()){
            if(s.charAt(i)==' ') i++;
            else break;
        }
        while(j>=0){
            if(s.charAt(j)==' ') j--;
            else break;
        }
        while(i<=j){
            if(s.charAt(i)!=' '){
                len++;
            } else {
                len=0;
            }
            i++;
        }
        return len;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
