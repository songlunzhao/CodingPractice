//Given a signed 32-bit integer x, return x with its digits reversed. If reversi
//ng x causes the value to go outside the signed 32-bit integer range [-231, 231 -
// 1], then return 0. 
//
// Assume the environment does not allow you to store 64-bit integers (signed or
// unsigned). 
//
// 
// Example 1: 
// Input: x = 123
//Output: 321
// Example 2: 
// Input: x = -123
//Output: -321
// Example 3: 
// Input: x = 120
//Output: 21
// Example 4: 
// Input: x = 0
//Output: 0
// 
// 
// Constraints: 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics Math 
// 👍 4387 👎 6774


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int ret = 0;
        while(x!=0){
            int tmp = x%10;
            //prevent overflow
            if(ret>Integer.MAX_VALUE/10 || ret==Integer.MAX_VALUE/10 && tmp>7){
                return 0;
            }
            if(ret<Integer.MIN_VALUE/10 || ret == Integer.MIN_VALUE && tmp <-8){
                return 0;
            }
            ret = ret*10+tmp;
            x=x/10;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
