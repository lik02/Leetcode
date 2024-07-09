package leetcode;

import java.util.HashMap;
import java.util.Random;

public class Q2285MaximumTotalImportanceOfRoad {
public static void main(String[] args) {
    int[][] arr = {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
    System.out.println(maximumImportance(5, arr));;
}

    public static long maximumImportance(int n, int[][] roads) {
        HashMap<Integer, Integer> city = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ) {

            }
            
            if (city.values().contains(value)) {
                i--;
                continue;
            }
            city.put(i, value);
        }
        for (int i = 0; i < roads.length; i++) {
            sum += city.get(roads[i][0]) + city.get(roads[i][1]);
        }
        return sum;
    }
}
