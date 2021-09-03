//There are n cities numbered from 1 to n. 
//
// You are given connections, where each connections[i] = [city1, city2, cost] r
//epresents the cost to connect city1 and city2 together. (A connection is bidirec
//tional: connecting city1 and city2 is the same as connecting city2 and city1.) 
//
// Return the minimum cost so that for every pair of cities, there exists a path
// of connections (possibly of length 1) that connects those two cities together. 
//The cost is the sum of the connection costs used. If the task is impossible, ret
//urn -1. 
//
// 
//
// Example 1: 
//
// 
//
// 
//Input: n = 3, connections = [[1,2,5],[1,3,6],[2,3,1]]
//Output: 6
//Explanation: 
//Choosing any 2 edges will connect all cities so we choose the minimum 2.
// 
//
// Example 2: 
//
// 
//
// 
//Input: n = 4, connections = [[1,2,3],[3,4,4]]
//Output: -1
//Explanation: 
//There is no way to connect all cities even if all edges are used.
// 
//
// 
//
// Note: 
//
// 
// 1 <= n <= 10000 
// 1 <= connections.length <= 10000 
// 1 <= connections[i][0], connections[i][1] <= n 
// 0 <= connections[i][2] <= 105 
// connections[i][0] != connections[i][1] 
// 
// Related Topics Union Find Graph Heap (Priority Queue) Minimum Spanning Tree 
// 👍 588 👎 29


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ConnectingCitiesWithMinimumCost_1135 {


    @Test
    public void testConnectingCitiesWithMinimumCost() {
        Solution solution = new ConnectingCitiesWithMinimumCost_1135()
            .new Solution();
        int[][]input = new int[][]{
            {1,2,5},
            {1,3,6},
            {2,3,1}
        };
        int result = solution.minimumCost(3,input);
        assertEquals(result,6);
        input=new int[][]{
            {1,2,3},
            {3,4,4}
        };
        result = solution.minimumCost(4,input);
        assertEquals(result,-1);
    }

    /**
     * 最小生成树
     * Kruskal's algorithm finds a minimum spanning forest
     * <p>
     * 假设给定图中有N个顶点，那个最小生成树有N-1条边，算法的主要步骤
     * <p>
     * step 1: 按每条边权重的大小从小到大对所有边进行排序。
     * step 2: 选择权重最小的边。 检查它和当前的生成树是否构成环？ 如果没有构成环，则包括此边。 否则，丢弃它。
     * 重复步骤＃2，直到生成树中有(N-1)条边。
     * 我们可以通过并查集来检查是不是有环。
     * <p>
     * <p>
     * https://www.geeksforgeeks.org/kruskals-minimum-spanning-tree-algorithm-greedy-algo-2/
     * https://blog.csdn.net/qq_17550379/article/details/97616811
     * https://blog.csdn.net/qq_17550379/article/details/97617160
     */


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumCost(int n, int[][] connections) {
            int result=0;
            int[] parent = new int[n+1];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            Arrays.sort(connections, Comparator.comparingInt(o -> o[2]));

            int i=0;
            int edge = 0;
            //Kruskal's algorithm to find minimum spanning tree

            while(edge<n-1){
                //build MST until the tree has n-1 edges
                if(i==connections.length) return -1;//impossible to find answer
                int[] conn = connections[i];
                if(findParent(parent, conn[0])!=findParent(parent, conn[1])){
                    edge++;
                    union(parent, conn[0], conn[1]);//merge two nodes to one root,so won't have loop
                    result = result + conn[2];
                }
                i++;

            }

            return result;
        }


        void union(int[] parent, int idx1, int idx2) {
            //merge indx1 & idx2 under one root
            parent[findParent(parent, idx1)] = findParent(parent, idx2);

        }

        //union find with path compression
        // (while obtaining the root, we assign grandparent as parent of a node idx )
        int findParent(int[] parent, int idx) {
            if (parent[idx] != idx) {
                parent[idx] = findParent(parent, parent[idx]);

            }

            return parent[idx];
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
