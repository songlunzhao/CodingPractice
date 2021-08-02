//Given a characters array letters that is sorted in non-decreasing order and a 
//character target, return the smallest character in the array that is larger than
// target. 
//
// Note that the letters wrap around. 
//
// 
// For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'. 
// 
//
// 
// Example 1: 
//
// 
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
// 
//
// Example 2: 
//
// 
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
// 
//
// Example 3: 
//
// 
//Input: letters = ["c","f","j"], target = "d"
//Output: "f"
// 
//
// Example 4: 
//
// 
//Input: letters = ["c","f","j"], target = "g"
//Output: "j"
// 
//
// Example 5: 
//
// 
//Input: letters = ["c","f","j"], target = "j"
//Output: "c"
// 
//
// 
// Constraints: 
//
// 
// 2 <= letters.length <= 104 
// letters[i] is a lowercase English letter. 
// letters is sorted in non-decreasing order. 
// letters contains at least two different characters. 
// target is a lowercase English letter. 
// 
// Related Topics Array Binary Search 
// 👍 771 👎 860


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class FindSmallestLetterGreaterThanTarget_744 {

    
    
    @Test
    public void testFindSmallestLetterGreaterThanTarget(){
       Solution solution = new FindSmallestLetterGreaterThanTarget_744()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
