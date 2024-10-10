import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

public class Q322CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int res = 2;
        for (int i: coins) {
            if (i == amount) {
                return 1;
            }
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                int hold = queue.poll();
                if (visited.contains(hold)) {
                    continue;
                }
                visited.add(hold);
                for (int coin: coins) {
                    int sum = hold + coin;
                    if (sum > amount) {
                        continue;
                    }
                    queue.offer(sum);
                    if (sum == amount) {
                        return res;
                    }
                }
            }
            res++;
        }
        return -1;
    }
}
