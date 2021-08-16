//There are a total of numCourses courses you have to take, labeled
// from 0 to numCourses - 1. You are given an array prerequisites
// where prerequisites[i] = [ai,bi] indicates that you must take course
// bi first if you want to take course ai.
// 
//
// 
// For example, the pair [0, 1], indicates that to take course 0 you have to fir
//st take course 1. 
// 
//
// Return the ordering of courses you should take to finish all courses.
// If there are many valid answers, return any of them. If it is impossible to finish all
//courses, return an empty array. 
//
// 
// Example 1: 
//
// 
//Input: numCourses = 2, prerequisites = [[1,0]]
//Output: [0,1]
//Explanation: There are a total of 2 courses to take. To take course 1 you shou
//ld have finished course 0. So the correct course order is [0,1].
// 
//
// Example 2: 
//
// 
//Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
//Output: [0,2,1,3]
//Explanation: There are a total of 4 courses to take. To take course 3 you shou
//ld have finished both courses 1 and 2. Both courses 1 and 2 should be taken afte
//r you finished course 0.
//So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3
//].
// 
//
// Example 3: 
//
// 
//Input: numCourses = 1, prerequisites = []
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= numCourses <= 2000 
// 0 <= prerequisites.length <= numCourses * (numCourses - 1) 
// prerequisites[i].length == 2 
// 0 <= ai, bi < numCourses 
// ai != bi 
// All the pairs [ai, bi] are distinct. 
// 
// Related Topics Depth-First Search Breadth-First Search Graph Topological Sort
// 
// 👍 4369 👎 181


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class CourseScheduleIi_210 {
    
    
    @Test
    public void testCourseScheduleIi(){
       Solution solution = new CourseScheduleIi_210()
                        .new Solution();
       int[][] input = new int[][]{{1,0},{2,0},{3,1},{3,2}};
        int[] output = solution.findOrder(4,input);
        PrintUtils.printArray(output);

        input = new int[][]{{1,0}};
        output = solution.findOrder(3,input);
        PrintUtils.printArray(output);

        output = solution.findOrder(2,input);
        PrintUtils.printArray(output);

        input = new int[][]{{0,1}};
        output = solution.findOrder(2,input);
        PrintUtils.printArray(output);

        input = new int[][]{{0,1},{0,2},{1,2}};
        //expected [2,1,0]
        output = solution.findOrder(3,input);
        PrintUtils.printArray(output);

        input = new int[][]{{1,4},{2,4},{3,1},{3,2}};
        output = solution.findOrder(5,input);
        PrintUtils.printArray(output);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {



    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(prerequisites==null || prerequisites.length==0) {
            int[]ret =new int[numCourses];
            for(int i=0; i<ret.length; i++){
                ret[i]=i;
            }
            return ret;
        }

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
            if(queue.isEmpty()) return new int[]{};
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

            if(result.size()<numCourses) return new int[]{};
            int[]ret = new int[result.size()];
            for(int i=0; i<result.size(); i++){
                ret[i]=result.get(i);
            }

        return ret;
    }




}
//leetcode submit region end(Prohibit modification and deletion)

}
