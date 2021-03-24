import org.testng.annotations.Test;

import java.util.Stack;

public class LongestValidParenthesesTest {

    @Test
    public void testLongestValidParentheses(){
        //")()())" expect 4
    }

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
        return max;
    }
}
