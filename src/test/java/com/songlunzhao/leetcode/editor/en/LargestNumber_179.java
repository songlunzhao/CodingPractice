//Given a list of non-negative integers nums,
// arrange them such that they form the largest number.
//
// Note: The result may be very large, so you need to return a string instead of
// an integer. 
//
// 
// Example 1: 
//
// 
//Input: nums = [10,2]
//Output: "210"
// 
//
// Example 2: 
//
// 
//Input: nums = [3,30,34,5,9]
//Output: "9534330"
// 
//
// Example 3: 
//
// 
//Input: nums = [1]
//Output: "1"
// 
//
// Example 4: 
//
// 
//Input: nums = [10]
//Output: "10"
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 109 
// 
// Related Topics String Greedy Sorting 
// 👍 3450 👎 336


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.testng.Assert.assertEquals;

public class LargestNumber_179 {


    @Test
    public void testLargestNumber() {
        Solution solution = new LargestNumber_179()
                .new Solution();
        int[] input = new int[]{3, 30, 36, 34, 5, 9};
        String ans = solution.largestNumber(input);
        assertEquals(ans, "953634330");
        input = new int[]{432, 43243};
        ans = solution.largestNumber(input);
        assertEquals(ans, "43243432");
        input = new int[]{0, 0};
        ans = solution.largestNumber(input);
        assertEquals(ans, "0");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        class StringComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) return 0;
                if (o1.equals(o2)) {
                    return 0;
                }
                int len = Math.min(o1.length(), o2.length());
                for (int i = 0; i < len; i++) {
                    if (o1.charAt(i) < o2.charAt(i)) {
                        return -1;
                    } else if (o1.charAt(i) > o2.charAt(i)) {
                        return 1;
                    }
                }
                if (o1.length() > len) {
                    return compare(o1.substring(len), o2);
                } else {
                    return compare(o1, o2.substring(len));
                }
            }
        }

        public String largestNumber(int[] nums) {

            if (nums == null) return "";
            String[] sa = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                sa[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(sa, new StringComparator());
            String ans = "";
            for (int i = nums.length - 1; i >= 0; i--) {
                if(ans.equals("0") && sa[i].equals("0")){
                    continue;
                }
                ans = ans + sa[i];
            }
            return ans;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
