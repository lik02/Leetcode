import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Q909SnakesAndLadder {
    public int snakesAndLadders(int[][] board) {
        int start = 1;
        int end = (int)Math.pow(board.length, 2);
        int action = 1;
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                int hold = queue.poll();
                if (visited.contains(hold)) {
                    continue;
                }
                visited.add(hold);
                for (int j = 1; j <= 6; j++) {
                    Integer[] res = jump(board, hold + j);
                    int pos = hold + j;
                    if (board[res[0]][res[1]] != -1) {
                        pos = board[res[0]][res[1]];
                    }
                    queue.add(pos);
                    if (pos == end) {
                        return action;
                    }
                }
            }
            action++;
        }
        return -1;
    }

    // public static Integer[] move(int[][] board, int r, int c, int steps) {
    //     if (c < 0 || c > board[r].length - 1) {
    //         if (c > 0) {
    //             c--;
    //         }
    //         else {
    //             c++;
    //         }
    //         return move(board, r - 1, c, steps);
    //     }
    //     if (steps == 0) {
    //         Integer[] pos = {r, c};
    //         return pos;
    //     }
    //     else if ((board.length - r) % 2 == 1) {
    //         return move(board, r, c + 1, steps - 1);
    //     }
    //     else {
    //         return move(board, r, c - 1, steps - 1);
    //     }
    // }

    public Integer[] jump(int[][] board, int position) {
        int r, c;
        if (position % board.length == 0) {
            r = board.length - (position / board.length);
        }
        else {
            r = board.length - (position / board.length) - 1;
        }
        int steps = position - ((board.length - 1 - r) * board.length);
        steps--;
        if ((board.length - r) % 2 == 1) {
            c = 0;
            c += steps;
        }
        else {
            c = board.length - 1;
            c -= steps;
        }
        Integer[] res = {r, c};
        return res;
    }
}
