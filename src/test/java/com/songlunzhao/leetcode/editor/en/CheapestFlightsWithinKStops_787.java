//There are n cities connected by some number of flights. You are given an array
// flights where flights[i] = [fromi, toi, pricei] indicates that there is a fligh
//t from city fromi to city toi with cost pricei. 
//
// You are also given three integers src, dst, and k, return the cheapest price 
//from src to dst with at most k stops. If there is no such route, return -1. 
//
// 
// Example 1: 
//
// 
//Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k =
// 1
//Output: 200
//Explanation: The graph is shown.
//The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as mar
//ked red in the picture.
// 
//
// Example 2: 
//
// 
//Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k =
// 0
//Output: 500
//Explanation: The graph is shown.
//The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as mar
//ked blue in the picture.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 100 
// 0 <= flights.length <= (n * (n - 1) / 2) 
// flights[i].length == 3 
// 0 <= fromi, toi < n 
// fromi != toi 
// 1 <= pricei <= 104 
// There will not be any multiple flights between two cities. 
// 0 <= src, dst, k < n 
// src != dst 
// 
// Related Topics Dynamic Programming Depth-First Search Breadth-First Search Gr
//aph Heap (Priority Queue) Shortest Path 
// 👍 3437 👎 136


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class CheapestFlightsWithinKStops_787 {

    
    
    @Test
    public void testCheapestFlightsWithinKStops(){
       Solution solution = new CheapestFlightsWithinKStops_787()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
