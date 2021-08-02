//Given an array of unique integers, arr, where each integer arr[i] is strictly 
//greater than 1. 
//
// We make a binary tree using these integers, and each number may be used for a
//ny number of times. Each non-leaf node's value should be equal to the product of
// the values of its children. 
//
// Return the number of binary trees we can make. The answer may be too large so
// return the answer modulo 109 + 7. 
//
// 
// Example 1: 
//
// 
//Input: arr = [2,4]
//Output: 3
//Explanation: We can make these trees: [2], [4], [4, 2, 2] 
//
// Example 2: 
//
// 
//Input: arr = [2,4,5,10]
//Output: 7
//Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 
//5], [10, 5, 2]. 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 1000 
// 2 <= arr[i] <= 109 
// All the values of arr are unique. 
// 
// Related Topics Array Hash Table Dynamic Programming 
// 👍 720 👎 94


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class BinaryTreesWithFactors_823 {

    
    
    @Test
    public void testBinaryTreesWithFactors(){
       Solution solution = new BinaryTreesWithFactors_823()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
