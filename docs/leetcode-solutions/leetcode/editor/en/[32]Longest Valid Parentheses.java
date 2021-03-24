//Given a string containing just the characters '(' and ')', find the length of 
//the longest valid (well-formed) parentheses substring. 
//
// 
// Example 1: 
//
// 
//Input: s = "(()"
//Output: 2
//Explanation: The longest valid parentheses substring is "()".
// 
//
// Example 2: 
//
// 
//Input: s = ")()())"
//Output: 4
//Explanation: The longest valid parentheses substring is "()()".
// 
//
// Example 3: 
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
// 0 <= s.length <= 3 * 104 
// s[i] is '(', or ')'. 
// 
// Related Topics String Dynamic Programming 
// 👍 4559 👎 171


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Character> stack = new Stack<>();
        if(s.length()<=1) return 0;
        stack.push(s.charAt(0));
        int len=0;
        for(int i=1; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                if(len>max){
                    max=len;
                    len=0;
                }
                continue;
            }
            if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
                if(len>max){
                    max=len;
                    len=0;
                }
            } else {
                //current is )
                if(stack.peek()==')'){
                    //previous is )
                    stack.push(s.charAt(i));
                    if(len>max){
                        max=len;
                        len=0;
                    }
                } else {
                    stack.pop();
                    len=len+2;
                    if(len>max){
                        max=len;
                    }
                }
            }
        }
        if(len>max) max=len;
        return max;    }
}
//leetcode submit region end(Prohibit modification and deletion)
