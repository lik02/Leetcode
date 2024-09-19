package leetcode.Interview150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q133CloneGraph {
    HashMap<Integer, Node> map = new HashMap<>();
    HashSet<Node> visited = new HashSet<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (visited.contains(map.get(node.val))) {
            return node;
        }
        map.putIfAbsent(node.val, new Node(node.val));
        visited.add(map.get(node.val));
        for (int i = 0; i < node.neighbors.size(); i++) {
            map.putIfAbsent(node.neighbors.get(i).val, new Node(node.neighbors.get(i).val));
            map.get(node.val).neighbors.add(map.get(node.neighbors.get(i).val));
        }
        for (int i = 0; i < node.neighbors.size(); i++) {
            cloneGraph(node.neighbors.get(i));
        }
        return map.get(node.val);
    }
}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
} 