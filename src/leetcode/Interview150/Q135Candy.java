package leetcode.Interview150;

public class Q135Candy {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        int res = 0;
        candy[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            candy[i] = 1;
            if (ratings[i - 1] < ratings[i]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);// use max for case like 1 2 3 1 2, after first loop the 3 get 3 candies, if max is not use, it will become 2 candy
            }
        }
        for (int i: candy) {
            res += i;
        }
        return res;
    }
}
