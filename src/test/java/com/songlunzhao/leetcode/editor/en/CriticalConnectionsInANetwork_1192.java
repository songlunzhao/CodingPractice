//There are n servers numbered from 0 to n - 1 connected by
// undirected server-to-server connections forming a network
// where connections[i] = [ai, bi] represents
// a connection between servers ai and bi. Any server can reach other servers
// directly or indirectly through the network.
//
// A critical connection is a connection that, if removed, will make some server
//s unable to reach some other server. 
//
// Return all critical connections in the network in any order. 
//
// 
// Example 1: 
//
// 
//
// 
//Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
//Output: [[1,3]]
//Explanation: [[3,1]] is also accepted.
// 
//
// 
// Constraints: 
//
// 
// 2 <= n <= 105 
// n - 1 <= connections.length <= 105 
// 0 <= ai, bi <= n - 1 
// ai != bi 
// There are no repeated connections. 
// 
// Related Topics Depth-First Search Graph Biconnected Component 
// 👍 2751 👎 127


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnectionsInANetwork_1192 {

    
    
    @Test
    public void testCriticalConnectionsInANetwork(){
       Solution solution = new CriticalConnectionsInANetwork_1192()
                        .new Solution();
       List<List<Integer>> connections = new ArrayList<>(){{
           add(Arrays.asList(new Integer[]{0,1}));
           add(Arrays.asList(new Integer[]{1,2}));
           add(Arrays.asList(new Integer[]{2,0}));
           add(Arrays.asList(new Integer[]{1,3}));
           add(Arrays.asList(new Integer[]{3,4}));
           add(Arrays.asList(new Integer[]{4,5}));
           add(Arrays.asList(new Integer[]{5,3}));
       }};
       List<List<Integer>> result = solution.criticalConnections(6,connections);
        PrintUtils.print2DIntegerList(result);
    }

    /**
     * 使用tarjan算法找出图中非强连通部分，将其加入ans中，最终返回ans。
     *
     * https://zhuanlan.zhihu.com/p/101923309
     *
     *
     * 时间戳是用来标记图中每个节点在进行深度优先搜索时被访问的时间顺序，
     * 当然，你可以理解成一个序号（这个序号由小到大），用 dfn[x] 来表示。
     *
     * 追溯值用来表示从当前节点 x 作为搜索树的根节点出发，能够访问到的所有节点中，
     * 时间戳最小的值 —— low[x]。
     *
     * 那么，我们要限定下什么是“能够访问到的所有节点”？，其需要满足下面的条件之一即可：
     * 以 x 为根的搜索树的所有节点
     * 通过一条非搜索树上的边，能够到达搜索树的所有节点
     *
     * 在一张无向图中，判断边 e （其对应的两个节点分别为 u 与 v）是否为桥，
     * 需要其满足如下条件即可：dfn[u] < low[v]
     */


    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //for an edge with node u,v (from u to v), if dfn[u]<low[v], u,v is a bridge
    //means to reach v from root, we have to go through u.
    int[] DFN; //DFN[i] the depth from root to node i
    int[] LOW; //LOW[i] the min depth from root to node i

    List<List<Integer>> result=new ArrayList<>();
    int t; //timestamp(sequence of a node when begin from root)
    List<Integer>[] edges;
    boolean[] visited;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        DFN = new int[n];
        LOW = new int[n];
        visited = new boolean[n];
        t=0;
        edges= new ArrayList[n];

        for(int i=0; i<n; i++){
            edges[i]=new ArrayList<>();
        }

        for(List<Integer> conn: connections){
            int n0=conn.get(0), n1=conn.get(1);
            edges[n0].add(n1);
            edges[n1].add(n0);
        }
        dfs(0,-1);
        return result;
    }

        /**
         *
         * @param cur current node
         * @param pre previous node
         */
    void dfs(int cur, int pre) {
        t++;
        LOW[cur]=t;
        DFN[cur]=t;
        visited[cur]=true;
        for(int node : edges[cur]){
            if(node==pre) continue;
            if(!visited[node]){
                dfs(node,cur);
                LOW[cur]=Math.min(LOW[cur], LOW[node]);
                if(DFN[cur]<LOW[node]){
                    result.add(new ArrayList<>(){{add(cur);add(node);}});
                }
            } else {
                LOW[cur]=Math.min(LOW[cur], DFN[node]);
            }
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}
