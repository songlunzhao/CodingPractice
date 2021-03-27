import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.testng.Assert.assertEquals;

public class RomanToIntTest_13 {

    @Test
    public void testRomanToInt(){
        int ret = romanToInt("MCMXCIV");
        assertEquals(ret, 1994);
        ret = romanToInt("LVIII");
        assertEquals(ret, 58);
        ret = romanToInt("IX");
        assertEquals(ret, 9);
        ret = romanToInt("III");
        assertEquals(ret, 3);
    }
    public int romanToInt(String s) {
        Map<Character, Integer> romanDic = new HashMap<>();
        romanDic.put('I', 1);
        romanDic.put('V', 5);
        romanDic.put('X', 10);
        romanDic.put('L',50);
        romanDic.put('C',100);
        romanDic.put('D',500);
        romanDic.put('M',1000);
        int ret =0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty() || stack.peek()==s.charAt(i)){
                stack.push(s.charAt(i));
            } else {
                if(romanDic.get(stack.peek())<romanDic.get(s.charAt(i))) {
                    ret=ret+romanDic.get(s.charAt(i))-romanDic.get(stack.pop());
                } else {
                    ret=ret+romanDic.get(stack.pop());
                    stack.push(s.charAt(i));
                }

            }
        }
        while (!stack.isEmpty()){
            ret=ret+romanDic.get(stack.pop());
        }
        return ret;
    }
}
