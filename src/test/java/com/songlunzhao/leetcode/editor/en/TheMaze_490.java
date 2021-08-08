//There is a ball in a maze with empty spaces (represented as 0) and walls (repr
//esented as 1). The ball can go through the empty spaces by rolling up, down, lef
//t or right, but it won't stop rolling until hitting a wall. When the ball stops,
// it could choose the next direction. 
//
// Given the m x n maze, the ball's start position and the destination, where st
//art = [startrow, startcol] and destination = [destinationrow, destinationcol], r
//eturn true if the ball can stop at the destination, otherwise return false. 
//
// You may assume that the borders of the maze are all walls (see examples). 
//
// 
// Example 1: 
//
// 
//Input: maze = [[0,0,1,0,0],[0,0,0,0,0],[0,0,0,1,0],[1,1,0,1,1],[0,0,0,0,0]], s
//tart = [0,4], destination = [4,4]
//Output: true
//Explanation: One possible way is : left -> down -> left -> down -> right -> do
//wn -> right.
// 
//
// Example 2: 
//
// 
//Input: maze = [[0,0,1,0,0],[0,0,0,0,0],[0,0,0,1,0],[1,1,0,1,1],[0,0,0,0,0]], s
//tart = [0,4], destination = [3,2]
//Output: false
//Explanation: There is no way for the ball to stop at the destination. Notice t
//hat you can pass through the destination but you cannot stop there.
// 
//
// Example 3: 
//
// 
//Input: maze = [[0,0,0,0,0],[1,1,0,0,1],[0,0,0,0,0],[0,1,0,0,1],[0,1,0,0,0]], s
//tart = [4,3], destination = [0,1]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == maze.length 
// n == maze[i].length 
// 1 <= m, n <= 100 
// maze[i][j] is 0 or 1. 
// start.length == 2 
// destination.length == 2 
// 0 <= startrow, destinationrow <= m 
// 0 <= startcol, destinationcol <= n 
// Both the ball and the destination exist in an empty space, and they will not 
//be in the same position initially. 
// The maze contains at least 2 empty spaces. 
// 
// Related Topics Depth-First Search Breadth-First Search Graph 
// 👍 1129 👎 126


package com.songlunzhao.leetcode.editor.en;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TheMaze_490 {


    @Test
    public void testTheMaze() {
        Solution solution = new TheMaze_490()
                .new Solution();
        int[][] maze = new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };
        int[] start = new int[]{0, 4};
        int[] dest = new int[]{1, 1};
        assertEquals(solution.hasPath(maze, start, dest), false);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //ball can only roll to one direction until hit wall,
        //so use dfs not backtrack
        public boolean hasPath(int[][] maze, int[] start, int[] destination) {
            boolean[][] visited = new boolean[maze.length][maze[0].length];
            if (maze[destination[0]][destination[1]] == 1) return false;
            return dfs(maze, visited, start, destination);
        }

        /**
         * the ball has to STOP at the destination, that mean the destination
         * has to be 0 and next to a wall (to make the ball stop)
         * @param maze
         * @param visited
         * @param start
         * @param dest
         * @return
         */
        private boolean dfs(int[][] maze, boolean[][]visited, int[] start, int[] dest) {
            if(visited[start[0]][start[1]]) return false;
            if(start[0]==dest[0] && start[1]==dest[1]) return true;
            visited[start[0]][start[1]]=true;
            int up=start[0]-1, down=start[0]+1, left=start[1]-1, right=start[1]+1;
            //roll right until hit wall
            while(right<maze[0].length && maze[start[0]][right]==0)
                right++;
            if(dfs(maze,visited,new int[]{start[0], right-1}, dest))
                return true;
            while (left >= 0 && maze[start[0]][left] == 0) //left
                left--;
            if (dfs(maze, visited, new int[] {start[0], left + 1}, dest))
                return true;
            while (up >= 0 && maze[up][start[1]] == 0) //up
                up--;
            if (dfs(maze, visited, new int[] {up + 1, start[1]}, dest))
                return true;
            while (down < maze.length && maze[down][start[1]] == 0) //down
                down++;
            if (dfs(maze, visited, new int[] {down - 1, start[1]}, dest))
                return true;
            return false;
        }

        /**
         * back track does not work for this question because the ball
         *  -- won't stop rolling until hitting a wall
         * @param maze
         * @param visited
         * @param row
         * @param col
         * @param dest
         * @return
         */
        private boolean backTrack(int[][] maze, boolean[][] visited, int row, int col, int[] dest) {
            if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) return false;
            if (visited[row][col] || maze[row][col] == 1) {
                return false;
            }
            if (row == dest[0] && col == dest[1]) return true;
            visited[row][col] = true;
            int[][] dirs = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (backTrack(maze, visited, newRow, newCol, dest)) {
                    return true;
                }
            }
            visited[row][col] = false;
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
