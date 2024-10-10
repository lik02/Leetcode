import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Q77Combinations {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        combine(1, n, k, new Integer[k], 0);
        return res;
    }

    public void combine(Integer start, Integer end, Integer k, Integer[] nums, int index) {
        if (index == k) {
            List<Integer> list = new ArrayList<>(Arrays.asList(nums));
            res.add(list);
            return;
        }
        for (int i = start; i <= end; i++) {
            nums[index] = i;
            combine(i + 1, end, k, nums, index + 1);
        }
    }
}
