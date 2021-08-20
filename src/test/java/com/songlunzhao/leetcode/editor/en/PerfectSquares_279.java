//Given an integer n, return the least number of perfect square numbers that sum
// to n. 
//
// A perfect square is an integer that is the square of an integer; in other wor
//ds, it is the product of some integer with itself. For example, 1, 4, 9, and 16 
//are perfect squares while 3 and 11 are not. 
//
// 
// Example 1: 
//
// 
//Input: n = 12
//Output: 3
//Explanation: 12 = 4 + 4 + 4.
// 
//
// Example 2: 
//
// 
//Input: n = 13
//Output: 2
//Explanation: 13 = 4 + 9.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 104 
// 
// Related Topics Math Dynamic Programming Breadth-First Search 
// 👍 4968 👎 250


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class PerfectSquares_279 {

    
    
    @Test
    public void testPerfectSquares(){
       Solution solution = new PerfectSquares_279()
                        .new Solution();
        assertEquals(solution.numSquares(13),2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSquares(int n) {
        if(n<1) return 0;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            for(int i=0; i<size; i++){
                int currentLevelNumber = queue.poll(); //this number is on current level
                for(int j=1;j<=n;j++){
                    int sum = currentLevelNumber+j*j;
                    if(sum==n) return level;
                    if(sum>n) break;
                    if(!visited.contains(sum)){
                        queue.add(sum);
                        visited.add(sum);
                    }
                }
            }

        }
        return level;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
