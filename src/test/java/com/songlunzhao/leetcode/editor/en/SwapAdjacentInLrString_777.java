//In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL", a move
// consists of either replacing one occurrence of "XL" with "LX", or replacing one
// occurrence of "RX" with "XR". Given the starting string start and the ending st
//ring end, return True if and only if there exists a sequence of moves to transfo
//rm one string to the other. 
//
// 
// Example 1: 
//
// 
//Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
//Output: true
//Explanation: We can transform start to end following these steps:
//RXXLRXRXL ->
//XRXLRXRXL ->
//XRLXRXRXL ->
//XRLXXRRXL ->
//XRLXXRRLX
// 
//
// Example 2: 
//
// 
//Input: start = "X", end = "L"
//Output: false
// 
//
// Example 3: 
//
// 
//Input: start = "LLR", end = "RRL"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: start = "XL", end = "LX"
//Output: true
// 
//
// Example 5: 
//
// 
//Input: start = "XLLR", end = "LXLX"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= start.length <= 104 
// start.length == end.length 
// Both start and end will only consist of characters in 'L', 'R', and 'X'. 
// 
// Related Topics Two Pointers String 
// 👍 587 👎 538


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class SwapAdjacentInLrString_777 {

    
    
    @Test
    public void testSwapAdjacentInLrString(){
       Solution solution = new SwapAdjacentInLrString_777()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canTransform(String start, String end) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
