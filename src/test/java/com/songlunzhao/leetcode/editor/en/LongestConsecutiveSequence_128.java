//Given an unsorted array of integers nums,
// return the length of the longest consecutive elements sequence.
//
// You must write an algorithm that runs in O(n) time. 
//
// 
// Example 1: 
//
// 
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Theref
//ore its length is 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
// 
//
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// 
// Related Topics Array Hash Table Union Find 
// 👍 6307 👎 293


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence_128 {

    
    
    @Test
    public void testLongestConsecutiveSequence(){
       Solution solution = new LongestConsecutiveSequence_128()
                        .new Solution();
       System.out.println("test");
    }


    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        /**
         * 增加了判断跳过的逻辑之后，时间复杂度是多少呢？外层循环需要 O(n)
         * O(n) 的时间复杂度，只有当一个数是连续序列的第一个数的情况下才会进入内层循环，
         * 然后在内层循环中匹配连续序列中的数，因此数组中的每个数只会进入内层循环一次。
         * 根据上述分析可知，总时间复杂度为 O(n)O(n)，符合题目要求。
         *
         */
        //method 1: 找前驱数
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int i: nums){
                set.add(i);
            }
            int maxCount=0;
            for(int i: set){
                if(!set.contains(i-1)){
                    //when i is the smallest number in a sequence
                    int count=1;
                    int c=i;
                    while(set.contains(c+1)){
                        c++;
                        count++;
                    }
                    maxCount=Math.max(count,maxCount);
                }
            }
        return maxCount;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
