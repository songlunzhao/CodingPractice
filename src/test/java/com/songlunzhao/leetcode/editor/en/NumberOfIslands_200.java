//Given an m x n 2D binary grid grid which represents
// a map of '1's (land) and '
//0's (water), return the number of islands. 
//
// An island is surrounded by water and is formed by connecting adjacent lands h
//orizontally or vertically. You may assume all four edges of the grid are all sur
//rounded by water. 
//
// 
// Example 1: 
//
// 
//Input: grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 300 
// grid[i][j] is '0' or '1'. 
// 
// Related Topics Array Depth-First Search Breadth-First Search Union Find Matri
//x 
// 👍 9476 👎 260


package com.songlunzhao.leetcode.editor.en;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands_200 {

    
    
    @Test
    public void testNumberOfIslands(){
       Solution solution = new NumberOfIslands_200()
                        .new Solution();


    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIslands(char[][] grid) {
        //Set<String> visited = new HashSet<>();
        int islands=0;
        for(int i=0; i<grid.length; i++ ){
            for(int j=0; j< grid[0].length;j++){
                //if(isIsland(grid,visited,i,j))
                if(isIsland(grid,i,j))
                    islands++;
            }
        }
        return islands;
    }

    boolean isIsland(char[][]grid, int row, int col){
        if(row<0||row>=grid.length ||col<0||col>=grid[0].length
        ||grid[row][col]=='0'||grid[row][col]=='2')
            return false;
//        String key=String.valueOf(row)+"-"+String.valueOf(col);
//        if(visited.contains(key)){
//            return false;
//        }
        grid[row][col]='2';
        isIsland(grid,row-1,col);
        isIsland(grid,row+1,col);
        isIsland(grid,row,col-1);
        isIsland(grid,row,col+1);
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
