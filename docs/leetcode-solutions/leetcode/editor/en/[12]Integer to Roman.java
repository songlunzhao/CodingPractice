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
// 👍 1703 👎 3124


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String intToRoman(int num) {
        int i=0,j=num,k=0;
        String result="";
        while(j>0){
            i=j%10;
            switch(k){
                case 0:
                    result=convertFirstDigit(i);
                    break;
                case 1:
                    result=convertSecondDigit(i)+result;
                    break;
                case 2:
                    result=convertThirdDigit(i)+result;
                    break;
                case 3:
                    result=convertForthDigit(i)+result;
                    break;
            }
            k++;
            j=j/10;
        }

        return result;
    }

    private String convertForthDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="M";
                break;
            case 2:
                result="MM";
                break;
            case 3:
                result="MMM";
                break;

        }
        return result;
    }

    private String convertThirdDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="C";
                break;
            case 2:
                result="CC";
                break;
            case 3:
                result="CCC";
                break;
            case 4:
                result="CD";
                break;
            case 5:
                result="D";
                break;
            case 6:
                result="DC";
                break;
            case 7:
                result="DCC";
                break;
            case 8:
                result="DCCC";
                break;
            case 9:
                result="CM";
                break;

        }
        return result;
    }

    private String convertSecondDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="X";
                break;
            case 2:
                result="XX";
                break;
            case 3:
                result="XXX";
                break;
            case 4:
                result="XL";
                break;
            case 5:
                result="L";
                break;
            case 6:
                result="LX";
                break;
            case 7:
                result="LXX";
                break;
            case 8:
                result="LXXX";
                break;
            case 9:
                result="XC";
                break;

        }
        return result;
    }
    private String convertFirstDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="I";
                break;
            case 2:
                result="II";
                break;
            case 3:
                result="III";
                break;
            case 4:
                result="IV";
                break;
            case 5:
                result="V";
                break;
            case 6:
                result="VI";
                break;
            case 7:
                result="VII";
                break;
            case 8:
                result="VIII";
                break;
            case 9:
                result="IX";
                break;

        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
