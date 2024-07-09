package leetcode.Interview150;

public class Q122BestTimeToBuyStockAndSellStockII {
    public static int maxProfit(int[] prices) {
        int hold = prices[0];
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < hold) {
                hold = prices[i];
            }
            else {
                result += prices[i] - hold;
                hold = prices[i];
            }
        }
        return result;
    }
}

// use 1 5 4 3 case to think
// 1 2 3 == 1 3 