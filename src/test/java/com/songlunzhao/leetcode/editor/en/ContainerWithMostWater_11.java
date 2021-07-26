//Given n non-negative integers a1, a2, ..., an ,
// where each represents a point
//at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of
// the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x
//-axis forms a container, such that the container contains the most water. 
//
// Notice that you may not slant the container. 
//
// 
// Example 1: 
//
// 
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,
//3,7]. In this case, the max area of water (blue section) the container can conta
//in is 49.
// 
//
// Example 2: 
//
// 
//Input: height = [1,1]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: height = [4,3,2,1,4]
//Output: 16
// 
//
// Example 4: 
//
// 
//Input: height = [1,2,1]
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// n == height.length 
// 2 <= n <= 105 
// 0 <= height[i] <= 104 
// 
// Related Topics Array Two Pointers 
// 👍 9991 👎 734


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContainerWithMostWater_11 {

//    public static void main(String[] args) {
//        Solution solution = new ContainerWithMostWater_11()
//                        .new Solution();
//    }

    @Test
    public void testmaxArea() {
        Solution solution = new ContainerWithMostWater_11()
                .new Solution();
        int [] height = new int[] {1,8,6,2,5,4,8,3,7};
        int max = solution.maxArea(height);
        assertEquals(max, 49);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length<=1) return 0;
        int left=0, right= height.length-1;
        int max=0;
        while(left<right){
            int contain = Math.min(height[left], height[right]) * (right-left);
            max=Math.max(contain,max);
            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
