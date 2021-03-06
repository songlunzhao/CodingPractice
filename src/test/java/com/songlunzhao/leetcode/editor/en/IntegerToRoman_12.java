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
// Given an integer, convert it to a roman numeral. 
//
// 
// Example 1: 
//
// 
//Input: num = 3
//Output: "III"
// 
//
// Example 2: 
//
// 
//Input: num = 4
//Output: "IV"
// 
//
// Example 3: 
//
// 
//Input: num = 9
//Output: "IX"
// 
//
// Example 4: 
//
// 
//Input: num = 58
//Output: "LVIII"
//Explanation: L = 50, V = 5, III = 3.
// 
//
// Example 5: 
//
// 
//Input: num = 1994
//Output: "MCMXCIV"
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
// 
//
// 
// Constraints: 
//
// 
// 1 <= num <= 3999 
// 
// Related Topics Math String 
// 👍 1869 👎 3236


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman_12 {


    @Test
    public void testIntegerToRoman() {
        Solution solution = new IntegerToRoman_12()
                .new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String intToRoman(int num) {
            char[] roman = new char[] {'M', 'D', 'C', 'L','X','V', 'I'};
            int[] value = new int[]{1000, 500, 100, 50, 10, 5, 1};
            StringBuilder ans = new StringBuilder();

           //use 1000, 100, 10, 1 to decide the single digit value
            for(int i=0; i< value.length; i=i+2) {
                int x = num/value[i];
                //for different single digit value, generate the roman letter
                if(x<4){
                    for(int j=0; j<x; j++){
                        ans = ans.append(roman[i]);
                    }
                } else if (x==4) {
                    ans = ans.append(roman[i]);
                    ans = ans.append(roman[i-1]);
                } else if (x>4 && x<9) {
                    ans = ans.append(roman[i-1]);
                    for (int j = 5; j < x; j++) {
                        ans = ans.append(roman[i]);
                    }
                } else if (x==9) {
                    ans = ans = ans.append(roman[i]);
                    ans = ans = ans.append(roman[i-2]);
                }
                num = num % value[i];
            }



            return ans.toString();
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
