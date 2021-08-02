//We have two special characters: 
//
// 
// The first character can be represented by one bit 0. 
// The second character can be represented by two bits (10 or 11). 
// 
//
// Given a binary array bits that ends with 0, return true if the last character
// must be a one-bit character. 
//
// 
// Example 1: 
//
// 
//Input: bits = [1,0,0]
//Output: true
//Explanation: The only way to decode it is two-bit character and one-bit charac
//ter.
//So the last character is one-bit character.
// 
//
// Example 2: 
//
// 
//Input: bits = [1,1,1,0]
//Output: false
//Explanation: The only way to decode it is two-bit character and two-bit charac
//ter.
//So the last character is not one-bit character.
// 
//
// 
// Constraints: 
//
// 
// 1 <= bits.length <= 1000 
// bits[i] is either 0 or 1. 
// 
// Related Topics Array 
// 👍 601 👎 1544


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class OneBitAnd2BitCharacters_717 {

    
    
    @Test
    public void testOneBitAnd2BitCharacters(){
       Solution solution = new OneBitAnd2BitCharacters_717()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
