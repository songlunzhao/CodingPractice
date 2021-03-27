import java.util.Stack;

public class ValidParenthesesTest_20 {

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
