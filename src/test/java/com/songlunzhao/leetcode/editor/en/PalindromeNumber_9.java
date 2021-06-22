//Given an integer x, return true if x is palindrome integer. 
//
// An integer is a palindrome when it reads the same backward as forward. For ex
//ample, 121 is palindrome while 123 is not. 
//
// 
// Example 1: 
//
// 
//Input: x = 121
//Output: true
// 
//
// Example 2: 
//
// 
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes
// 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// Example 4: 
//
// 
//Input: x = -101
//Output: false
// 
//
// 
// Constraints: 
//
// 
// -231 <= x <= 231 - 1 
// 
//
// 
//Follow up: Could you solve it without converting the integer to a string? Rela
//ted Topics Math 
// 👍 3450 👎 1765


package com.songlunzhao.leetcode.editor.en;

public class PalindromeNumber_9 {

    public static void main(String[] args) {
        Solution solution = new PalindromeNumber_9()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0 && x<10) return true;
        String s = String.valueOf(x);
        int left=0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
