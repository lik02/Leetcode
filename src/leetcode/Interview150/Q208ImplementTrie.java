import java.util.HashMap;

public class Q208ImplementTrie {
    Node root;

    public Q208ImplementTrie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            String str = word.substring(i, i + 1);
            current.children.putIfAbsent(str, new Node());
            current = current.children.get(str);
        }
        current.end = true;
    }
    
    public boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            String str = word.substring(i, i + 1);
            if (!current.children.containsKey(str)) {
                return false;
            }
            current = current.children.get(str);
        }
        return current.end;
    }
    
    public boolean startsWith(String prefix) {
        Node current = root;
        for (int i = 0; i < prefix.length(); i++) {
            String str = prefix.substring(i, i + 1);
            if (!current.children.containsKey(str)) {
                return false;
            }
            current = current.children.get(str);
        }
        return true;
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