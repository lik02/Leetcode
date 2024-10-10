package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q46Permutations {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        Integer[] num = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i];
        }
        permute(new Integer[num.length], num, 0);
        return res;
    }

    public void permute(Integer[] ans, Integer[] old, int index) {
        if (index == ans.length) {
            List<Integer> list = new ArrayList<>(Arrays.asList(ans));
            res.add(list);
            return;
        }
        for (int i = 0; i < old.length; i++) {
            ans[index] = old[i]; 
            Integer[] copy = new Integer[old.length - 1];
            System.arraycopy(old, 0, copy, 0, i);
            System.arraycopy(old, i + 1, copy, i, old.length - 1 - i);
            permute(ans, copy, index + 1);
        }
    }
}
