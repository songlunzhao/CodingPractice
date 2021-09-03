//There are n cities. Some of them are connected,
// while some are not. If city a
//is connected directly with city b,
// and city b is connected directly with city c,
// then city a is connected indirectly with city c. 
//
// A province is a group of directly or indirectly connected cities and no other
// cities outside of the group. 
//
// You are given an n x n matrix isConnected where isConnected[i][j] = 1
// if the
//ith city and the jth city are directly connected,
// and isConnected[i][j] = 0 otherwise.
//
// Return the total number of provinces. 
//
// 
// Example 1: 
//
// 
//Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 200 
// n == isConnected.length 
// n == isConnected[i].length 
// isConnected[i][j] is 1 or 0. 
// isConnected[i][i] == 1 
// isConnected[i][j] == isConnected[j][i] 
// 
// Related Topics Depth-First Search Breadth-First Search Union Find Graph 
// 👍 3471 👎 196


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class NumberOfProvinces_547 {

    
    
    @Test
    public void testNumberOfProvinces(){
       Solution solution = new NumberOfProvinces_547()
                        .new Solution();
    }

    /**
     *
     * https://blog.csdn.net/xueyingxue001/article/details/52946111
     *
     *
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findCircleNum(int[][] isConnected) {

        //return getProvincesUsingDFS(isConnected);

        return getProvincesUsingUnionFind(isConnected);
    }

    private int getProvincesUsingUnionFind(int[][] isConnected){
        int provinces=0;
        int[] parent = new int[isConnected.length];
        //init the parent array, each city use itself as parent
        for(int i=0; i< parent.length; i++) {
            parent[i] = i;
        }
        //union connected cities
        connected(isConnected, parent);
        //count not connected cities
        for(int i=0; i< parent.length; i++) {
            if(parent[i] == i) {
                provinces++;
            }
        }
        return provinces;
    }

    private int getProvincesUsingDFS(int[][] isConnected){
        int provinces=0;
        //it is a n*n matrix, because there are n cities connected to each other
        //in the matrix, row n shows city n connected to what cities
        boolean[]visitedCity=new boolean[isConnected.length];

        for(int i=0; i<isConnected.length; i++ ){
            if(!visitedCity[i]){
                provinces++;
                visitedCity[i]=true;
                connected(isConnected, visitedCity, i);
            }
        }
        return provinces;
    }

        /**
         * 计算连通分量数的另一个方法是使用并查集。初始时，每个城市都属于不同的连通分量。
         * 遍历矩阵 isConnected，如果两个城市之间有相连关系，则它们属于同一个连通分量，
         * 对它们进行合并。
         *
         * 遍历矩阵 isConnected 的全部元素之后，计算连通分量的总数，即为省份的总数。
         *
         *
         * @param isConnected
         * @param parent
         */
    void connected(int[][]isConnected, int[]parent){
        for(int i=0; i<isConnected.length; i++){
            for(int j=0; j< isConnected[i].length && j!=i; j++) {
                if(isConnected[i][j]==1){
                    union(parent,i,j);
                }
            }
        }
    }

    //connect idx1 to idx2 if idx1 & idx2 has same parent(root)
    public void union(int[]parent, int idx1, int idx2){
        //node idx1 & node idx2 should have same root node
        parent[findParent(parent,idx1)] = findParent(parent,idx2);
    }

        /**
         * find the parent(root node) of node(idx)
         * @param parent
         * @param idx
         * @return root of node idx
         */
    int findParent(int[] parent, int idx){
        if(parent[idx]!=idx){
            parent[idx]=findParent(parent,parent[idx]);
        }
        return parent[idx];
    }


        /**
         * use DFS to check if 2 cities are connected
         * @param isConnected
         * @param visitedCity
         * @param i -- index of current city
         */
        void connected(int[][]isConnected, boolean[]visitedCity, int i){
           //go through matrix, mark all cities connected to city i as visited
           for(int j=0;j< isConnected[i].length;j++){
               if(isConnected[i][j]==1 && !visitedCity[j]){
                   visitedCity[j]=true;
                   connected(isConnected,visitedCity,j);
               }
           }
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
