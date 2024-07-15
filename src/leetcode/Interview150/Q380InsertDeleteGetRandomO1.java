package leetcode.Interview150;

import java.util.Random;

public class Q380InsertDeleteGetRandomO1 {

}

class RandomizedSet {
    int[][] nums;
    int size;

    public RandomizedSet() {
        Random r = new Random();
        nums = new int[r.nextInt(10) + 1][0];
        size = 0;
    }
    
    public boolean insert(int val) {
        // if (size < nums.length) {
        //     nums[size][0] = val;
        //     size++;
        //     return true;
        // }
        // else {
        //     return false;
        // }
    }
    
    public boolean remove(int val) {
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                nums[i][0] = 0;
                size--;
                return true;
            }
            else {
                nums[i][0] = nums[size - 1][0];
                size--;
                return true;
            }
        }
        return false;
    }
    
    public int getRandom() {
        Random r = new Random();
        int select = r.nextInt(size);
        return nums[select][0];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */