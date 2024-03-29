//Given two integers left and right, return the count of numbers in the inclusiv
//e range [left, right] having a prime number of set bits in their binary represen
//tation. 
//
// Recall that the number of set bits an integer has is the number of 1's presen
//t when written in binary. 
//
// 
// For example, 21 written in binary is 10101 which has 3 set bits. 
// 
//
// 
// Example 1: 
//
// 
//Input: left = 6, right = 10
//Output: 4
//Explanation:
//6 -> 110 (2 set bits, 2 is prime)
//7 -> 111 (3 set bits, 3 is prime)
//9 -> 1001 (2 set bits , 2 is prime)
//10->1010 (2 set bits , 2 is prime)
// 
//
// Example 2: 
//
// 
//Input: left = 10, right = 15
//Output: 5
//Explanation:
//10 -> 1010 (2 set bits, 2 is prime)
//11 -> 1011 (3 set bits, 3 is prime)
//12 -> 1100 (2 set bits, 2 is prime)
//13 -> 1101 (3 set bits, 3 is prime)
//14 -> 1110 (3 set bits, 3 is prime)
//15 -> 1111 (4 set bits, 4 is not prime)
// 
//
// 
// Constraints: 
//
// 
// 1 <= left <= right <= 106 
// 0 <= right - left <= 104 
// 
// Related Topics Math Bit Manipulation 
// 👍 361 👎 416


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class PrimeNumberOfSetBitsInBinaryRepresentation_762 {

    
    
    @Test
    public void testPrimeNumberOfSetBitsInBinaryRepresentation(){
       Solution solution = new PrimeNumberOfSetBitsInBinaryRepresentation_762()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPrimeSetBits(int left, int right) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
