//You are given a string s. We want to partition the string into as many parts a
//s possible so that each letter appears in at most one part. 
//
// Return a list of integers representing the size of these parts. 
//
// 
// Example 1: 
//
// 
//Input: s = "ababcbacadefegdehijhklij"
//Output: [9,7,8]
//Explanation:
//The partition is "ababcbaca", "defegde", "hijhklij".
//This is a partition so that each letter appears in at most one part.
//A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it split
//s s into less parts.
// 
//
// Example 2: 
//
// 
//Input: s = "eccbbbbdec"
//Output: [10]
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 500 
// s consists of lowercase English letters. 
// 
// Related Topics Hash Table Two Pointers String Greedy 
// 👍 5087 👎 207


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.List;

public class PartitionLabels_763 {

    
    
    @Test
    public void testPartitionLabels(){
       Solution solution = new PartitionLabels_763()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> partitionLabels(String s) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
