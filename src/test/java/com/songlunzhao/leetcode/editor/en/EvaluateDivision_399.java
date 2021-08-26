//You are given an array of variable pairs equations
// and an array of real numbers values,
// where equations[i] = [Ai, Bi] and values[i] represent the equation Ai
/// Bi = values[i]. Each Ai or Bi is a string that represents a single variable. 
//
// You are also given some queries, where queries[j] = [Cj, Dj] represents the j
//th query where you must find the answer for Cj / Dj = ?. 
//
// Return the answers to all queries. If a single answer cannot be determined, return -1.0.
//
// Note: The input is always valid. You may assume that evaluating the queries w
//ill not result in division by zero and that there is no contradiction. 
//
// 
// Example 1: 
//
// 
//Input: equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a",
//"c"],["b","a"],["a","e"],["a","a"],["x","x"]]
//Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000]
//Explanation: 
//Given: a / b = 2.0, b / c = 3.0
//queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
//return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
// 
//
// Example 2: 
//
// 
//Input: equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], 
//queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
//Output: [3.75000,0.40000,5.00000,0.20000]
// 
//
// Example 3: 
//
// 
//Input: equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"]
//,["a","c"],["x","y"]]
//Output: [0.50000,2.00000,-1.00000,-1.00000]
// 
//
// 
// Constraints: 
//
// 
// 1 <= equations.length <= 20 
// equations[i].length == 2 
// 1 <= Ai.length, Bi.length <= 5 
// values.length == equations.length 
// 0.0 < values[i] <= 20.0 
// 1 <= queries.length <= 20 
// queries[i].length == 2 
// 1 <= Cj.length, Dj.length <= 5 
// Ai, Bi, Cj, Dj consist of lower case English letters and digits. 
// 
// Related Topics Array Depth-First Search Breadth-First Search Union Find Graph
// Shortest Path 
// 👍 3905 👎 307


package com.songlunzhao.leetcode.editor.en;
import com.songlunzhao.leetcode.editor.en.common.PrintUtils;
import org.testng.annotations.Test;

import java.util.*;

public class EvaluateDivision_399 {

    
    
    @Test
    public void testEvaluateDivision(){
       Solution solution = new EvaluateDivision_399()
                        .new Solution();
       List<List<String>> equations = new ArrayList<>();
       List<String> eq0= Arrays.asList(new String[]{"a","b"});
       List<String> eq1= Arrays.asList(new String[]{"b","c"});
       equations.add(eq0);
       equations.add(eq1);
       double[] values = new double[]{2.0,3.0};
       List<List<String>> queries = new ArrayList<>();
       List<String> q0 = Arrays.asList(new String[]{"a","c"});
       List<String> q1 = Arrays.asList(new String[]{"b","a"});
       List<String> q2 = Arrays.asList(new String[]{"a","e"});
       List<String> q3 = Arrays.asList(new String[]{"a","a"});
       List<String> q4 = Arrays.asList(new String[]{"x","x"});
       queries.add(q0);
       queries.add(q1);
       queries.add(q2);
       queries.add(q3);
       queries.add(q4);
       double[] result = solution.calcEquation(equations,values,queries);
       PrintUtils.printArray(result);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        class Node {
            String var;
            double value;

            Node(String var, double value) {
                this.var = var;
                this.value = value;
            }
        }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        //think about all equations as a map, each node has a var, all other var linked to this var

        //key-var, value- all other vars linked to the key var in equations
        Map<String, List<Node>> variableMap = new HashMap<>();
        for(int i=0; i<equations.size();i++){
            //save equations into edges array
            String var1= equations.get(i).get(0);
            String var2= equations.get(i).get(1);
            //values[i] = ai/bi;
            if(variableMap.containsKey(var1)){
                variableMap.get(var1).add(new Node(var2,values[i]));
            } else {
                List<Node> l = new ArrayList<>();
                l.add(new Node(var2, values[i]));
                variableMap.put(var1,l);
            }

            if(variableMap.containsKey(var2)){
                variableMap.get(var2).add(new Node(var1,1.0/values[i]));
            } else {
                List<Node> l = new ArrayList<>();
                l.add(new Node(var1, 1.0/values[i]));
                variableMap.put(var2,l);
            }

        }

        int querySize = queries.size();
        double[] ret = new double[querySize];
        for(int i=0; i<querySize; i++){
            List<String> query = queries.get(i);
            ret[i]=-1;
            double result=-1;
            String ai=query.get(0);
            String bi=query.get(1);
            if(!variableMap.containsKey(ai) || !variableMap.containsKey(bi)) continue;
            if(ai.equals(bi)){
                result=1;
            } else {
                //use BFS to calculate the edge value between qVar1 & qVar2
                Queue<String> queue = new LinkedList<>();
                queue.add(ai);
                Set<String> visited = new HashSet<>();
                //key - current variable,
                //value -- calculated value from ai to current variable
                Map<String, Double> quotientMap = new HashMap<>();
                quotientMap.put(ai,1.0);
                while(!queue.isEmpty()){
                    String var =queue.poll();
                    visited.add(var);
                    for(Node node: variableMap.get(var)){
                        if(!visited.contains(node.var)){
                            //calculate var/node.var
                            //node.value = a/b
                            quotientMap.put(node.var, quotientMap.get(var)*node.value);
                            queue.add(node.var);
                        }
                    }
                }
                if(quotientMap.containsKey(bi)){
                    result=quotientMap.get(bi);
                }

            }
            ret[i]=result;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
