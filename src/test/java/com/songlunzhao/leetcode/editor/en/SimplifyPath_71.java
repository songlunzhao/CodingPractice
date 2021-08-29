//Given a string path,
// which is an absolute path (starting with a slash '/') to
//a file or directory in a Unix-style file system,
// convert it to the simplified canonical path.
//
// In a Unix-style file system, a period '.' refers to the current directory, a 
//double period '..' refers to the directory up a level, and any multiple consecut
//ive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any
// other format of periods such as '...' are treated as file/directory names. 
//
// The canonical path should have the following format: 
//
// 
// The path starts with a single slash '/'. 
// Any two directories are separated by a single slash '/'. 
// The path does not end with a trailing '/'. 
// The path only contains the directories on the path from the root directory to
// the target file or directory (i.e., no period '.' or double period '..') 
// 
//
// Return the simplified canonical path. 
//
// 
// Example 1: 
//
// 
//Input: path = "/home/"
//Output: "/home"
//Explanation: Note that there is no trailing slash after the last directory nam
//e.
// 
//
// Example 2: 
//
// 
//Input: path = "/../"
//Output: "/"
//Explanation: Going one level up from the root directory is a no-op, as the roo
//t level is the highest level you can go.
// 
//
// Example 3: 
//
// 
//Input: path = "/home//foo/"
//Output: "/home/foo"
//Explanation: In the canonical path, multiple consecutive slashes are replaced 
//by a single one.
// 
//
// Example 4: 
//
// 
//Input: path = "/a/./b/../../c/"
//Output: "/c"
// 
//
// 
// Constraints: 
//
// 
// 1 <= path.length <= 3000 
// path consists of English letters, digits, period '.', slash '/' or '_'. 
// path is a valid absolute Unix path. 
// 
// Related Topics String Stack 
// 👍 685 👎 182


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Stack;

public class SimplifyPath_71 {

    
    
    @Test
    public void testSimplifyPath(){
       Solution solution = new SimplifyPath_71()
                        .new Solution();
       String path = solution.simplifyPath("/home//foo/");
       System.out.println(path);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        if(path==null || path.length()==0) return "";
        String[]names = path.split("/");
        Stack<String> s = new Stack<>();
        for(int i=0; i<names.length; i++){
            if(names[i].equals(".")||names[i].equals("")) continue;
            if(names[i].equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            } else {
                s.push(names[i]);
            }
        }
        if(s.isEmpty()) return "/";
        String result="";
        while(!s.isEmpty()){
            result = "/"+s.pop()+result;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
