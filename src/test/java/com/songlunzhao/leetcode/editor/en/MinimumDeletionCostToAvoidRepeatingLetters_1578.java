//Given a string s and an array of integers cost where cost[i] is the cost of de
//leting the ith character in s. 
//
// Return the minimum cost of deletions such that there are no two identical let
//ters next to each other. 
//
// Notice that you will delete the chosen characters at the same time, in other 
//words, after deleting a character, the costs of deleting other characters will n
//ot change. 
//
// 
// Example 1: 
//
// 
//Input: s = "abaac", cost = [1,2,3,4,5]
//Output: 3
//Explanation: Delete the letter "a" with cost 3 to get "abac" (String without t
//wo identical letters next to each other).
// 
//
// Example 2: 
//
// 
//Input: s = "abc", cost = [1,2,3]
//Output: 0
//Explanation: You don't need to delete any character because there are no ident
//ical letters next to each other.
// 
//
// Example 3: 
//
// 
//Input: s = "aabaa", cost = [1,2,3,4,1]
//Output: 2
//Explanation: Delete the first and the last character, getting the string ("aba
//").
// 
//
// 
// Constraints: 
//
// 
// s.length == cost.length 
// 1 <= s.length, cost.length <= 10^5 
// 1 <= cost[i] <= 10^4 
// s contains only lowercase English letters. 
// 
// Related Topics Array String Dynamic Programming Greedy 
// 👍 568 👎 26


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MinimumDeletionCostToAvoidRepeatingLetters_1578 {

    
    
    @Test
    public void testMinimumDeletionCostToAvoidRepeatingLetters(){
       Solution solution = new MinimumDeletionCostToAvoidRepeatingLetters_1578()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCost(String s, int[] cost) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
