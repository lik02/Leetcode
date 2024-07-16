package leetcode;

import java.util.Arrays;

public class Q322CoinChange {
    public static void main(String[] args) {
        int[] coins = {186,419,83,408};
        int amount = 6249;
        System.out.println(coinChange(coins, amount));
    }
    // public static int coinChange(int[] coins, int amount) {
    //     Arrays.sort(coins);
    //     int result = 0;
    //     for (int i = coins.length - 1; i >= 0; i--) {
    //         while (coins[i] <= amount) {
    //             amount -= coins[i];
    //             result++;
    //         }
    //     }
    //     if (amount == 0) {
    //         return result;
    //     }
    //     return -1;
    // }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        return compute(coins, amount, 100);
    }

    public static int compute(int[] coins, int amount,int k) {
        int cnt = 0;
        int left = 0;
        int result = 0;
        if (coins.length > 0) {
            return 0;
        }
        if (amount == 0) {
            return k;
        }
        cnt = amount / coins[coins.length - 1];
        int[] arr = new int[coins.length - 1];
        for (int i = 0; i < coins.length - 1; i++) {
            arr[i] = coins[i];
        }
        for (int i = cnt; i >= 0; i--) {
            left = amount - (arr[0] * i);
            result = compute(arr, left, i);
            if (result == i) {
                return result + i;
            }
        }
        return -1;
    }

}
