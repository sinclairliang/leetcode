package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    /*
      Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

      A region is captured by flipping all 'O's into 'X's in that surrounded region.

      Example:

      X X X X
      X O O X
      X X O X
      X O X X
      After running your function, the board should be:

      X X X X
      X X X X
      X X X X
      X O X X
      Explanation:

      Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not
      flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be
      flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
     */

    public void BFSsolve(char[][] board) {
        int row = board.length;
        if (row == 0) {
            return;
        }

        int col = board[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i > 0 && i < row - 1) && (j > 0 && j < col - 1)) {
                    continue;
                }
                if (board[i][j] == '0') {
                    queue.add(new int[]{i, j});
                    board[i][j] = '.';
                }
            }
        }


        while (!queue.isEmpty()) {
            int size = queue.size();

        }
    }
}
