package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        int row = grid.length;
        if (row == 0) {
            return 0;
        }

        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    // rotten
                    queue.add(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0], curY = cur[1];

            for (int[] d : directions) {
                int newX = curX + d[0];
                int newY = curY + d[1];
                if (newX >= 0 && newX < row && newY >= 0 && newY < col && grid[newX][newY] == 1) {
                    grid[newX][newY] = grid[curX][curY] + 1;
                    queue.add(new int[]{newX, newY});
                }
            }
        }

        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                res = Math.max(res, grid[i][j]);
            }
        }

        return res >= 2 ? res - 2 : 0;
    }
}
