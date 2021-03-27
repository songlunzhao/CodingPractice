//Given a binary string s without leading zeros, return true if s contains at mo
//st one contiguous segment of ones. Otherwise, return false. 
//
// 
// Example 1: 
//
// 
//Input: s = "1001"
//Output: false
//Explanation: The ones do not form a contiguous segment.
// 
//
// Example 2: 
//
// 
//Input: s = "110"
//Output: true 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 100 
// s[i] is either '0' or '1'. 
// s[0] is '1'. 
// 
// Related Topics Greedy 
// 👍 64 👎 173


//leetcode submit region begin(Prohibit modification and deletion)
//数组中最多有一组连续的1
class Solution {
    public boolean checkOnesSegment(String s) {
        if(s==null||s.length()==0) return false;
        if(s.length()==1 || s.length()==2) return true;
        for(int i=2;i<s.length();i++){
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0')
                return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
