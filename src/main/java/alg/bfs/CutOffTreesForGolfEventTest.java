package alg.bfs;

import java.util.*;

public class CutOffTreesForGolfEventTest {

    public int cutOffTrees(List<List<Integer>> forest) {
        //list store all trees, tree[3]=new int[]{treeHeight, row, column}
        List<int[]> trees = new ArrayList<>();
        for (int r = 0; r < forest.size(); r++) {
            for (int c = 0; c < forest.get(r).size(); c++) {
                //go through the forest, find all trees
                if (forest.get(r).get(c) > 1) {
                    trees.add(new int[]{forest.get(r).get(c), r, c});
                }

            }
        }

        //sort trees by height
        Collections.sort(trees, (a, b) -> Integer.compare(a[0], b[0]));

        int ans = 0, sr = 0, sc = 0;
        //go from one tree to another tree until all trees are reached
        //calculate distance O(row*column)^2
        for (int[] tree : trees) {
            int d = dist(forest, sr, sc, tree[1], tree[2]);
            if (d < 0) return -1;
            ans = ans + d;
            sr = tree[1];
            sc = tree[2];
        }
        return ans; //return the total distance from lowest tree to highest tree
    }

    /**
     * calculate distance (steps) from source tree to target tree
     * if there is no path between 2 trees, return -1
     * <p>
     * algorithm: use BFS
     * forest[i][j]=0 obstacle =1 ground >1 tree
     * @param forest
     * @param sourceRow
     * @param sourceColumn
     * @param targetRow
     * @param targetColumn
     * @return
     *
     * O(row*column)
     */

    int dist(List<List<Integer>> forest, int sourceRow, int sourceColumn,
             int targetRow, int targetColumn) {
        int maxRow = forest.size(), maxColumn = forest.get(0).size();
        //a map saved the points we already reached
        boolean[][] seen = new boolean[maxRow][maxColumn];
        seen[sourceRow][sourceColumn] = true; //reached source point
        //int[3]{sourceRow, sourceColumn, distanceToSource}
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sourceRow, sourceColumn, 0});
        int[] dr = new int[]{-1, 1, 0, 0};//move to next row in matrix
        int[] dc = new int[]{0, 0, -1, 1};//move to next column in matrix

        //go through matrix using BFS
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[0] == targetRow && current[1] == targetColumn) {
                //reached target tree, return distance
                return current[2];
            }
            for (int i = 0; i < 4; i++) {
                int nextRow = current[0] + dr[i];
                int nextColumn = current[1] + dc[i];
                if (nextRow >= 0 && nextRow < maxRow //next point within matrix
                        && nextColumn >= 0 && nextColumn < maxColumn
                        && !seen[nextRow][nextColumn] //next point is not reached
                        && forest.get(nextRow).get(nextColumn)>0 //next point is not obstacle
                ) {
                        seen[nextRow][nextColumn]=true;
                        queue.add(new int[]{nextRow,nextColumn, current[2]+1});
                }
            }

        }

        return -1; //cannot reach the target tree
    }

}
