package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Q39CombinationSum {
    List<List<Integer>> res = new ArrayList<>();
    HashSet<String> set = new HashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        compute(candidates, target, new ArrayList<>(), 0);
        return res;
    }

    public void compute(int[] candidates, int target, ArrayList<Integer> ans, int total) {
        if (total == target) {
            List<Integer> list = (ArrayList<Integer>)ans.clone();
            Collections.sort(list);
            if (set.contains(list.toString())) {
                return;
            }
            set.add(list.toString());
            res.add(list);
            return;
        }
        else if (total > target) {
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            total += candidates[i];
            ans.add(candidates[i]);
            compute(candidates, target, ans, total);
            total -= candidates[i];
            ans.remove(ans.size() - 1);
        }
    }
}
