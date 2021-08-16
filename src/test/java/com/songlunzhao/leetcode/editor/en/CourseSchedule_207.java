//There are a total of numCourses courses you have to take, labeled from 0 to nu
//mCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai,
// bi] indicates that you must take course bi first if you want to take course ai.
// 
//
// 
// For example, the pair [0, 1], indicates that to take course 0 you have to fir
//st take course 1. 
// 
//
// Return true if you can finish all courses. Otherwise, return false. 
//
// 
// Example 1: 
//
// 
//Input: numCourses = 2, prerequisites = [[1,0]]
//Output: true
//Explanation: There are a total of 2 courses to take. 
//To take course 1 you should have finished course 0. So it is possible.
// 
//
// Example 2: 
//
// 
//Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
//Output: false
//Explanation: There are a total of 2 courses to take. 
//To take course 1 you should have finished course 0, and to take course 0 you s
//hould also have finished course 1. So it is impossible.
// 
//
// 
// Constraints: 
//
// 
// 1 <= numCourses <= 105 
// 0 <= prerequisites.length <= 5000 
// prerequisites[i].length == 2 
// 0 <= ai, bi < numCourses 
// All the pairs prerequisites[i] are unique. 
// 
// Related Topics Depth-First Search Breadth-First Search Graph Topological Sort
// 
// 👍 6790 👎 282


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class CourseSchedule_207 {

    
    
    @Test
    public void testCourseSchedule(){
       Solution solution = new CourseSchedule_207()
                        .new Solution();
        int[][] input = new int[][]{{1,4},{2,4},{3,1},{3,2}};
        boolean ans = solution.canFinish(5,input);
        assertEquals(ans,true);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites==null || prerequisites.length==0) return true;
        //for each course, how many prerequisites
        int[]indegree = new int[numCourses];
        //add courses to a graph map
        //key - course number, val - neighbors
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<numCourses; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i=0; i< prerequisites.length; i++){
            int src = prerequisites[i][1];
            int dest = prerequisites[i][0];
            map.get(src).add(dest);
            indegree[dest]=indegree[dest]+1;
        }
        //course without any prerequisites

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i< indegree.length; i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        //all course have prerequisites
        if(queue.isEmpty()) return false;
        boolean[]visited = new boolean[map.size()];

        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            int i = queue.poll();
            if(!visited[i]){
                result.add(i);
                //queue.addAll(map.get(i));
                // add children to queue by indegree ascending order
                if (map.containsKey(i)) {
                    for (Integer neighbor : map.get(i)) {
                        indegree[neighbor]--;

                        // If in-degree of a neighbor becomes 0, add it to the Q
                        if (indegree[neighbor] == 0) {
                            queue.add(neighbor);
                        }
                    }
                }
                visited[i]=true;
            }
        }

        if(result.size()<numCourses) return false;
        return true;
//        int[]ret = new int[result.size()];
//        for(int i=0; i<result.size(); i++){
//            ret[i]=result.get(i);
//        }
//
//        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
