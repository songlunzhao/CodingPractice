//Roman numerals are represented by seven different symbols: I, V, X, L, C, D an
//d M. 
//
// 
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000 
//
// For example, 2 is written as II in Roman numeral, just two one's added togeth
//er. 12 is written as XII, which is simply X + II. The number 27 is written as XX
//VII, which is XX + V + II. 
//
// Roman numerals are usually written largest to smallest from left to right. Ho
//wever, the numeral for four is not IIII. Instead, the number four is written as 
//IV. Because the one is before the five we subtract it making four. The same prin
//ciple applies to the number nine, which is written as IX. There are six instance
//s where subtraction is used: 
//
// 
// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900. 
// 
//
// Given a roman numeral, convert it to an integer. 
//
// 
// Example 1: 
//
// 
//Input: s = "III"
//Output: 3
// 
//
// Example 2: 
//
// 
//Input: s = "IV"
//Output: 4
// 
//
// Example 3: 
//
// 
//Input: s = "IX"
//Output: 9
// 
//
// Example 4: 
//
// 
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
// 
//
// Example 5: 
//
// 
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 15 
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M'). 
// It is guaranteed that s is a valid roman numeral in the range [1, 3999]. 
// Related Topics Math String 
// 👍 368 👎 30


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
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
//leetcode submit region end(Prohibit modification and deletion)