//Given n non-negative integers representing an elevation map
// where the width of
// each bar is 1, compute how much water it can trap after raining. 
//
// 
// Example 1: 
//
// 
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [
//0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are
// being trapped.
// 
//
// Example 2: 
//
// 
//Input: height = [4,2,0,3,2,5]
//Output: 9
// 
//
// 
// Constraints: 
//
// 
// n == height.length 
// 0 <= n <= 3 * 104 
// 0 <= height[i] <= 105 
// 
// Related Topics Array Two Pointers Dynamic Programming Stack Monotonic Stack 
// 👍 12404 👎 177


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class TrappingRainWater_42 {

    
    
    @Test
    public void testTrappingRainWater(){
       Solution solution = new TrappingRainWater_42()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        if(height==null||height.length<=2) return 0;
        int ans=0,left=0,right= height.length-1, maxLeft=0,maxRight=0;
        while(left<right){
            //the current position height < height[right],
            //the current containing water = Math.min(maxLeft,height[right]) - height[left]
            //left and right pointer always pointed to maxLeft and maxRight of current position
            if(height[left]<height[right]){
                if(height[left]>maxLeft){
                    maxLeft=height[left];
                } else {
                    //ans=ans+Math.min(maxLeft,height[right]) - height[left];
                    //maxLeft must less than height[right],
                    //because previous left less than height[right]
                    ans=ans+maxLeft-height[left];
                }
                left++;
            } else {
                //the current position height < height[left],
                //the current containing water = Math.min(maxLeft,height[right]) - height[left]
                if(height[right]>maxRight){
                    maxRight=height[right];
                } else {
                    ans=ans+maxRight-height[right];
                }
                right--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
