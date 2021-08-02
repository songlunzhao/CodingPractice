//Given a file and assume that you can only read the file using a given method r
//ead4, implement a method read to read n characters. Your method read may be call
//ed multiple times. 
//
// Method read4: 
//
// The API read4 reads four consecutive characters from file, then writes those 
//characters into the buffer array buf4. 
//
// The return value is the number of actual characters read. 
//
// Note that read4() has its own file pointer, much like FILE *fp in C. 
//
// Definition of read4: 
//
// 
//    Parameter:  char[] buf4
//    Returns:    int
//
//buf4[] is a destination, not a source. The results from read4 will be copied t
//o buf4[].
// 
//
// Below is a high-level example of how read4 works: 
//
// 
//File file("abcde"); // File is "abcde", initially file pointer (fp) points to 
//'a'
//char[] buf4 = new char[4]; // Create buffer with enough space to store charact
//ers
//read4(buf4); // read4 returns 4. Now buf4 = "abcd", fp points to 'e'
//read4(buf4); // read4 returns 1. Now buf4 = "e", fp points to end of file
//read4(buf4); // read4 returns 0. Now buf4 = "", fp points to end of file
// 
//
// 
//
// Method read: 
//
// By using the read4 method, implement the method read that reads n characters 
//from file and store it in the buffer array buf. Consider that you cannot manipul
//ate file directly. 
//
// The return value is the number of actual characters read. 
//
// Definition of read: 
//
// 
//    Parameters:	char[] buf, int n
//    Returns:	int
//
//buf[] is a destination, not a source. You will need to write the results to bu
//f[].
// 
//
// Note: 
//
// 
// Consider that you cannot manipulate the file directly. The file is only acces
//sible for read4 but not for read. 
// The read function may be called multiple times. 
// Please remember to RESET your class variables declared in Solution, as static
///class variables are persisted across multiple test cases. Please see here for m
//ore details. 
// You may assume the destination buffer array, buf, is guaranteed to have enoug
//h space for storing n characters. 
// It is guaranteed that in a given test case the same buffer buf is called by r
//ead. 
// 
//
// 
// Example 1: 
//
// 
//Input: file = "abc", queries = [1,2,1]
//Output: [1,2,0]
//Explanation: The test case represents the following scenario:
//File file("abc");
//Solution sol;
//sol.read(buf, 1); // After calling your read method, buf should contain "a". W
//e read a total of 1 character from the file, so return 1.
//sol.read(buf, 2); // Now buf should contain "bc". We read a total of 2 charact
//ers from the file, so return 2.
//sol.read(buf, 1); // We have reached the end of file, no more characters can b
//e read. So return 0.
//Assume buf is allocated and guaranteed to have enough space for storing all ch
//aracters from the file.
// 
//
// Example 2: 
//
// 
//Input: file = "abc", queries = [4,1]
//Output: [3,0]
//Explanation: The test case represents the following scenario:
//File file("abc");
//Solution sol;
//sol.read(buf, 4); // After calling your read method, buf should contain "abc".
// We read a total of 3 characters from the file, so return 3.
//sol.read(buf, 1); // We have reached the end of file, no more characters can b
//e read. So return 0.
// 
//
// 
// Constraints: 
//
// 
// 1 <= file.length <= 500 
// file consist of English letters and digits. 
// 1 <= queries.length <= 10 
// 1 <= queries[i] <= 500 
// 
// Related Topics String Simulation Interactive 
// 👍 689 👎 1432


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class ReadNCharactersGivenRead4IiCallMultipleTimes_158 {

    
    
    @Test
    public void testReadNCharactersGivenRead4IiCallMultipleTimes(){
       Solution solution = new ReadNCharactersGivenRead4IiCallMultipleTimes_158()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4); 
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
