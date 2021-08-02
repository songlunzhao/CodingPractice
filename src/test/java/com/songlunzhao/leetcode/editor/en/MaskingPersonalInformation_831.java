//We are given a personal information string s, which may represent either an em
//ail address or a phone number. 
//
// We would like to mask this personal information according to the following ru
//les: 
//
// 
//1. Email address: 
//
// We define a name to be a string of length ≥ 2 consisting of only lowercase le
//tters a-z or uppercase letters A-Z. 
//
// An email address starts with a name, followed by the symbol '@', followed by 
//a name, followed by the dot '.' and followed by a name. 
//
// All email addresses are guaranteed to be valid and in the format of "name1@na
//me2.name3". 
//
// To mask an email, all names must be converted to lowercase and all letters be
//tween the first and last letter of the first name must be replaced by 5 asterisk
//s '*'. 
//
// 
//2. Phone number: 
//
// A phone number is a string consisting of only the digits 0-9 or the character
//s from the set {'+', '-', '(', ')', ' '}. You may assume a phone number contains
// 10 to 13 digits. 
//
// The last 10 digits make up the local number, while the digits before those ma
//ke up the country code. Note that the country code is optional. We want to expos
//e only the last 4 digits and mask all other digits. 
//
// The local number should be formatted and masked as "***-***-1111", where 1 re
//presents the exposed digits. 
//
// To mask a phone number with country code like "+111 111 111 1111", we write i
//t in the form "+***-***-***-1111". The '+' sign and the first '-' sign before th
//e local number should only exist if there is a country code. For example, a 12 d
//igit phone number mask should start with "+**-". 
//
// Note that extraneous characters like "(", ")", " ", as well as extra dashes o
//r plus signs not part of the above formatting scheme should be removed. 
//
// 
//
// Return the correct "mask" of the information provided. 
//
// 
//
// Example 1: 
//
// 
//Input: s = "LeetCode@LeetCode.com"
//Output: "l*****e@leetcode.com"
//Explanation: All names are converted to lowercase, and the letters between the
//
//             first and last letter of the first name is replaced by 5 asterisk
//s.
//             Therefore, "leetcode" -> "l*****e".
// 
//
// Example 2: 
//
// 
//Input: s = "AB@qq.com"
//Output: "a*****b@qq.com"
//Explanation: There must be 5 asterisks between the first and last letter 
//             of the first name "ab". Therefore, "ab" -> "a*****b".
// 
//
// Example 3: 
//
// 
//Input: s = "1(234)567-890"
//Output: "***-***-7890"
//Explanation: 10 digits in the phone number, which means all digits make up the
// local number.
// 
//
// Example 4: 
//
// 
//Input: s = "86-(10)12345678"
//Output: "+**-***-***-5678"
//Explanation: 12 digits, 2 digits for country code and 10 digits for local numb
//er. 
// 
//
// Notes: 
//
// 
// s.length <= 40. 
// Emails have length at least 8. 
// Phone numbers have length at least 10. 
// 
// Related Topics String 
// 👍 99 👎 371


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MaskingPersonalInformation_831 {

    
    
    @Test
    public void testMaskingPersonalInformation(){
       Solution solution = new MaskingPersonalInformation_831()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String maskPII(String s) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
