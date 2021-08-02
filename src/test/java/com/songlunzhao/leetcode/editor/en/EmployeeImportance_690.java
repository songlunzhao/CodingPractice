//You have a data structure of employee information, which includes the employee
//'s unique id, their importance value, and their direct subordinates' id. 
//
// You are given an array of employees employees where: 
//
// 
// employees[i].id is the ID of the ith employee. 
// employees[i].importance is the importance value of the ith employee. 
// employees[i].subordinates is a list of the IDs of the subordinates of the ith
// employee. 
// 
//
// Given an integer id that represents the ID of an employee, return the total i
//mportance value of this employee and all their subordinates. 
//
// 
// Example 1: 
//
// 
//Input: employees = [[1,5,[2,3]],[2,3,[]],[3,3,[]]], id = 1
//Output: 11
//Explanation: Employee 1 has importance value 5, and he has two direct subordin
//ates: employee 2 and employee 3.
//They both have importance value 3.
//So the total importance value of employee 1 is 5 + 3 + 3 = 11.
// 
//
// Example 2: 
//
// 
//Input: employees = [[1,2,[5]],[5,-3,[]]], id = 5
//Output: -3
// 
//
// 
// Constraints: 
//
// 
// 1 <= employees.length <= 2000 
// 1 <= employees[i].id <= 2000 
// All employees[i].id are unique. 
// -100 <= employees[i].importance <= 100 
// One employee has at most one direct leader and may have several subordinates.
// 
// id is guaranteed to be a valid employee id. 
// 
// Related Topics Hash Table Depth-First Search Breadth-First Search 
// 👍 1203 👎 992


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

public class EmployeeImportance_690 {

    
    
    @Test
    public void testEmployeeImportance(){
       Solution solution = new EmployeeImportance_690()
                        .new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
