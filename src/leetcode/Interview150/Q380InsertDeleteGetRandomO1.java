package leetcode.Interview150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Q380InsertDeleteGetRandomO1 {
    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.insert(1));
        System.out.println(set.remove(2));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
        System.out.println(set.remove(1));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
    }
}

class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.get(val);
            map.put(list.get(list.size() - 1), index);
            map.remove(val);
            list.set(index, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Random r = new Random();
        return list.get(r.nextInt(list.size()) + 0);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */