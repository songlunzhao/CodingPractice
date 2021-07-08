//Given a string containing just the characters '(' and ')',
// find the length of
//the longest valid (well-formed) parentheses substring. 
//
// 
// Example 1: 
//
// 
//Input: s = "(()"
//Output: 2
//Explanation: The longest valid parentheses substring is "()".
// 
//
// Example 2: 
//
// 
//Input: s = ")()())"
//Output: 4
//Explanation: The longest valid parentheses substring is "()()".
// 
//
// Example 3: 
//
// 
//Input: s = ""
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 3 * 104 
// s[i] is '(', or ')'. 
// 
// Related Topics String Dynamic Programming Stack 
// 👍 5562 👎 194


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.testng.Assert.assertEquals;

public class LongestValidParentheses_32 {

    
    
    @Test
    public void testLongestValidParentheses(){
       Solution solution = new LongestValidParentheses_32()
                        .new Solution();
       assertEquals(solution.longestValidParentheses("()(()"),2);
        assertEquals(solution.longestValidParentheses("(())())"),6);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 对于这种括号匹配问题，一般都是使用栈
     *
     * 我们先找到所有可以匹配的索引号，然后找出最长连续数列！
     *
     * 例如：s = )(()())，我们用栈可以找到，
     *
     * 位置 2 和位置 3 匹配，
     *
     * 位置 4 和位置 5 匹配，
     *
     * 位置 1 和位置 6 匹配，
     *
     * 这个数组为：2,3,4,5,1,6 这是通过栈找到的，我们按递增排序！1,2,3,4,5,6
     *
     * 找出该数组的最长连续数列的长度就是最长有效括号长度！
     *
     * 所以时间复杂度来自排序：O(nlogn)O(nlogn)。
     *
     * 接下来我们思考，是否可以省略排序的过程,在弹栈时候进行操作呢?
     *
     * 直接看代码理解!所以时间复杂度为：O(n)O(n)。
     *
     * 作者：powcai
     * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses/solution/zui-chang-you-xiao-gua-hao-by-powcai/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    class Solution {
    public int longestValidParentheses(String s) {
        if(s==null||s.equals("")) return 0;
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int maxLen=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.add(i);
            } else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.add(i);
                } else {
                    int idx = stack.peek(); //the index of first unmatched parentheses
                    maxLen = Math.max(maxLen, i-idx);
                }
            }
        }
        return maxLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
