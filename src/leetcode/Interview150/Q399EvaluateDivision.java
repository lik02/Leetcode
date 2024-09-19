package leetcode.Interview150;

import java.util.*;

public class Q399EvaluateDivision {
    static HashMap<String, Node> map = new HashMap<>();

    public static void main(String[] args) {
        List<List<String>> equation = new ArrayList<List<String>>();
        double[] values = {3.0,4.0,5.0,6.0};
        List<List<String>> queries = new ArrayList<List<String>>();

        List<String> list = new ArrayList<>();
        list.add("x1");
        list.add("x2");
        equation.add(list);

        List<String> list1 = new ArrayList<>();
        list1.add("x2");
        list1.add("x3");
        equation.add(list1);
        
        List<String> list2 = new ArrayList<>();
        list2.add("x3");
        list2.add("x4");
        equation.add(list2);
        
        List<String> list3 = new ArrayList<>();
        list3.add("x4");
        list3.add("x5");
        equation.add(list3);

        List<String> q = new ArrayList<>();
        q.add("x1");
        q.add("x5");
        queries.add(q);
        
        List<String> q1 = new ArrayList<>();
        q1.add("x5");
        q1.add("x2");
        queries.add(q1);
        
        List<String> q2 = new ArrayList<>();
        q2.add("x2");
        q2.add("x4");
        queries.add(q2);
        
        List<String> q3 = new ArrayList<>();
        q3.add("x2");
        q3.add("x2");
        queries.add(q3);

        double[] ans = calcEquation(equation, values, queries);
        System.out.println(ans[2]);
    }

    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] ans = new double[queries.size()];
        for (int i = 0; i < equations.size(); i++) {
            String current1 = equations.get(i).get(0);
            String current2 = equations.get(i).get(1);
            map.putIfAbsent(current1, new Node(current1));
            map.putIfAbsent(current2, new Node(current2));
            map.get(current1).neighbors.add(map.get(current2));
            map.get(current1).values.put(map.get(current2), values[i]);
            map.get(current2).neighbors.add(map.get(current1));
            map.get(current2).values.put(map.get(current1), 1 / values[i]);
        }

        for (int i = 0; i < queries.size(); i++) {
           if (!map.containsKey(queries.get(i).get(0)) || !map.containsKey(queries.get(i).get(1))) {// elements don't exist
                ans[i] = -1;
                continue;
            }
            dfs(map.get(queries.get(i).get(0)), map.get(queries.get(i).get(1)), i, ans, new HashSet<>());
            if (ans[i] == 0) {//like case a-b c-d, find a-c
                ans[i] = -1;
            }
        }
        return ans;
    }

    public static boolean dfs(Node start, Node dest, int i, double[] ans, HashSet<Node> visited) {
        if (visited.contains(start)) {
            return false;
        }
        visited.add(start);
        if (start == dest) {
            ans[i] = 1;
            return true; 
        }
        for (int j = 0; j < start.neighbors.size(); j++) {
            if (dfs(start.neighbors.get(j), dest, i, ans, visited)) {
                ans[i] *= start.values.get(start.neighbors.get(j));
                return true;
            }
        }
        return false;// avoid like a-b b-c c-d and we want to find b-d, when we loop b.neighbors we will get a first and after the a's loop it will return true and give wrong ans
    }
}

class Node {
    String name;
    ArrayList<Node> neighbors;
    HashMap<Node, Double> values;

    Node(String name) {
        this.name = name;
        neighbors = new ArrayList<>();
        values = new HashMap<>();
    }
}