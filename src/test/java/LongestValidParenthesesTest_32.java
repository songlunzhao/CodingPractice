import org.testng.annotations.Test;

import java.util.Stack;

import static org.testng.Assert.assertEquals;

public class LongestValidParenthesesTest_32 {

    @Test
    public void testLongestValidParentheses(){
        //")()())" expect 4
        //Wrong Answer: input:")()())" Output:2 Expected:4
        //Wrong Answer: input:"()(()" Output:4 Expected:2
        //Wrong Answer: input:"()(())" Output:2 Expected:6
        int ret = longestValidParentheses(")()())");
        assertEquals(ret, 4);
        ret = longestValidParentheses("()(()");
        assertEquals(ret, 2);
        ret = longestValidParentheses("()(())");//this test case need index to calculate
        assertEquals(ret, 6);
    }

    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }


}
