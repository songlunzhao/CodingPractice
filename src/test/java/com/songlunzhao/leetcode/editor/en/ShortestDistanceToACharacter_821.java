//Given a string s and a character c that occurs in s, return an array of intege
//rs answer where answer.length == s.length and answer[i] is the distance from ind
//ex i to the closest occurrence of character c in s. 
//
// The distance between two indices i and j is abs(i - j), where abs is the abso
//lute value function. 
//
// 
// Example 1: 
//
// 
//Input: s = "loveleetcode", c = "e"
//Output: [3,2,1,0,1,0,0,1,2,2,1,0]
//Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
//
//The closest occurrence of 'e' for index 0 is at index 3, so the distance is ab
//s(0 - 3) = 3.
//The closest occurrence of 'e' for index 1 is at index 3, so the distance is ab
//s(1 - 3) = 3.
//For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5,
// but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
//The closest occurrence of 'e' for index 8 is at index 6, so the distance is ab
//s(8 - 6) = 2.
// 
//
// Example 2: 
//
// 
//Input: s = "aaab", c = "b"
//Output: [3,2,1,0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 104 
// s[i] and c are lowercase English letters. 
// It is guaranteed that c occurs at least once in s. 
// 
// Related Topics Array Two Pointers String 
// 👍 1771 👎 112


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ShortestDistanceToACharacter_821 {

    
    
    @Test
    public void testShortestDistanceToACharacter(){
       Solution solution = new ShortestDistanceToACharacter_821()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] shortestToChar(String s, char c) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
