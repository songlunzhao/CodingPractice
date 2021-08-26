//An attendance record for a student can be represented as a string where each c
//haracter signifies whether the student was absent, late, or present on that day.
// The record only contains the following three characters: 
//
// 
// 'A': Absent. 
// 'L': Late. 
// 'P': Present. 
// 
//
// Any student is eligible for an attendance award if they meet both of the foll
//owing criteria: 
//
// 
// The student was absent ('A') for strictly fewer than 2 days total. 
// The student was never late ('L') for 3 or more consecutive days. 
// 
//
// Given an integer n, return the number of possible attendance records of lengt
//h n that make a student eligible for an attendance award. The answer may be very
// large, so return it modulo 109 + 7. 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: 8
//Explanation: There are 8 records with length 2 that are eligible for an award:
//
//"PP", "AP", "PA", "LP", "PL", "AL", "LA", "LL"
//Only "AA" is not eligible because there are 2 absences (there need to be fewer
// than 2).
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: 3
// 
//
// Example 3: 
//
// 
//Input: n = 10101
//Output: 183236316
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 105 
// 
// Related Topics Dynamic Programming 
// 👍 803 👎 143


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class StudentAttendanceRecordIi_552 {

    
    
    @Test
    public void testStudentAttendanceRecordIi(){
       Solution solution = new StudentAttendanceRecordIi_552()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int checkRecord(int n) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
