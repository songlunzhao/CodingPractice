//You are given a network of n nodes, labeled from 1 to n. You are also given ti
//mes, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui 
//is the source node, vi is the target node, and wi is the time it takes for a sig
//nal to travel from source to target. 
//
// We will send a signal from a given node k. Return the time it takes for all t
//he n nodes to receive the signal. If it is impossible for all the n nodes to rec
//eive the signal, return -1. 
//
// 
// Example 1: 
//
// 
//Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: times = [[1,2,1]], n = 2, k = 1
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: times = [[1,2,1]], n = 2, k = 2
//Output: -1
// 
//
// 
// Constraints: 
//
// 
// 1 <= k <= n <= 100 
// 1 <= times.length <= 6000 
// times[i].length == 3 
// 1 <= ui, vi <= n 
// ui != vi 
// 0 <= wi <= 100 
// All the pairs (ui, vi) are unique. (i.e., no multiple edges.) 
// 
// Related Topics Depth-First Search Breadth-First Search Graph Heap (Priority Q
//ueue) Shortest Path 
// 👍 2911 👎 255


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class NetworkDelayTime_743 {

    
    
    @Test
    public void testNetworkDelayTime(){
       Solution solution = new NetworkDelayTime_743()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
