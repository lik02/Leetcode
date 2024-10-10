package leetcode.Interview150;

import java.util.HashMap;

public class Q211DesignAddAndSearchWordsDataStructure {
    Node root;

    public Q211DesignAddAndSearchWordsDataStructure() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            String str = word.substring(i, i + 1);
            cur.children.putIfAbsent(str, new Node());
            cur = cur.children.get(str);
        }
        cur.end = true;
    }
    
    public boolean search(String word) {
        return dfs(word, root);
    }

    public boolean dfs(String word, Node root) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            String str = word.substring(i, i + 1);
            if (str.equals(".")) {
                for (int j = 0; j < cur.children.values().size(); j++) {
                    if (dfs(word.substring(i + 1), (Node)cur.children.values().toArray()[j])) {
                        return true;
                    }
                }
                return false;
            }
            else {
                if (!cur.children.containsKey(str)) {
                    return false;
                }
                cur = cur.children.get(str);
            }
        }
        return cur.end;
    }
}

class Node {
    HashMap<String, Node> children;
    boolean end;

    public Node() {
        children = new HashMap<>();
        end = false;
    }
}