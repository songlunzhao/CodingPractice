//Given a non-negative integer x,
// compute and return the square root of x.
//
// Since the return type is an integer, the decimal digits are truncated, and on
//ly the integer part of the result is returned. 
//
// Note: You are not allowed to use any built-in exponent function or operator, 
//such as pow(x, 0.5) or x ** 0.5. 
//
// 
// Example 1: 
//
// 
//Input: x = 4
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is
// truncated, 2 is returned. 
//
// 
// Constraints: 
//
// 
// 0 <= x <= 231 - 1 
// 
// Related Topics Math Binary Search 
// 👍 2208 👎 2477


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Sqrtx_69 {

    
    
    @Test
    public void testSqrtx(){
       Solution solution = new Sqrtx_69()
                        .new Solution();
       int i = 2147395599;
       long j = (long)i*i;
       System.out.println(j);
       assertEquals(solution.mySqrt(2147395599),46339);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        int left=0, right=x, ret=0;
        while(left<=right){
            long mid = (left+right)/2;//avoid big number overflow
            double l = mid*mid;
            if (l==x){
                return (int)mid;
            }
            else if(l>x){
                right=(int)mid-1;
            } else {
                ret=(int)mid;
                left=(int)mid+1;
            }

        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
