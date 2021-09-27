//In this problem, a tree is an undirected graph
// that is connected and has no cycles.
//
// You are given a graph that started as a tree with n nodes labeled from 1 to n
//, with one additional edge added. The added edge has two different vertices
// chosen from 1 to n, and was not an edge that already existed. The graph is represent
//ed as an array edges of length n where edges[i] = [ai, bi] indicates that there 
//is an edge between nodes ai and bi in the graph. 
//
// Return an edge that can be removed so that the resulting graph is a tree of n
// nodes. If there are multiple answers, return the answer that occurs last in the
// input. 
//
// 
// Example 1: 
//
// 
//Input: edges = [[1,2],[1,3],[2,3]]
//Output: [2,3]
// 
//
// Example 2: 
//
// 
//Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
//Output: [1,4]
// 
//
// 
// Constraints: 
//
// 
// n == edges.length 
// 3 <= n <= 1000 
// edges[i].length == 2 
// 1 <= ai < bi <= edges.length 
// ai != bi 
// There are no repeated edges. 
// The given graph is connected. 
// 
// Related Topics Depth-First Search Breadth-First Search Union Find Graph 
// 👍 2811 👎 272


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class RedundantConnection_684 {

    
    
    @Test
    public void testRedundantConnection(){
       Solution solution = new RedundantConnection_684()
                        .new Solution();
       int[][]edges = new int[][]{
           {1,2},
           {1,3},
           {2,3}
       };
       int[] result = solution.findRedundantConnection(edges);
        PrintUtils.printArray(result);
    }

    /**
     *
     *
     * https://blog.csdn.net/xueyingxue001/article/details/52946111
     *
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findRedundantConnection(int[][] edges) {

//        return findRedundantUsingDFS(edges);
        return findRedundantUsingUnionFind(edges);
    }

    private int[] findRedundantUsingDFS(int[][] edges) {
        Set<Integer> visited = new HashSet<>();
        //key - node, value -- connected node list
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        //add edges into graph
        for(int[] edge: edges){
            if(graph.containsKey(edge[0])){
                graph.get(edge[0]).add(edge[1]);
            } else {
                Set<Integer> l = new HashSet<>();
                l.add(edge[1]);
                graph.put(edge[0],l);
            }
            if(graph.containsKey(edge[1])){
                graph.get(edge[1]).add(edge[0]);
            } else {
                Set<Integer> l = new HashSet<>();
                l.add(edge[0]);
                graph.put(edge[1],l);
            }
        }

        List<int[]> result = new ArrayList<>();
        for(int[] edge: edges) {
            graph.get(edge[0]).remove(edge[1]);
            graph.get(edge[1]).remove(edge[0]);
            if(isConnctedDFS(graph, new HashSet<>(), edge[0], edge[1])){
                result.add(edge);
            }
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return result.get(result.size()-1);
    }

        /**
         * check if start & end are connected using DFS
          * @param graph
         * @param visited
         * @param start
         * @param end
         * @return
         */
    private boolean isConnctedDFS(Map<Integer, Set<Integer>> graph, Set<Integer> visited, int start, int end) {
        if(start==end) return true;
        if(!visited.contains(start)) {
            visited.add(start);
            if(graph.containsKey(start)){
                for(Integer node : graph.get(start)){
                    if(isConnctedDFS(graph, visited, node, end)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


        /**
         * 如果两个顶点属于不同的连通分量，则说明在遍历到当前的边之前，这两个顶点之间不连通，
         * 因此当前的边不会导致环出现，合并这两个顶点的连通分量。
         *
         * 如果两个顶点属于相同的连通分量，则说明在遍历到当前的边之前，这两个顶点之间已经连通，
         * 因此当前的边导致环出现，为附加的边，将当前的边作为答案返回。
         *
         * 时间复杂度：O(N \log N)O(NlogN)，其中 N 是图中的节点个数。需要遍历图中的 N 条边，
         * 对于每条边，需要对两个节点查找祖先，如果两个节点的祖先不同则需要进行合并，
         * 需要进行 2 次查找和最多 1 次合并。一共需要进行 2N次查找O(2NlogN)和最多 N 次合并 (O(N))，
         * 因此总时间复杂度是 O(2N \log N)=O(N \log N)O(2NlogN)=O(NlogN)。这里的并查集使用了路径压缩，但是没有使用按秩合并，最坏情况下的时间复杂度是 O(N \log N)O(NlogN)，平均情况下的时间复杂度依然是 O(N \alpha (N))O(Nα(N))，其中 \alphaα 为阿克曼函数的反函数，\alpha (N)α(N) 可以认为是一个很小的常数。
         *
         * 空间复杂度：O(N)，其中 N 是图中的节点个数。使用数组 parent 记录每个节点的祖先。
         *
         *
         */
    private int[] findRedundantUsingUnionFind(int[][] edges) {
        List<int[]> result = new ArrayList<>();
        int [] parent = new int[edges.length+1];//input value start from 1 not 0
        for(int i=0; i<= edges.length; i++){
            //node i's parent is itself
            parent[i]=i;
        }
        for(int[] edge :edges){
            if(findParent(parent, edge[0])!=findParent(parent, edge[1])){
                //edge[0] && edge[1] belongs to same edge, means they have same parent(root)
                //but findParent returns different parents for these 2 nodes, that is why
                //we want to connect them (union) together so they will have same parent.
                union(parent, edge[0], edge[1]);
            } else {
                result.add(edge);
            }
        }
        return result.get(result.size()-1);
    }

    private void union(int[] parent, int node1, int node2){
        //union root of node1 and root of node2
        //root1 = findParent(parent, node1)
        //root2 = findParent(parent, node2)
        //parent[root1]=root2
        //3 statement written in 1 statement as following
        parent[findParent(parent, node1)]=findParent(parent,node2);
    }

    int findParent(int[] parent, int node) {
        if(parent[node]!=node){
            //node is connected to another node
            //recursive find until find root
            parent[node]=findParent(parent, parent[node]);
        }
        return parent[node];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
