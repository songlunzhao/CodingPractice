//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: s = "(]"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: s = "([)]"
//Output: false
// 
//
// Example 5: 
//
// 
//Input: s = "{[]}"
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 104 
// s consists of parentheses only '()[]{}'. 
// 
// Related Topics String Stack 
// 👍 6810 👎 278


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='('
                    || s.charAt(i)=='['
                    || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                switch (s.charAt(i)) {
                    case ')':
                        if(stack.peek()=='('){
                            stack.pop();
                            break;
                        }
                        return false;
                    case '}':
                        if(stack.peek()=='{'){
                            stack.pop();
                            break;
                        }
                        return false;
                    case ']':
                        if(stack.peek()=='['){
                            stack.pop();
                            break;
                        }
                        return false;
                    default:
                        return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
