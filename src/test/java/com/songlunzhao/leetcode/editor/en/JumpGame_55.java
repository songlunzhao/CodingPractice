//You are given an integer array nums. You are initially
// positioned at the array's first index, and each element in the array
// represents your maximum jump length at that position.
//
// Return true if you can reach the last index, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jum
//p length is 0, which makes it impossible to reach the last index.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 104 
// 0 <= nums[i] <= 105 
// 
// Related Topics Array Dynamic Programming Greedy 
// 👍 7372 👎 457


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JumpGame_55 {

    
    
    @Test
    public void testJumpGame(){
       Solution solution = new JumpGame_55()
                        .new Solution();
       int[]nums = new int[] {3,2,1,0,4};
       assertEquals(solution.canJump(nums),false);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public boolean canJump(int[] nums) {
            if(nums==null||nums.length<=1) return true;
            //rightMost index
            int rightMost=0;
            for(int i=0; i<nums.length;i++){
                if(i<=rightMost){
                    rightMost=Math.max(rightMost,nums[i]+i);
                }
                if(rightMost>= nums.length-1) return true;
            }
            return false;
        }

        //kind of backtrack
    public boolean canJump_backtrack(int[] nums) {
        if(nums==null || nums.length<=1) return true;
        boolean visited[]=new boolean[nums.length];

        for(int step=nums[0]; step>=1; step--){
            if(jump(nums,0,step,visited))return true;
        }
        return false;
    }


    private boolean jump(int[]nums,int start, int step, boolean[]visited){
        int idx = start+step;
        if(idx==nums.length-1) return true;
        if(idx>=nums.length) return true;
        if(visited[idx]) return false;
        for(int s=nums[idx]; s>=1; s--){
            if(jump(nums,idx,s, visited))return true;
        }
        visited[idx]=true;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
