//Given n pairs of parentheses, write a function to
// generate all combinations of
// well-formed parentheses. 
//
// 
// Example 1: 
// Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2: 
// Input: n = 1
//Output: ["()"]
// 
// 
// Constraints: 
//
// 
// 1 <= n <= 8 
// 
// Related Topics String Dynamic Programming Backtracking 
// 👍 8552 👎 352


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.*;

public class GenerateParentheses_22 {


    @Test
    public void testGenerateParentheses() {
        Solution solution = new GenerateParentheses_22()
                .new Solution();
        List<String> ans = solution.generateParenthesis(3);
        System.out.println(Arrays.toString(ans.toArray()));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<>();
            dfs("",n,n,ans);
            return ans;
        }

        /**
         *
         * @param currentStr the current string, will be added a left or right parenthesis
         * @param left how many left parenthesis we can use
         * @param right how many right parenthesis we can use
         * @param ans answer
         */
        void dfs(String currentStr, int left, int right, List<String> ans) {
            if(left==0 && right==0) {
                ans.add(currentStr);
            }
            if(left>right) return;
            if(left>0) {
                dfs(currentStr+"(", left-1, right, ans);
            }
            if(right>0) {
                dfs(currentStr+")", left, right-1, ans);
            }
        }
//            public List<String> generateParenthesis(int n) {
//            Set<String> ans = new HashSet<>();
//            String dict = "";
//            for (int i = 0; i < n; i++) {
//                dict = dict + "()";
//            }
//            backtrack(dict, "", ans);
//
//            return new ArrayList<>(ans);
//        }
//
//        void backtrack(String dict, String result, Set<String> ans) {
//            if (dict.equals("")) {
//                ans.add(result);
//                return;
//            }
//
//            for (int i = 0; i < dict.length(); i++) {
//                if (dict.charAt(i)=='('||isValidParenthsis(result + dict.charAt(i))) {
//                    StringBuilder sb = new StringBuilder(dict);
//                    sb.deleteCharAt(i);
//                    backtrack(sb.toString(), result + dict.charAt(i), ans);
//                }
//            }
//        }
//
//        boolean isValidParenthsis(String s) {
//            if (s.equals(")")) return false;
//            Stack<Character> stack = new Stack<>();
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '(') {
//                    stack.push(s.charAt(i));
//                } else {
//                    if (stack.isEmpty()) {
//                        return false;
//                    } else {
//                        stack.pop();
//                    }
//                }
//            }
//            return true;
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
