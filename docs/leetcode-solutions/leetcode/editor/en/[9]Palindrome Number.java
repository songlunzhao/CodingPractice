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
// 👍 3094 👎 1708


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int input) {
        int x=input;
        if(x<10 && x>=0){
            return true;
        }
        if(x<0 || x%10==0){
            return false;
        }
        int revNumber=0;
        while(x>=10){
            int i = x%10;
            revNumber=revNumber*10 + i;
            x=x/10;
        }
        revNumber=revNumber*10 + x;
        return revNumber==input;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
