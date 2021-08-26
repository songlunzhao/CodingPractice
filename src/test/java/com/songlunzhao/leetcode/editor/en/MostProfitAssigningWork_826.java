//You have n jobs and m workers. You are given three arrays: difficulty, profit,
// and worker where: 
//
// 
// difficulty[i] and profit[i] are the difficulty and the profit of the ith job,
// and 
// worker[j] is the ability of jth worker (i.e., the jth worker can only complet
//e a job with difficulty at most worker[j]). 
// 
//
// Every worker can be assigned at most one job, but one job can be completed mu
//ltiple times. 
//
// 
// For example, if three workers attempt the same job that pays $1, then the tot
//al profit will be $3. If a worker cannot complete any job, their profit is $0. 
// 
//
// Return the maximum profit we can achieve after assigning the workers to the j
//obs. 
//
// 
// Example 1: 
//
// 
//Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7
//]
//Output: 100
//Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a 
//profit of [20,20,30,30] separately.
// 
//
// Example 2: 
//
// 
//Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// n == difficulty.length 
// n == profit.length 
// m == worker.length 
// 1 <= n, m <= 104 
// 1 <= difficulty[i], profit[i], worker[i] <= 105 
// 
// Related Topics Array Two Pointers Binary Search Greedy Sorting 
// 👍 593 👎 90


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class MostProfitAssigningWork_826 {

    
    
    @Test
    public void testMostProfitAssigningWork(){
       Solution solution = new MostProfitAssigningWork_826()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
