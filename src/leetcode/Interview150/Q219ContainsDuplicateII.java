package leetcode.Interview150;

import java.util.HashMap;

public class Q219ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
                else {// case like 1,0,1,1
                    map.put(nums[i], i);
                }
            }
            else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
